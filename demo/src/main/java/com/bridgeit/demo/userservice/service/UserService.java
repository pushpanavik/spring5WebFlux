package com.bridgeit.demo.userservice.service;

import com.bridgeit.demo.userservice.model.User;

import reactor.core.publisher.Mono;

public interface UserService {
 
	public Mono<User>addUser(Mono<User> user);
}
