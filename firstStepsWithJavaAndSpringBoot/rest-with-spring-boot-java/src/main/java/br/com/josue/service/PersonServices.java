package br.com.josue.service;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.josue.model.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	public Person findById(String id) {
		logger.info("Finding one person!");

		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Josue");
		person.setLastName("Lima");
		person.setAddress("Maceio");
		person.setGender("Male");
		return person;
	}

	public ArrayList<Person> findAll() {

		logger.info("Finding all people!");

		ArrayList<Person> persons = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Josue" + i);
		person.setLastName("Lima" + i);
		person.setAddress("Maceio" + i);
		person.setGender("Josue" + i);
		return person;
	}

	public Person create(Person person) {
		logger.info("Creating one person!");
		return person;
	}
	public Person update(Person person) {
		logger.info("Creating one person!");
		return person;
	}

}
