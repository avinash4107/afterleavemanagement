package com.centraprise.hrmodule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.centraprise.hrmodule.entity.User;
import com.centraprise.hrmodule.model.UserDetailsImpl;
import com.centraprise.hrmodule.repository.UserRepository;

@Component
public class UserServiceDetailsImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}

		return new UserDetailsImpl(user.getUsername(), user.getPassword(), user.getRoles());
	}

}
