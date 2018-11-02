package com.bridgeit.demo.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeit.demo.userservice.model.User;
import com.bridgeit.demo.userservice.repository.UserRepository;

import reactor.core.publisher.Mono;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
//	@Autowired
//	private EmailDto emaildto;
//	
//	@Autowired
//	private BCryptPasswordEncoder encoder;

	@Override
	public Mono<User> addUser(Mono<User> monoUser) {
		return monoUser.flatMap(user -> {
			return userRepo.findByEmail(user.getEmail());
		}).flatMap(userByEmail -> Mono.<User>error(new RuntimeException("User already registered")))
		.switchIfEmpty(saveUser(monoUser));	
	}

	private Mono<User> saveUser(Mono<User> monoUser) {
		userRepo.save(monoUser);
		return monoUser;
	}

}
