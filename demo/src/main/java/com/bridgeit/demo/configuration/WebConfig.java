package com.bridgeit.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.bridgeit.demo.userservice.controller.UserController;

@Configuration
@ComponentScan({"com.bridgeit.demo"})
public class WebConfig implements WebFluxConfigurer{
	
	@Bean
	public RouterFunction<ServerResponse> route(UserController userCtrl){
		
		return RouterFunctions.route(RequestPredicates.POST("/registerUser").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), userCtrl::registerNewUser);
		
	}

}
