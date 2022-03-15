package com.universitory.controller;


import com.universitory.request.StudentDTO;
import com.universitory.response.GenericResponse;
import com.universitory.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/students")
public class StudentRestController {

    @Autowired
    private StudentService service;

    @GetMapping("/{id}")
    public ResponseEntity<GenericResponse> getForId(@PathVariable("id") Integer id) {
        GenericResponse response = new GenericResponse();
        response.setData(service.findById(id));
        response.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<GenericResponse>  getAll() {
        GenericResponse response = new GenericResponse();
        response.setData(service.findAll());
        response.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<GenericResponse> save(@RequestBody  @Valid StudentDTO student) {
        GenericResponse response = new GenericResponse();
        response.setData(service.save(student));
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PutMapping("/{id-student}")
    public ResponseEntity<GenericResponse> update(@PathVariable("id-student") Integer idStudent, @RequestBody @Valid StudentDTO student) {
        GenericResponse response = new GenericResponse();
        response.setData(service.update(idStudent,student));
        response.setStatus(HttpStatus.ACCEPTED);
        return new ResponseEntity<>(response, response.getMessage().getCode());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }
}
