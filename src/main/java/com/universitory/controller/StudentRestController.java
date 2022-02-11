package com.universitory.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//@RestController
//@RequestMapping("/students")
public class StudentRestController {

//    @Autowired
//    private IStudentService service;
//
//    @GetMapping("/{id}")
//    public ResponseEntity<GenericResponse<StudentDTO>> getForId(@PathVariable("id") Integer id) {
//        GenericResponse<StudentDTO> response = new GenericResponse<>();
//        response.setData(service.getStudent(id));
//        response.setStatus(HttpStatus.OK);
//        return new ResponseEntity<>(response, response.getMessage().getCode());
//    }
//
//    @GetMapping("/")
//    public List<StudentDTO> getAll() {
//        return service.findAll();
//    }
//
//    @PostMapping("/")
//    public StudentDTO save(@RequestBody StudentDTO student) {
//        return service.save(student);
//    }
//
//    @PutMapping("/")
//    public ResponseEntity<GenericResponse<StudentDTO>> update(@RequestBody @Valid StudentDTO student) {
//        GenericResponse<StudentDTO> response = new GenericResponse<>();
//        response.setData(service.updatedStudent(student));
//        response.setStatus(HttpStatus.ACCEPTED);
//        return new ResponseEntity<>(response, response.getMessage().getCode());
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable("id") Integer id) {
//        service.delete(id);
//    }
//
//    @PostMapping("/register")
//    public ResponseEntity<GenericResponse<StudentDTO>> register(@RequestBody @Valid StudentDTO student){
//
//        GenericResponse<StudentDTO> response = new GenericResponse<>();
//            response.setData(service.register(student));
//            response.setMessage("Lista StudentDTOs",
//                    "StudentDTOs de la FISI", HttpStatus.OK);
//        return new ResponseEntity<>(response, response.getMessage().getCode());
//    }
}
