package com.centraprise.hrmodule.service;

import java.util.List;

import com.centraprise.hrmodule.model.SaloryCommand;
import com.centraprise.hrmodule.model.SaloryInfoListDTO;

public interface SalaryService {
	void saveSaloryInfo(SaloryCommand saloryCommand);

	List<SaloryInfoListDTO> getSaloryInfoList();
}
