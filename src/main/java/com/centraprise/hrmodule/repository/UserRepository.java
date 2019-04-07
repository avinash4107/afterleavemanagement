package com.centraprise.hrmodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centraprise.hrmodule.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);

}
