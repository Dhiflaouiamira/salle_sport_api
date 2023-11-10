package com.tekup.salle_sport.services;

import java.util.List;

import com.tekup.salle_sport.model.Role;

public interface RoleServices {

	Role saveRole(Role R);
	void deleteRole(Role R);
	Role getRole(Long id);
	List<Role> getAllRole();
}
