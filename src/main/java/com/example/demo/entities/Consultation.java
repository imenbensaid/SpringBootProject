package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Consultation {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	Date consultationDate;
	String consultationRapport;
	@OneToOne
	private RendezVous RDV;
}
