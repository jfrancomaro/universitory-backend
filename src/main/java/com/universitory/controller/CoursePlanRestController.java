package com.universitory.controller;

import com.universitory.request.CoursePlanDTO;
import com.universitory.service.courseplan.CoursePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/courses-plan")
public class CoursePlanRestController {

    private CoursePlanService service;

    @Autowired
    public CoursePlanRestController(CoursePlanService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public CoursePlanDTO findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    @GetMapping("/")
    public List<CoursePlanDTO> findAll() {
        return service.findAll();
    }

    @PostMapping("/")
    public CoursePlanDTO save(@RequestBody CoursePlanDTO course) {
        return service.save(course);
    }

    @PutMapping("/")
    public CoursePlanDTO update(@RequestBody CoursePlanDTO course) {
        return service.update(course);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }
}
