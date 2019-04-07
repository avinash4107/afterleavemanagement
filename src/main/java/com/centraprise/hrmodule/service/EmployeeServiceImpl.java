package com.centraprise.hrmodule.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.centraprise.hrmodule.entity.AssignmentInformation;
import com.centraprise.hrmodule.entity.BankInformation;
import com.centraprise.hrmodule.entity.EmployeeAddress;
import com.centraprise.hrmodule.entity.EmployeeDetails;
import com.centraprise.hrmodule.entity.ProvidentFundInformation;
import com.centraprise.hrmodule.exception.DatabaseException;
import com.centraprise.hrmodule.model.EmployeeCommand;
import com.centraprise.hrmodule.model.EmployeeInfoListDTO;
import com.centraprise.hrmodule.model.EmployeeListDTO;
import com.centraprise.hrmodule.repository.EmployeeRepository;

@Service
//@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<EmployeeListDTO> getEmployeesList() {
		List<EmployeeDetails> employeeDetails = null;
		List<EmployeeListDTO> employeeListDTOs = new ArrayList<EmployeeListDTO>();
		try {
			employeeDetails = employeeRepository.findByEmployeeActive(true);
			if (employeeListDTOs != null) {
				int i = 1;
				for (EmployeeDetails empDetais : employeeDetails) {
					EmployeeListDTO dto = new EmployeeListDTO();
					dto.setId(i++);
					dto.setPrimaryEmployeeId(empDetais.getEmpId());
					dto.setPanNumber(empDetais.getPanNumber());
					dto.setEmployeeId(empDetais.getEmployeeNumber());
					for (AssignmentInformation info : empDetais.getAssignmentInfo()) {
						dto.setJoiningDate(info.getDateOfJoining());
					}
					dto.setName(empDetais.getEmployeeName());
					employeeListDTOs.add(dto);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new DatabaseException("Datebase is Down");
		}
		return employeeListDTOs;
	}

	@Override

	public void saveEmployee(EmployeeCommand employeeDetails) {
		try {
			EmployeeDetails empDetails = new EmployeeDetails();
			EmployeeAddress address = new EmployeeAddress();
			AssignmentInformation assignmentInfo = new AssignmentInformation();
			BankInformation bankInfo = new BankInformation();
			ProvidentFundInformation providentInfo = new ProvidentFundInformation();
			Set<AssignmentInformation> infos = new HashSet<>();
			Set<EmployeeAddress> empaddress = new HashSet<>();
			Set<ProvidentFundInformation> fundinfos = new HashSet<ProvidentFundInformation>();
			Set<BankInformation> bankInfos = new HashSet<BankInformation>();
			try {
				System.out.println("here ok");
				empDetails.setEmployeeNumber(employeeDetails.getEmployeenumber());
				empDetails.setEmployeeName(employeeDetails.getName());
				empDetails.setSex(employeeDetails.getGender());
				empDetails.setDateOfBirth(employeeDetails.getBday());
				empDetails.setPanNumber(employeeDetails.getPan());
				empDetails.setMaritalStatus(employeeDetails.getMaritalstatus());
				empDetails.setEmailAddress(employeeDetails.getEmail());
				empDetails.setPhoneNumber(employeeDetails.getPhone());
				empDetails.setPassword(employeeDetails.getPassword());
				empDetails.setEmployeeActive(true);
				address.setFlatNumber(employeeDetails.getDoornum());
				address.setVillage(employeeDetails.getVlg());
				address.setMandal(employeeDetails.getMandal());
				address.setCountry(employeeDetails.getCountry());
				address.setState(employeeDetails.getState());
				address.setDistrict(employeeDetails.getDistrict());
				address.setPincode(Integer.parseInt(employeeDetails.getPin()));
				address.setEmployeeDetails(empDetails);
				empaddress.add(address);
				empDetails.setAddress(empaddress);

				assignmentInfo.setAssignmentEndDate(employeeDetails.getEndDate());
				assignmentInfo.setAssignmentStartDate(employeeDetails.getStartdate());
				assignmentInfo.setDateOfJoining(employeeDetails.getJoindate());
				assignmentInfo.setJob(employeeDetails.getJob());
				assignmentInfo.setManager(employeeDetails.getManager());
				assignmentInfo.setYearsOfService(employeeDetails.getService());
				assignmentInfo.setEmployeeDetails(empDetails);
				infos.add(assignmentInfo);
				empDetails.setAssignmentInfo(infos);

				bankInfo.setAccountNumber(employeeDetails.getAccountnumber());
				bankInfo.setBankName(employeeDetails.getBankname());
				bankInfo.setIfscCode(employeeDetails.getIfsc());
				bankInfo.setEmployeeDetails(empDetails);
				bankInfos.add(bankInfo);
				empDetails.setBankInfo(bankInfos);

				providentInfo.setUanNumber(employeeDetails.getUan());
				providentInfo.setAdharNumber(employeeDetails.getAdhar());
				providentInfo.setPrevoiusEmployee(employeeDetails.getPreviousemp());
				providentInfo.setDateOfLeaving(employeeDetails.getPreviousempleavingdate());
				providentInfo.setStartDate(employeeDetails.getPreviousempstartdate());
				providentInfo.setEndDate(employeeDetails.getPreviousempenddate());
				fundinfos.add(providentInfo);
				empDetails.setProvidentInfo(fundinfos);
				providentInfo.setEmployeeDetails(empDetails);
				employeeRepository.save(empDetails);
			} catch (Exception e) {
				throw new DatabaseException("Parsing exception miss match in data types");
			}

		} catch (DatabaseException e) {
			e.printStackTrace();
			throw new DatabaseException("Datebase is Down");
		}
	}

	@Override
	public EmployeeInfoListDTO getEmployeeById(int employeenumber) {
		EmployeeDetails employeeDetails = null;
		EmployeeInfoListDTO dtos = new EmployeeInfoListDTO();
		try {
			employeeDetails = employeeRepository.findByEmpIdAndEmployeeActive(employeenumber, true);
			System.out.println(employeeDetails);
			dtos.setEmployeenumber(employeeDetails.getEmployeeNumber());
			dtos.setName(employeeDetails.getEmployeeName());
			dtos.setEmpId(employeeDetails.getEmpId());
			dtos.setGender(employeeDetails.getSex());
			dtos.setBday(employeeDetails.getDateOfBirth());
			dtos.setPan(employeeDetails.getPanNumber());
			dtos.setMaritalstatus(employeeDetails.getMaritalStatus());
			dtos.setEmail(employeeDetails.getEmailAddress());
			dtos.setPhone(employeeDetails.getPhoneNumber());
			dtos.setPassword(employeeDetails.getPassword());
			if (employeeDetails.getAddress() != null) {
				for (EmployeeAddress add : employeeDetails.getAddress()) {
					dtos.setDoornum(add.getFlatNumber());
					dtos.setVlg(add.getVillage());
					dtos.setState(add.getState());
					dtos.setMandal(add.getMandal());
					dtos.setDistrict(add.getDistrict());
					dtos.setCountry(add.getCountry());
					dtos.setPin(String.valueOf(add.getPincode()));
				}
			}
			if (employeeDetails.getAssignmentInfo() != null) {
				for (AssignmentInformation assignInfo : employeeDetails.getAssignmentInfo()) {
					dtos.setStartdate(assignInfo.getAssignmentStartDate());
					dtos.setEndDate(assignInfo.getAssignmentEndDate());
					dtos.setJob(assignInfo.getJob());
					dtos.setJoindate(assignInfo.getDateOfJoining());
					dtos.setService(String.valueOf(assignInfo.getYearsOfService()));
					dtos.setManager(assignInfo.getManager());
				}
			}
			if (employeeDetails.getBankInfo() != null) {
				for (BankInformation bankInfo : employeeDetails.getBankInfo()) {
					dtos.setAccountnumber(bankInfo.getAccountNumber());
					dtos.setBankname(bankInfo.getBankName());
					dtos.setIfsc(bankInfo.getIfscCode());
				}
			}
			if (employeeDetails.getProvidentInfo() != null) {
				for (ProvidentFundInformation proviInformation : employeeDetails.getProvidentInfo()) {
					dtos.setUan(proviInformation.getUanNumber());
					dtos.setAdhar(proviInformation.getAdharNumber());
					dtos.setPreviousemp(proviInformation.getPrevoiusEmployee());
					dtos.setPreviousempleavingdate(proviInformation.getDateOfLeaving());
					dtos.setPreviousempstartdate(proviInformation.getStartDate());
					dtos.setPreviousempenddate(proviInformation.getEndDate());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new DatabaseException("Datebase is Down");
		}
		return dtos;
	}

	@Override
	@Transactional
	// @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	// @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	// @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor =
	// Exception.class, readOnly = false)
	public void updateEmployee(EmployeeCommand employeeCommand) throws Exception {

		try {
			EmployeeDetails employeeDetails = employeeRepository
					.findByEmpIdAndEmployeeActive(employeeCommand.getEmpId(), true);
			if (employeeCommand.getEmployeenumber() != 0) {
				employeeDetails.setEmployeeNumber(employeeCommand.getEmployeenumber());
			}
			employeeDetails.setEmployeeName(employeeCommand.getName());
			employeeDetails.setSex(employeeCommand.getGender());
			employeeDetails.setDateOfBirth(employeeCommand.getBday());
			employeeDetails.setPanNumber(employeeCommand.getPan());
			employeeDetails.setMaritalStatus(employeeCommand.getMaritalstatus());
			employeeDetails.setEmailAddress(employeeCommand.getEmail());
			employeeDetails.setPhoneNumber(employeeCommand.getPhone());
			employeeDetails.setPassword(employeeCommand.getPassword());
			employeeDetails.setEmployeeActive(true);
			Set<EmployeeAddress> address = employeeDetails.getAddress();
			for (EmployeeAddress addr : address) {
				addr.setCountry(employeeCommand.getCountry());
				addr.setDistrict(employeeCommand.getDistrict());
				addr.setFlatNumber(employeeCommand.getDoornum());
				addr.setVillage(employeeCommand.getVlg());
				addr.setMandal(employeeCommand.getMandal());
				addr.setPincode(Integer.parseInt(employeeCommand.getPin()));
				addr.setState(employeeCommand.getState());
				addr.setEmployeeDetails(employeeDetails);
				address.add(addr);

			}
			Set<AssignmentInformation> assignmentInformtion = employeeDetails.getAssignmentInfo();
			for (AssignmentInformation assignInfo : assignmentInformtion) {
				assignInfo.setAssignmentEndDate(employeeCommand.getEndDate());
				assignInfo.setAssignmentStartDate(employeeCommand.getStartdate());
				assignInfo.setDateOfJoining(employeeCommand.getJoindate());
				assignInfo.setJob(employeeCommand.getJob());
				assignInfo.setManager(employeeCommand.getManager());
				assignInfo.setYearsOfService(employeeCommand.getService());
				assignInfo.setEmployeeDetails(employeeDetails);
				assignmentInformtion.add(assignInfo);
			}
			Set<BankInformation> bankInformations = employeeDetails.getBankInfo();
			for (BankInformation bankInformation : bankInformations) {
				bankInformation.setAccountNumber(employeeCommand.getAccountnumber());
				bankInformation.setIfscCode(employeeCommand.getIfsc());
				bankInformation.setBankName(employeeCommand.getBankname());
				bankInformation.setEmployeeDetails(employeeDetails);
				bankInformations.add(bankInformation);
			}
			Set<ProvidentFundInformation> providentFundInformations = employeeDetails.getProvidentInfo();
			for (ProvidentFundInformation pInfo : providentFundInformations) {
				pInfo.setAdharNumber(employeeCommand.getAdhar());
				pInfo.setDateOfLeaving(employeeCommand.getJoindate());
				pInfo.setEndDate(employeeCommand.getEndDate());
				pInfo.setStartDate(employeeCommand.getStartdate());
				pInfo.setPrevoiusEmployee(employeeCommand.getPreviousemp());
				pInfo.setUanNumber(employeeCommand.getUan());
				pInfo.setEmployeeDetails(employeeDetails);
				providentFundInformations.add(pInfo);
			}
			employeeDetails.setAddress(address);
			employeeDetails.setAssignmentInfo(assignmentInformtion);
			employeeDetails.setBankInfo(bankInformations);
			employeeDetails.setProvidentInfo(providentFundInformations);
			entityManager.merge(employeeDetails);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DatabaseException("Datebase is Down");
		}
	}

	@Override
	@Transactional
	public void deleteEmployeeById(int employeeId) {
		int count = 0;
		try {
			// count = employeeRepository.updateByEmpId(employeeId);
			EmployeeDetails details = entityManager.find(EmployeeDetails.class, employeeId);
			details.setEmployeeActive(false);
			entityManager.merge(details);
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DatabaseException("Datebase is Down");
		}

	}
}
