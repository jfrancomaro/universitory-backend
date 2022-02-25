package com.universitory.controller;

import com.universitory.request.PasDTO;
import com.universitory.response.GenericResponse;
import com.universitory.service.pas.PasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/pas")
public class PasRestController {

    private final PasService service;

    @Autowired
    public PasRestController(PasService service) {
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
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<GenericResponse> save(@RequestBody PasDTO pas) {
        GenericResponse response = service.save(pas);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GenericResponse> update(@PathVariable("id") Integer id, @RequestBody PasDTO pas) {
        GenericResponse response = service.update(id, pas);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GenericResponse> delete(@PathVariable("id") Integer id) {

        GenericResponse response = service.delete(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
