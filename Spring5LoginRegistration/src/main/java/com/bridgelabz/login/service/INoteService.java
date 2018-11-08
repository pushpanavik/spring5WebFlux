package com.bridgelabz.login.service;

import com.bridgelabz.login.dto.CreateNoteDto;
import com.bridgelabz.login.model.Note;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface INoteService {

	Mono<Note> createNote(Mono<Note> mono, String token);
//	
//	Flux<Note> getNotes(String userId);
//	
//	Mono<Note> updateNote(Mono<Note> monoNote);
//	
//	Mono<String> deleteNote(String noteId);
}
