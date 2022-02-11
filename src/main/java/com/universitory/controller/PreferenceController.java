package com.universitory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/api/v1/preferences")
public class PreferenceController {

//    private final PreferenceService service;
//
//    @Autowired
//    public PreferenceController(PreferenceService service) {
//        this.service = service;
//    }
//
//    @GetMapping("/{id}")
//    public PreferenceDTO findById(@PathVariable("id") Integer id) {
//        return service.findById(id);
//    }
//
//    @GetMapping("/")
//    public List<PreferenceDTO> findAll() {
//        return service.findAll();
//    }
//
//    @PostMapping("/")
//    public ResponseEntity<PreferenceDTO> save(@RequestBody PreferenceDTO Preference) {
//        return ResponseEntity.ok().body(service.save(Preference));
//    }
//
//    @PutMapping("/")
//    public ResponseEntity<PreferenceDTO> update(@RequestBody PreferenceDTO Preference) {
//        return ResponseEntity.ok().body(service.update(Preference));
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable("id") Integer id) {
//        service.delete(id);
//    }
}
