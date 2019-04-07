package com.centraprise.hrmodule.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.centraprise.hrmodule.entity.Role;

public class UserDetailsImpl implements UserDetails {

	private static final long serialVersionUID = 1L;
	protected String username;
	protected String password;
	protected List<GrantedAuthority> authories;
	protected boolean enabled=true;
	protected boolean locked;

	public UserDetailsImpl(String username, String password, Set<Role> roles) {
		this.username = username;
		this.password = password;
		authories = new ArrayList<>();
		for (Role role : roles) {
			authories.add(new SimpleGrantedAuthority(role.getRoleName()));
		}
		/*if (status != null) {
			if (status.equals("a")) {
				enabled = true;
			} else if (status.equals("l")) {
				locked = true;
			}
		}*/

	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authories;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return !locked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

}
