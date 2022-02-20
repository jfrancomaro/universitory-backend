package com.universitory.controller;

import com.universitory.request.CourseDTO;
import com.universitory.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseRestController {

	private CourseService service;

	@Autowired
    public CourseRestController(CourseService service) {
        this.service = service;
    }

	@GetMapping("/{id}")
	public CourseDTO findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@GetMapping("/")
	public List<CourseDTO> findAll() {
		return service.findAll();
	}

	@PostMapping("/")
	public CourseDTO save(@RequestBody CourseDTO course) {
		return service.save(course);
	}

	@PutMapping("/")
	public CourseDTO update(@RequestBody CourseDTO course) {
		return service.update(course);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
