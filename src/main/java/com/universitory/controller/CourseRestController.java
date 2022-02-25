package com.universitory.controller;

import com.universitory.request.CourseDTO;
import com.universitory.response.GenericResponse;
import com.universitory.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseRestController {

    private final CourseService service;

    @Autowired
    public CourseRestController(CourseService service) {
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
    public ResponseEntity<GenericResponse> save(@RequestBody CourseDTO course) {
        GenericResponse response = service.save(course);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GenericResponse> update(@PathVariable("id") Integer id,
												  @RequestBody CourseDTO course) {
        GenericResponse response = service.update(id, course);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GenericResponse> delete(@PathVariable("id") Integer id) {
        GenericResponse response = service.delete(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
