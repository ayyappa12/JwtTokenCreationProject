package com.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jwt.model.Users;
import com.jwt.response.ApiResponse;
import com.jwt.signin.signup.SignUpPojo;

@RequestMapping("/aapi/authenticate")
public class AuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private UsersRepository usersRepository;

	@Autowired
	RolesRepository roleRepository;

	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	JwtTokenProvider tokenProvider;
	
	public  ResponseEntity<?> registerUser(@RequestBody SignUpPojo signUpPojo){
		if(usersRepository.existsByUserName(signUpPojo.getUsername())) {
			return new ResponseEntity(new ApiResponse(false,"username already taken"),HttpStatus.BAD_REQUEST);
		}
		if(usersRepository.existsByEmail(signUpPojo.getEmail()))
		
		return null;
	}
	
}
