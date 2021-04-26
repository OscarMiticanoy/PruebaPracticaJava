package com.pruebapractica.service;

import java.util.List;

import com.pruebapractica.model.Person;

public interface IPersonService {
	public int addPerson(Person person);
	public int processPerson(List<Person> persons);
	public List<Person>listPerson();
}
