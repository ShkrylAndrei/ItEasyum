package info.shkryl.service;

import info.shkryl.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;

@Slf4j
public class PersonService {

    public void save(Person person, Session session){
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        log.info("Save entity Person: " + person);
    }

    public Person get(int id,Session session){
        log.info("Get entity from id = " + id);
        return session.get(Person.class,id);
    }

    public void updateComment(Person person, String newDescription, Session session){
        person.setDescription(newDescription);

        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        log.info("Update comment for entity Person");
    }

    public void delete(Person person, Session session){
        session.beginTransaction();
        session.delete(person);
        session.getTransaction().commit();
        log.info("Delete entity Person");
    }
}
