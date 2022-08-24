package info.shkryl;

import info.shkryl.entity.Person;
import info.shkryl.service.PersonService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    private static final PersonService personService = new PersonService();

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Person person = generatePerson();

        //Save entity
        personService.save(person,session);

        //Get entity from DataBase
        System.out.println(personService.get(1,session));

        //Update comment for Person
        personService.updateComment(person,"My driver",session);

        //Delete person with id = 1
        personService.delete(personService.get(1,session),session);

        session.close();
        sessionFactory.close();
    }

    private static Person generatePerson(){
        Person person = new Person();
        person.setFullName("Ivanov Ivan Ivanovich");
        person.setPhoneNumber("+7 999 999 99 99");
        person.setDescription("My Java teacher");
        return person;
    }
}
