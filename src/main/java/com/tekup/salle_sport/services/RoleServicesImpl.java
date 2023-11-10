package com.tekup.salle_sport.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.salle_sport.model.Role;
import com.tekup.salle_sport.repository.RoleRepository;

@Service
public class RoleServicesImpl implements RoleServices {

	
	@Autowired
	private RoleRepository roleRepository;
	
	
	@Override
	public Role saveRole(Role R) {
		return roleRepository.save(R);
	}

	@Override
	public void deleteRole(Role R) {
		roleRepository.delete(R);
		
	}

	@Override
	public Role getRole(Long id) {
		return roleRepository.findById(id).get();
	}

	@Override
	public List<Role> getAllRole() {
		return roleRepository.findAll();
	}

}