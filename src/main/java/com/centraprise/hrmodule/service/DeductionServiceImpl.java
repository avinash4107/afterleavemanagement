package com.centraprise.hrmodule.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centraprise.hrmodule.entity.DeductionInfo;
import com.centraprise.hrmodule.exception.DatabaseException;
import com.centraprise.hrmodule.model.DeductionCommand;
import com.centraprise.hrmodule.repository.DeductionRepository;

@Service
public class DeductionServiceImpl implements DeductionService {

	@Autowired
	private DeductionRepository deductionRepository;

	@Override
	public void saveDeduction(DeductionCommand deductionCommand) {
		try {
			DeductionInfo deductionInfo = new DeductionInfo();
			BeanUtils.copyProperties(deductionCommand, deductionInfo);
			deductionInfo.setEmployeenumber(Integer.parseInt(deductionCommand.getEmployeeNumber()));
			System.out.println(deductionInfo);
			deductionRepository.save(deductionInfo);
		} catch (Exception e) {
			throw new DatabaseException("Database is down");
		}
	}

}
