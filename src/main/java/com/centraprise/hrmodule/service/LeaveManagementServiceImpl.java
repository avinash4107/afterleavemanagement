package com.centraprise.hrmodule.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centraprise.hrmodule.entity.EmployeeDetails;
import com.centraprise.hrmodule.entity.ManageLeave;
import com.centraprise.hrmodule.entity.MonthLeave;
import com.centraprise.hrmodule.exception.CentrapriseException;
import com.centraprise.hrmodule.model.FinalSalaryInfoDTO;
import com.centraprise.hrmodule.model.LeaveForm;
import com.centraprise.hrmodule.model.LeavesInfoDTO;
import com.centraprise.hrmodule.repository.EmployeeRepository;
import com.centraprise.hrmodule.repository.LeaveManagementRepository;

@Service
public class LeaveManagementServiceImpl implements LeaveManagementService {

	@Autowired
	private LeaveManagementRepository leaveManagementRepository;

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<LeavesInfoDTO> getLeavesInfo() {
		List<LeavesInfoDTO> infoDtos = new ArrayList<LeavesInfoDTO>();
		try {
			List<ManageLeave> manageLeave = leaveManagementRepository.findAll();
			LeavesInfoDTO dto = null;
			if (manageLeave != null) {
				int i = 1;
				for (ManageLeave leave : manageLeave) {
					for (MonthLeave monthlyLeaves : leave.getMonthLeavesInfo()) {
						dto = new LeavesInfoDTO();
						dto.setId(i++);
						dto.setEmployeeNumber(leave.getEmployeeNumber());
						dto.setLeaveEndDate(monthlyLeaves.getLeaveEndDate());
						dto.setLeaveStartDate(monthlyLeaves.getLeaveStartDate());
						dto.setLeaveType(monthlyLeaves.getLeaveType());
						dto.setMonth(monthlyLeaves.getMonth());
						dto.setNumberOfdays(monthlyLeaves.getNumberOfDaysLeave());
						infoDtos.add(dto);
					}
				}
			} else {
				infoDtos.add(new LeavesInfoDTO());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return infoDtos;
	}

	@Override
	@Transactional
	public void insertEmployeeLeavesDetails(LeaveForm leaveForm) {

		try {

			ManageLeave leave = leaveManagementRepository
					.findByEmployeeNumber(Integer.parseInt(leaveForm.getEmployeenumber()));

			if (leave != null) {
				leave.setEmployeeNumber(Integer.parseInt(leaveForm.getEmployeenumber()));
				Set<MonthLeave> monthleave = leave.getMonthLeavesInfo();
				MonthLeave mon = new MonthLeave();
				mon.setMonth(leaveForm.getMonth_list());
				mon.setNumberOfDaysLeave(Float.parseFloat(leaveForm.getNumberofdays()));
				mon.setLeaveEndDate(leaveForm.getEndDate());
				mon.setLeaveStartDate(leaveForm.getStartDate());
				mon.setLeaveType(leaveForm.getLeaveType());
				mon.setManageLeave(leave);
				monthleave.add(mon);
				leave.setMonthLeavesInfo(monthleave);
				// leaveManagementRepository.getOne(man);
				em.merge(leave);
			} else {
				ManageLeave manageLeave = new ManageLeave();
				manageLeave.setEmployeeNumber(Integer.parseInt(leaveForm.getEmployeenumber()));
				Set<MonthLeave> monthLeave = new HashSet<>();
				MonthLeave mLeave = new MonthLeave();
				mLeave.setMonth(leaveForm.getMonth_list());
				mLeave.setLeaveEndDate(leaveForm.getEndDate());
				mLeave.setLeaveStartDate(leaveForm.getStartDate());
				mLeave.setLeaveType(leaveForm.getLeaveType());
				mLeave.setManageLeave(manageLeave);
				monthLeave.add(mLeave);
				try {
					mLeave.setNumberOfDaysLeave(Float.parseFloat(leaveForm.getNumberofdays()));
				} catch (Exception e) {
					e.printStackTrace();
				}
				manageLeave.setMonthLeavesInfo(monthLeave);
				// leaveManagementRepository.save(manageLeave);
				em.persist(manageLeave);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Integer> getEmployeeList() {
		try {
			List<EmployeeDetails> details = employeeRepository.findByEmployeeActive(true);
			List<Integer> employeeNumbers = new ArrayList<>();
			if (details != null) {
				for (EmployeeDetails det : details) {
					employeeNumbers.add(det.getEmployeeNumber());
				}
				return employeeNumbers;
			} else {
				return employeeNumbers;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new CentrapriseException("Database is down");
		}
	}

	@Override
	public List<FinalSalaryInfoDTO> getFinalSaloryInfo() {
		try {
			List<ManageLeave> manageLeave = leaveManagementRepository.findAll();
			List<FinalSalaryInfoDTO> finalDto = new ArrayList<FinalSalaryInfoDTO>();
			if (manageLeave != null) {
				int i = 1;
				float creditedLeaves = 22;
				float usedLeaves = 0;
				for (ManageLeave manage : manageLeave) {
					FinalSalaryInfoDTO infoDTO = new FinalSalaryInfoDTO();
					infoDTO.setEmployeeNumber(manage.getEmployeeNumber());
					infoDTO.setId(i++);
					infoDTO.setYear(2019);
					for (MonthLeave leave : manage.getMonthLeavesInfo()) {
						usedLeaves = usedLeaves + leave.getNumberOfDaysLeave();
					}
					float balanceLeaves = 0;
					boolean flag = false;
					if (creditedLeaves < usedLeaves) {
						balanceLeaves = usedLeaves - creditedLeaves;
						flag = true;
					} else {
						balanceLeaves = creditedLeaves - usedLeaves;
					}
					infoDTO.setCreditedLeavs(creditedLeaves);
					infoDTO.setAvailed(usedLeaves);
					infoDTO.setBalance(balanceLeaves);
					if (flag) {
						infoDTO.setLossOfPay(balanceLeaves);
					} else {
						infoDTO.setLossOfPay(0);
					}
					finalDto.add(infoDTO);
				}
			}

			return finalDto;

		} catch (Exception e) {
			e.printStackTrace();
			throw new CentrapriseException("Database is down");
		}
	}
}
