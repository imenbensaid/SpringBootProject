package com.example.demo.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="Medecins")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Medecin {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
		@Column(name="NOM",length=25)
	private String name;
	private String email;
	private String specialie;
	@OneToMany
	private Collection<RendezVous> rdv;
}
