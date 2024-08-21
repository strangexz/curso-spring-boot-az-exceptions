package hn.com.jf.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.com.jf.exceptions.UserNotFoundExcpetion;
import hn.com.jf.models.domains.User;
import hn.com.jf.services.UserService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/app")
public class AppController {

	@Autowired
	private UserService service;

	@GetMapping("/divisionByZero")
	public String divisionByZero() {
		int value = 100 / 0;
		return "Ok";
	}

	@GetMapping("/numberFormat")
	public String numberFormat() {
		int value = Integer.parseInt("10x");
		return "Ok";
	}

	@GetMapping("/notFoundUserOrRole/{id}")
	public User notFoundUserOrRole(@PathVariable Long id) {
		User user = service.findById(id).orElseThrow(() -> new UserNotFoundExcpetion("Error: el usuario no existe"));
		if (user == null) {
			throw new UserNotFoundExcpetion("Error: el usuario no existe");
		}
		System.out.println(user.getLastname());

		return user;
	}
	
	@GetMapping("/notFoundUserOrRoleV2/{id}")
	public ResponseEntity<?> notFoundUserOrRoleV2(@PathVariable Long id){
		Optional<User> optionalUser = service.findById(id);
		if (optionalUser.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(optionalUser.orElseThrow());
	}

}
