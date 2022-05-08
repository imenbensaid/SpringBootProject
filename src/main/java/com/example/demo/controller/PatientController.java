package com.example.demo.controller;
import java.rmi.ServerException;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Patient;
import com.example.demo.service.PatientService;


@RestController
@RequestMapping("/patients")
public class PatientController {
	 @Autowired
	    private PatientService patientService;

	 @GetMapping()
	    public Iterable<Patient> getPatients() {
	        return patientService.getPatients();
	    }
	   
	    @GetMapping("/{id}")
	    public Optional<Patient> getPatient(@PathVariable Long id) {
	        return patientService.getPatient(id);
	        	    }
	    //@PostMapping = @RequestMapping(method = { RequestMethod.POST })
	    @PostMapping(path="/save", consumes = MediaType.APPLICATION_JSON_VALUE, 
	            produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Patient> addPatient(@RequestParam String name, @RequestParam int score) throws ServerException {
	    	Patient newPatient=new Patient(null,name,new Date(), score, false,null);
	    	
	    	Patient p = patientService.save(newPatient);
	        if (p == null) {
	            throw new ServerException("");
	        } else {
	            return new ResponseEntity<>(p, HttpStatus.CREATED);
	        }
	    }
	    
	    @DeleteMapping("/delete")
	    public ResponseEntity<Long> deletePost(@RequestParam Long id) {

	         patientService.deletePatient(id);

	        
	        return new ResponseEntity<>(id, HttpStatus.OK);
	    }
}
