package com.centraprise.hrmodule.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.centraprise.hrmodule.entity.Role;
import com.centraprise.hrmodule.entity.User;
import com.centraprise.hrmodule.exception.DatabaseException;
import com.centraprise.hrmodule.model.UserRegistration;
import com.centraprise.hrmodule.repository.UserRepository;

@Service
public class UserSignupServiceImpl implements UserSignupService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;

	@Override
	public User findByusername(String username) {
		try {
			return userRepository.findByUsername(username);
		} catch (Exception e) {
			throw new DatabaseException("Database Has Down");
		}
	}

	@Override
	public User save(UserRegistration registration) {
		try {
			User user = new User();
			user.setUsername(registration.getUsername());
			user.setPassword(bcryptPasswordEncoder.encode(registration.getPassword()));
			user.setPhone(registration.getPhone());
			user.setEmail(registration.getEmail());
			Set<Role> roles = new HashSet<>();
			Role role = new Role();
			role.setRoleName("admin");
			role.setUser(user);
			roles.add(role);
			user.setRoles(roles);
			return userRepository.save(user);
		} catch (DatabaseException e) {
			throw new DatabaseException("Database Has Down");
		}
	}

}
