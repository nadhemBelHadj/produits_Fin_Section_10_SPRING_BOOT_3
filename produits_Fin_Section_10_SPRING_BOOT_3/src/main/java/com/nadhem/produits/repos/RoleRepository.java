package com.nadhem.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nadhem.produits.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRole(String role);
	
}
