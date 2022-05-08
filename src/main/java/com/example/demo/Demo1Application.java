package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.demo.entities.Medecin;
import com.example.demo.entities.Patient;
import com.example.demo.entities.RendezVous;
import com.example.demo.repositories.PatientRepository;
import com.example.demo.repositories.RDVRepository;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner{
	@Autowired
	private PatientRepository patientRepository;
	@Autowired
	private RDVRepository rdvRepository;
	public static void main(String[] args) {
		
		//Quand on démarre l'application le premier à démarrer c'est spring
		SpringApplication.run(Demo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Medecin m=new Medecin(01L,"Ali","","",null);
		RendezVous r=new RendezVous(null,new Date(),null );
		rdvRepository.save(r);
		ArrayList<RendezVous> lr=new ArrayList<>();
		lr.add(r);
		//pa.setRdv(lr);
		Patient pa=  new Patient(01L,"IMEN", new Date(), 2300,false,lr);
		patientRepository.save(pa);
		
		patientRepository.save(new Patient(02L,"Amine", new Date(), 200,false,null));
		patientRepository.save(new Patient(03L,"Ismail", new Date(), 2000,false,null));
		patientRepository.save(new Patient(04L,"lotfi", new Date(), 2000,true,null));
		/*System.out.println("*************************************");
		patientRepository.findAll().forEach(p->{System.out.println(p.toString());});
		System.out.println("*************************************");
		Patient p=patientRepository.findById(2L).get();
	System.out.println(p);
	System.out.println("*****************Name********************");
	List<Patient> patients=patientRepository.findByNameContains("IM");
	patients.forEach(p1->{
		System.out.println(p1.toString());
	});
	
	System.out.println("**************Malade***********************");
	List<Patient> pat=patientRepository.findByMalade(true);
	pat.forEach(p2->{
		System.out.println(p2.toString());
	});
	

	System.out.println("*****************Name and malade********************");
	List<Patient> patients2=patientRepository.findByNameContainsAndMalade("l",false);
	patients2.forEach(p1->{
		System.out.println(p1.toString());
	});
	System.out.println("*****************Page********************");
	patientRepository.deleteById(1L);
	Page<Patient> pagePatients=patientRepository.findAll(PageRequest.of(0, 2));
	List<Patient> listPatients=pagePatients.getContent();
	listPatients.forEach(p1->{
		System.out.println(p1.toString());
	});*/
	
}
}
