
package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;
 
@RestController
public class PlacementController {
 
    @Autowired
    private PlacementService services;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/placement")
    public List<Placement> list() {
        return services.listAll();
    }
    @GetMapping("/placement/{id}")
    public ResponseEntity<Placement> get(@PathVariable Integer id) {
        try {
        	Placement placement = services.get(id);
            return new ResponseEntity<Placement>(placement, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
        }      
    }
    // RESTful API method for Create operation
    @PostMapping("/placement")
    public void add(@RequestBody Placement placement) {
    	services.save(placement);
    }
     
    // RESTful API method for Update operation
    @PutMapping("/placement/{id}")
    public ResponseEntity<?> update(@RequestBody Placement placement, @PathVariable Integer id) {
        try {
        	Placement existStudent = services.get(id);
        	services.save(placement);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
    // RESTful API method for Delete operation
    @DeleteMapping("/placement/{id}")
    public void delete(@PathVariable Integer id) {
    	services.delete(id);
    }
    
   
}