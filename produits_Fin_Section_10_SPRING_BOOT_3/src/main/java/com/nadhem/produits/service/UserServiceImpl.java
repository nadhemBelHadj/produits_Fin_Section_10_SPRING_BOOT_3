package com.nadhem.produits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.nadhem.produits.entities.Role;
import com.nadhem.produits.entities.User;
import com.nadhem.produits.repos.RoleRepository;
import com.nadhem.produits.repos.UserRepository;


@Transactional
@Service
public class UserServiceImpl  implements UserService{

	
	private UserRepository userRep;
	private RoleRepository roleRep;
	private PasswordEncoder passwordEncoder;
	
	
	
	  @Autowired
	    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository,
	    	PasswordEncoder passwordEncoder) {
	        this.userRep = userRepository;
	        this.roleRep = roleRepository;
	        this.passwordEncoder = passwordEncoder;
	    }
	
	@Override
	public User saveUser(User user) {
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRep.save(user);
	}

	@Override
	public User addRoleToUser(String username, String rolename) {
		User usr = userRep.findByUsername(username);
		Role r = roleRep.findByRole(rolename);
		
		usr.getRoles().add(r);
		return usr;
	}

	
	@Override
	public Role addRole(Role role) {
		return roleRep.save(role);
	}

	@Override
	public User findUserByUsername(String username) {	
		return userRep.findByUsername(username);
	}

}
