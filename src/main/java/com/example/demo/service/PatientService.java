package com.example.demo.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Patient;
import com.example.demo.repositories.PatientRepository;
import lombok.Data;

@Data
@Service
public class PatientService {
	@Autowired
    private PatientRepository patientRepository;

    public Optional<Patient> getPatient(final Long id) {
        return patientRepository.findById(id);
    }

    public Iterable<Patient> getPatients() {
        return patientRepository.findAll();
    }

    public void deletePatient(final Long id) {
        patientRepository.deleteById(id);
    }

    public Patient save(Patient patient) {
        Patient savedPatient = patientRepository.save(patient);
        return savedPatient;
    }
}
