package com.dao;

import com.model.Person;
import com.util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class PersonDaoImpl implements PersonDao{
EntityManager entityManager ;
EntityTransaction entityTransaction;
    public PersonDaoImpl() {
        entityManager = JpaUtil.getEntityManager();
        entityTransaction = entityManager.getTransaction();

    }

    public void add(Person person) {
        entityTransaction.begin();
        entityManager.persist(person);
        entityTransaction.commit();
        entityManager.close();

    }

    public void removeById(Integer id) {
        entityTransaction.begin();
       Person person= entityManager.find(Person.class,id);
       entityManager.remove(person);
       entityTransaction.commit();
       entityManager.close();
    }

    public void remove(Person person) {
        entityTransaction.begin();
        Person person1 = entityManager.find(Person.class,person.getId());
        entityManager.remove(person1);
        entityTransaction.commit();
        entityManager.close();

    }

    public Person update(Person person) {
        entityTransaction.begin();
        entityManager.merge(person);
        entityTransaction.commit();
        entityManager.close();
        return person;
    }

    public Person findById(Integer id) {

        entityTransaction.begin();
      Person person = entityManager.find(Person.class, id);
        entityTransaction.commit();
        entityManager.close();
        return person;

    }

    public List<Person> findAll() {
        return entityManager.createQuery("from Person ").getResultList();
    }
}
