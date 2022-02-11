package com.universitory.controller;

//import com.fisirepository.application.user.UserService;
//import com.fisirepository.web.model.UserDTO;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/api/v1/users")
public class UserController {

//	private final UserService service;
//
//	private final PasswordEncoder passwordEncoder;
//
//	public UserController(PasswordEncoder passwordEncoder, UserService service) {
//		this.service = service;
//		this.passwordEncoder = passwordEncoder;
//	}
//
//	@GetMapping("/{id}")
//	public UserDTO getUser(@PathVariable Integer id) {
//		return service.findById(id);
//	}
//
//	@GetMapping
//	public List<UserDTO> getUserList() {
//		return service.findAll();
//	}
//
//	@PostMapping
//	public UserDTO save(@RequestBody UserDTO user) {
//		user.setPass(passwordEncoder.encode(user.getPass()));
//		return service.save(user);
//	}
//
//	@PutMapping
//	public UserDTO update(@RequestBody UserDTO user) {
//		return service.update(user);
//	}
//
//	@DeleteMapping("/{id}")
//	public void delete(@PathVariable("id") Integer id) {
//		service.delete(id);
//	}
}
