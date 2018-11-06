package com.bridgelabz.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.bridgelabz.login.dto.CreateNoteDto;
import com.bridgelabz.login.model.Note;
import com.bridgelabz.login.service.INoteService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class NoteHandler {
	
//	@Autowired
//	private INoteService noteService;
//
//	public Mono<ServerResponse> createNote(ServerRequest request) {
//		String token = request.headers().header("Authorization").get(0);
//		Mono<Note> monoNote = noteService.createNote(request.bodyToMono(CreateNoteDto.class), token);
//		return ServerResponse.ok().body(monoNote, Note.class);
//	}
//	
//	public Mono<ServerResponse> getAllNotes(ServerRequest request){
//		Flux<Note> fluxNote = noteService.getNotes(request.headers().header("Authorization").get(0));
//		return ServerResponse.ok().body(fluxNote, Note.class);
//	}
//	
//	public Mono<ServerResponse> deleteNote(ServerRequest request){
//		Mono<String> monoString = noteService.deleteNote(request.queryParam("noteId").get());
//		return monoString.flatMap(string -> {
//			return ServerResponse.ok().body(BodyInserters.fromObject(string));
//		});
//	}
//	
//	public Mono<ServerResponse> updateNote(ServerRequest request){
//		Mono<Note> monoNote = noteService.updateNote(request.bodyToMono(Note.class));
//		return ServerResponse.ok().body(monoNote, Note.class);
//	}
}
