package com.centraprise.hrmodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centraprise.hrmodule.entity.SaloryInfo;

public interface SalaryRepository extends JpaRepository<SaloryInfo, Integer> {

}
