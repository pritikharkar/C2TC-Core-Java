package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;
 
@RestController
public class StudentController {
 
    @Autowired
    private StudentService services;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/student")
    public List<Student> list() {
        return services.listAll();
    }
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> get(@PathVariable Integer id) {
        try {
        	Student student = services.get(id);
            return new ResponseEntity<Student>(student, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }      
    }
    // RESTful API method for Create operation
    @PostMapping("/student")
    public void add(@RequestBody Student student) {
    	services.save(student);
    }
     
    // RESTful API method for Update operation
    @PutMapping("/student/{id}")
    public ResponseEntity<?> update(@RequestBody Student student, @PathVariable Integer id) {
        try {
        	Student existStudent = services.get(id);
            services.save(student);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
    // RESTful API method for Delete operation
    @DeleteMapping("/student/{id}")
    public void delete(@PathVariable Integer id) {
    	services.delete(id);
    }
    
   
}