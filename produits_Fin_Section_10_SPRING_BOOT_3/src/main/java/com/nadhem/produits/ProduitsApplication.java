package com.nadhem.produits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.nadhem.produits.entities.Role;
import com.nadhem.produits.entities.User;
import com.nadhem.produits.service.ProduitService;
import com.nadhem.produits.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class ProduitsApplication implements CommandLineRunner {

	@Autowired
	ProduitService produitService;
	
	@Autowired
	UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProduitsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	produitService.saveProduit(new Produit("PC Dell", 2600.0, new Date()));
		produitService.saveProduit(new Produit("PC Asus", 2800.0, new Date()));
		produitService.saveProduit(new Produit("Imp Epson", 900.0, new Date()));*/
		
	}
	
	  @PostConstruct
		void init_users() {
			//ajouter les rôles
		/*	userService.addRole(new Role(null,"ADMIN"));
			userService.addRole(new Role(null,"USER"));
			
			//ajouter les users
			userService.saveUser(new User(null,"admin","123",true,null));
			userService.saveUser(new User(null,"nadhem","123",true,null));
			userService.saveUser(new User(null,"yassine","123",true,null));
			
			//ajouter les rôles aux users
			userService.addRoleToUser("admin", "ADMIN");
			userService.addRoleToUser("admin", "USER");
			
			userService.addRoleToUser("nadhem", "USER");
			userService.addRoleToUser("yassine", "USER");		*/
		} 
	  
	

	
}
