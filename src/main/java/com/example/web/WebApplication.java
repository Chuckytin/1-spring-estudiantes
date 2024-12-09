package com.example.web;

import com.example.web.entity.Estudiante;
import com.example.web.repository.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Punto de entrada de la aplicación.
//Implementa CommandLineRunner para ejecutar código adicional al inicio, como agregar estudiantes iniciales (comentado en el código).
@SpringBootApplication
public class WebApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(WebApplication.class, args);

	}

	@Autowired
	private EstudianteRepositorio estudianteRepositorio;

	@Override
	public void run(String... args) throws Exception {

		/*
		Estudiante estudiante1 = new Estudiante("Cris", "Martinez", "crismar@gmail.com");
		estudianteRepositorio.save(estudiante1);
		Estudiante estudiante2 = new Estudiante("Javier", "Mendoza", "jamendoza@gmail.com");
		estudianteRepositorio.save(estudiante2);
		*/

	}
}
