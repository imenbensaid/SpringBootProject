package com.example.demo.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
//import javax.persistence.Entity;
@Entity
@Table(name="PATIENT")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Patient {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
	@Column(name="NOM",length=25)
private String name;
	@Temporal(TemporalType.DATE)
private Date birthDate;
private int score;
private boolean malade;
@OneToMany (fetch=FetchType.EAGER)
private Collection<RendezVous> rdv;
}
