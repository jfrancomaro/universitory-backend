package com.universitory.controller;

import com.universitory.request.StudyPlanDTO;
import com.universitory.response.GenericResponse;
import com.universitory.service.studyplan.StudyPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/study-plans")
public class StudyPlanController {

    private final StudyPlanService service;

    @Autowired
    public StudyPlanController(StudyPlanService service) {
        this.service = service;
    }

    @GetMapping("/pas/{id}")
	public ResponseEntity<GenericResponse> getAllPlanByIdEap(@PathVariable("id") Integer id) {
        GenericResponse response = service.findAllByIdPas(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
	}

    @GetMapping
    public ResponseEntity<GenericResponse> findAll() {
        GenericResponse response = service.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GenericResponse> getForId(@PathVariable("id") Integer id) {
        GenericResponse response = service.findById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<GenericResponse> save(@RequestBody StudyPlanDTO request) {
        GenericResponse response = service.save(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GenericResponse> update(@PathVariable("id") Integer id,
                                                  @RequestBody StudyPlanDTO request) {
        GenericResponse response = service.update(id, request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GenericResponse> delete(@PathVariable("id") Integer id) {
        GenericResponse response = service.delete(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
