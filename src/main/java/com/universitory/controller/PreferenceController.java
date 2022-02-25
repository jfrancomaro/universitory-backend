package com.universitory.controller;

import com.universitory.request.StudentPreferenceDTO;
import com.universitory.response.GenericResponse;
import com.universitory.service.studentpreference.StudentPreferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/preferences")
public class PreferenceController {

    private final StudentPreferenceService service;

    @Autowired
    public PreferenceController(StudentPreferenceService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<GenericResponse> findById(@PathVariable("id") Integer id) {
        GenericResponse response = service.findById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<GenericResponse> findAll() {
        GenericResponse response = service.findAll();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<GenericResponse> save(@RequestBody StudentPreferenceDTO preference) {
        GenericResponse response = service.save(preference);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GenericResponse> update(@PathVariable("id") Integer id,
                                                  @RequestBody StudentPreferenceDTO preference) {
        GenericResponse response = service.update(id, preference);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GenericResponse> delete(@PathVariable("id") Integer id) {
        GenericResponse response = service.delete(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
