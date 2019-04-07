package com.centraprise.hrmodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centraprise.hrmodule.entity.ManageLeave;

public interface LeaveManagementRepository extends JpaRepository<ManageLeave, Integer> {

	ManageLeave findByEmployeeNumber(int employeeNumber);

}
