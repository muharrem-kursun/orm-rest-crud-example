package com.service;

import com.dao.PersonDaoImpl;
import com.model.Person;

import java.util.List;

public class PersonServiceImpl implements  PersonService{

    private PersonDaoImpl personDao;

    public PersonServiceImpl() {
        personDao = new PersonDaoImpl();
    }

    public void add(Person person) {
        personDao.add(person);
    }

    public void removeById(Integer id) {
        personDao.removeById(id);
    }

    public void remove(Person person) {
        personDao.remove(person);
    }

    public Person update(Person person) {
        return personDao.update(person);
    }

    public Person findById(Integer id) {
       return personDao.findById(id);
    }

    public List<Person> findAll() {
        return personDao.findAll();
    }
}
