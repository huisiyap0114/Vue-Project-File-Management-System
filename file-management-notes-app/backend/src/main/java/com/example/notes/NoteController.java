package com.example.notes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin(origins = "*")
public class NoteController {

    @Autowired
    private NoteRepository repo;

    @GetMapping
    public List<Note> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Note create(@RequestBody Note note) {
        return repo.save(note);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Note> update(@PathVariable Long id, @RequestBody Note noteDetails) {
        Note note = repo.findById(id).orElseThrow();
        note.setTitle(noteDetails.getTitle());
        note.setContent(noteDetails.getContent());
        return ResponseEntity.ok(repo.save(note));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        repo.deleteById(id);
        return ResponseEntity.ok().build();
    }
}