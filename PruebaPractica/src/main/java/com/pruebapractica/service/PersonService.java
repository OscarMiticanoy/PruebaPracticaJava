package com.pruebapractica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebapractica.model.Person;
import com.pruebapractica.modelDAO.IPerson;

@Service
public class PersonService implements IPersonService{
	
	@Autowired
	private IPerson dao;

	@Override
	public int addPerson(Person person) {
		return dao.addPerson(person);
	}

	@Override
	public int processPerson(List<Person> persons) {
		return dao.processPerson(persons);
	}

	@Override
	public List<Person> listPerson() {
		return dao.listPerson();
	}

}
