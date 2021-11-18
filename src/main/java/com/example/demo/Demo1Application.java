package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.CompteRepository;
import com.example.demo.entities.Compte;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {
	@Autowired
	private CompteRepository iCompteRepository;
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {	Compte c = iCompteRepository.save(new Compte(2,1,"05/06/2012"));
		iCompteRepository.save(c);


	}
}
