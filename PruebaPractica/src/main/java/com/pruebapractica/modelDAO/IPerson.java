package com.pruebapractica.modelDAO;

import java.util.List;

import com.pruebapractica.model.Person;

public interface IPerson {
	public int addPerson(Person person);
	public int processPerson(List<Person> persons);
	public List<Person>listPerson();
}
