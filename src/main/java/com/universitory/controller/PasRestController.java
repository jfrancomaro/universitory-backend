package com.universitory.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pas")
public class PasRestController {

	/*private final PasService service;
	
	@Autowired
    public PasRestController(PasService service) {
        this.service = service;
    }

	@GetMapping("/{id}")
	public PasDTO findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/")
	public List<PasDTO> findAll() {
		return service.findAll();
	}

	@PostMapping("/")
	public PasDTO save(@RequestBody PasDTO pas) {
		return service.save(pas);
	}

	@PutMapping("/")
	public PasDTO update(@RequestBody PasDTO pas) {
		return service.update(pas);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
*/}
