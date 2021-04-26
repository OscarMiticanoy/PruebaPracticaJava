package com.pruebapractica.modelDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pruebapractica.model.Person;

@Repository
public class PersonDAO implements IPerson{

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public int addPerson(Person person) {
		String sql="INSERT INTO person(nombre, apellido, procesado)values(?,?,?)";
		int respuesta = jdbc.update(sql, person.getNombre(), person.getApellido(), person.isProcesado());
		return respuesta;
	}

	@Override
	public int processPerson(List<Person> persons) {
		if (persons.isEmpty())
			return 0;
		else {
			for (Person p: persons) {
				String sql = "UPDATE person SET procesado=? WHERE id=?";
				jdbc.update(sql, p.isProcesado(), p.getId());
			}
			return 1;
		}
	}

	@Override
	public List<Person> listPerson() {
		String sql = "SELECT * FROM person";
		List<Person> personas = jdbc.query(sql, new BeanPropertyRowMapper<Person>(Person.class));
		return personas;
	}
}
