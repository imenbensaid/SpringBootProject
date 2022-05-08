/*package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Patient;
import com.example.demo.repositories.PatientRepository;

@RestController
public class PatientControler {
@Autowired
	private PatientRepository patientRepository;
@GetMapping("/patients")
public List<Patient> getPatients(){
	return patientRepository.findAll();
}
@GetMapping("/patients/{id}")
public Patient getPatient(@PathVariable Long id){
	return patientRepository.findById(id).get();
}

}
*/