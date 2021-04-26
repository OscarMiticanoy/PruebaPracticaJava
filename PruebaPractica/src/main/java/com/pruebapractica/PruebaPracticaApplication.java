package com.pruebapractica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class PruebaPracticaApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbc;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPracticaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		jdbc.execute("DROP TABLE person IF EXISTS");
		jdbc.execute("CREATE TABLE person(id INTEGER(10) PRIMARY KEY auto_increment, nombre VARCHAR(100), apellido VARCHAR(100), procesado BIT)");
		jdbc.update("INSERT INTO person(nombre, apellido, procesado)VALUES('OSCAR', 'MITICANOY', 0)");
		jdbc.update("INSERT INTO person(nombre, apellido, procesado)VALUES('Luis', 'Sanin', 0)");
		jdbc.update("INSERT INTO person(nombre, apellido, procesado)VALUES('henry', 'labrador', 0)");
	}

}
