package com.bridgelabz.login.service;

import org.springframework.stereotype.Component;

import com.bridgelabz.login.model.Note;
import com.bridgelabz.login.utility.VerifyJwtToken;

import reactor.core.publisher.Mono;

@Component
public class NoteService implements INoteService {

	@Override
	public Mono<Note> createNote(Mono<Note> monoNote, String token) {
		String userId=VerifyJwtToken.getId(token);
		
		return null;
	}

//	@Autowired
//	private NoteRepository noteRepository;
//
//	@Autowired
//	private TokenGenerator jwtGenerator;
//
//	@Autowired
//	private ModelMapper modelMapper;
//
//	@Override
//	public Mono<Note> createNote(Mono<CreateNoteDto> monoNote, String token) {
//		String userId = jwtGenerator.verifyToken(token);
//		return monoNote.flatMap(createNoteDto -> {
//			NoteDto noteDto = modelMapper.map(createNoteDto, NoteDto.class);
//			noteDto.setCreatedAt(LocalDateTime.now());
//			noteDto.setUpdatedAt(LocalDateTime.now());
//			Note note = modelMapper.map(noteDto, Note.class);
//			note.setUserId(userId);
//			return noteRepository.save(note);
//		});
//	}
//
//	@Override
//	public Flux<Note> getNotes(String token) {
//		String userId = jwtGenerator.verifyToken(token);
//		return noteRepository.findByUserId(userId);
//	}
//
//	@Override
//	public Mono<Note> updateNote(Mono<Note> monoNote) {
//		return monoNote.flatMap(note -> {
//			return noteRepository.findById(note.getId()).flatMap(existingNote -> {
//				existingNote.setTitle(note.getTitle());
//				existingNote.setDescription(note.getDescription());
//				existingNote.setArchived(note.isArchived());
//				existingNote.setInTrash(note.isInTrash());
//				existingNote.setPinned(note.isPinned());
//				existingNote.setColor(note.getColor());
//				existingNote.setImage(note.getImage());
//				existingNote.setUpdatedAt(LocalDateTime.now());
//				return noteRepository.save(existingNote);
//			}).switchIfEmpty(Mono.error(new Exception("Note not found..!!!")));
//		});
//	}

	// @Override
	// public Mono<String> deleteNote(String noteId) {
	// return noteRepository.findById(noteId).flatMap(note -> {
	// return noteRepository.delete(note).map(v -> {
	// System.out.println("in delete note function");
	// return "Note deleted successfully..!!";
	// });
	// })
	// .switchIfEmpty(Mono.<String>error(new Exception("Note not found..!!"))).map(p
	// -> {
	// return p;
	// });
	// }

//	@Override
//	public Mono<String> deleteNote(String noteId) {
//		return noteRepository.findById(noteId).flatMap(note -> {
//			return noteRepository.delete(note).map(v -> {
//				System.out.println("in delete note function");
//				return "Note deleted successfully..!!";
//			}).then(Mono.just("Note deleted successfully...!!"));
//		}).switchIfEmpty(Mono.<String>just("Note not found..!!"));
//	}

}
