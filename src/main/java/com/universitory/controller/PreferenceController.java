package com.universitory.controller;

import com.universitory.request.StudentPreferenceDTO;
import com.universitory.service.studentpreference.StudentPreferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/preferences")
public class PreferenceController {

    private final StudentPreferenceService service;

    @Autowired
    public PreferenceController(StudentPreferenceService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public StudentPreferenceDTO findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    @GetMapping("/")
    public List<StudentPreferenceDTO> findAll() {
        return service.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<StudentPreferenceDTO> save(@RequestBody StudentPreferenceDTO Preference) {
        return ResponseEntity.ok().body(service.save(Preference));
    }

    @PutMapping("/")
    public ResponseEntity<StudentPreferenceDTO> update(@RequestBody StudentPreferenceDTO Preference) {
        return ResponseEntity.ok().body(service.update(Preference));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }
}
