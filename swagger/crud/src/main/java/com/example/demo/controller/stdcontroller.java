package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.stdservice;

@RestController
@RequestMapping("stdapi/s1/")
public class stdcontroller {
	
	@Autowired
	public stdservice service;
	
	
	@GetMapping(path="students",produces="application/json")
	public ResponseEntity getAllStudents() {
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllStudents());
	}
	
    @PostMapping(path="students",produces="application/json",consumes="application/json")
    public Student addNewStd(@RequestBody Student student) 
    {
    	return service.addNewStd(student);
    }
    
    @PutMapping(path="students/{stdId}",produces="text/plain")
    public ResponseEntity updateStd(@RequestBody Student student,@PathVariable("stdId") int id) {
    try {
    	return ResponseEntity.status(HttpStatus.OK).body(service.updateStd(student, 0));
    }
    catch(Exception e) {
    	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    	
    }
    }
//    @DeleteMapping(path="students/{stdId}",produces="text/plain")
//    public ResponseEntity delete(@RequestBody Student student,@PathVariable("stdId") int id){
//    	try {
//        	return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
//        }
//        catch(Exception e) {
//        	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
//        	
//        }
//    }
    
}

