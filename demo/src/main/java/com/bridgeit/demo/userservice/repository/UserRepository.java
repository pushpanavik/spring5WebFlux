package com.bridgeit.demo.userservice.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.bridgeit.demo.userservice.model.User;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<User, String> {

	public void registerUser(Mono<User> user);

	public Mono<User> findByEmail(String email);

	public Mono<User> save(Mono<User> monoUser);

}
