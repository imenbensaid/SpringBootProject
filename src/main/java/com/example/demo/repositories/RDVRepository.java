package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Patient;
import com.example.demo.entities.RendezVous;

public interface RDVRepository extends JpaRepository<RendezVous,Long>{

}
