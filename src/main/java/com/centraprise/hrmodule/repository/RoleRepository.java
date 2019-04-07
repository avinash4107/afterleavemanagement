package com.centraprise.hrmodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.centraprise.hrmodule.entity.Role;

@Transactional
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
