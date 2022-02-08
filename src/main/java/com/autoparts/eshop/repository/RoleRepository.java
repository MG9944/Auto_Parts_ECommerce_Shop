package com.autoparts.eshop.repository;

import org.springframework.data.repository.CrudRepository;

import com.autoparts.eshop.model.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	
	Role findByName(String name);

}
