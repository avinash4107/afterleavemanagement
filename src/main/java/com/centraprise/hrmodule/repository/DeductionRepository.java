package com.centraprise.hrmodule.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.centraprise.hrmodule.entity.DeductionInfo;

public interface DeductionRepository extends JpaRepository<DeductionInfo, Integer> {

}
