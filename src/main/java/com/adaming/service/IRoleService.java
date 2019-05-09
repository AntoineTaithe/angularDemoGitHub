package com.adaming.service;

import java.util.List;

import com.adaming.entitties.Role;

public interface IRoleService {
	
	public Role save (Role role);
	
	public void delete (Long id);
	
	public List<Role> findAll();
	
	public Role findOne(Long Id);
}
