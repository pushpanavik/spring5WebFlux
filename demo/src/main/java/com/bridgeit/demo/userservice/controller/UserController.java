package com.bridgeit.demo.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.bridgeit.demo.userservice.model.User;
import com.bridgeit.demo.userservice.service.UserService;

import reactor.core.publisher.Mono;


@Component
public class UserController {
	
	
	private UserService userService;

	public Mono<ServerResponse> registerNewUser(ServerRequest request){
		Mono<User> user=request.bodyToMono(User.class);
		userService.addUser(user);
		return	ServerResponse.ok().build();
		
		
		
	}
}
