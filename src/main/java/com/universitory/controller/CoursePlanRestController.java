package com.universitory.controller;

import com.universitory.request.CoursePlanDTO;
import com.universitory.response.GenericResponse;
import com.universitory.service.courseplan.CoursePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/courses-plan")
public class CoursePlanRestController {

    private final CoursePlanService service;

    @Autowired
    public CoursePlanRestController(CoursePlanService service) {
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
    public ResponseEntity<GenericResponse> save(@RequestBody CoursePlanDTO course) {
        GenericResponse response = service.save(course);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GenericResponse> update(@PathVariable("id") Integer id,
                                                  @RequestBody CoursePlanDTO course) {
        GenericResponse response = service.update(id, course);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GenericResponse> delete(@PathVariable("id") Integer id) {
        GenericResponse response = service.delete(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
