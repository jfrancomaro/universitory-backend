package com.universitory.controller;

import com.universitory.request.StudyPlanDTO;
import com.universitory.service.studyplan.StudyPlanService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @CrossOrigin(origins = "*")
    @GetMapping("/pas/{id}")
	public List<StudyPlanDTO> getAllPlanByIdEap(@PathVariable("id") Integer id) {
		return service.findAllByIdPas(id);
	}

    @GetMapping("/")
    public List<StudyPlanDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public StudyPlanDTO getForId(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    @PostMapping("/")
    public ResponseEntity<StudyPlanDTO> save(@RequestBody StudyPlanDTO request) {
        return ResponseEntity.ok().body(service.save(request));
    }

    @PutMapping("/")
    public ResponseEntity<StudyPlanDTO> update(@RequestBody StudyPlanDTO request) {
        return ResponseEntity.ok().body(service.update(request));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }
}
