package com.woslx.spring;

import com.woslx.spring.dao.PersonDAO;
import com.woslx.spring.vo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String args[]){

        // Laod spring-config.xml file
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        //get jdbcTemplatePersonDAO
        PersonDAO personDAO = (PersonDAO) ctx.getBean("jdbcTemplatePersonDAO");

        //create person bean to insert
        Person person = new Person();
        person.setName("Person 1");

        //( 1 ) insert person
        personDAO.insert(person);

        //**set name of person
        person.setName("Person 2");

        //( 2 ) insert return id
        int id = personDAO.insertReturnId(person);

        //( 3 ) select person by id
        personDAO.selectById(id);

        //( 4 ) select person name by id
        personDAO.selectPersonName(id);

        //( 5 ) select all
        List<Person> persons = personDAO.select();

        //**set name of all persons
        for(int i = 0; i < persons.size(); i++){
            persons.get(i).setName("Person Name "+i);
        }

        //( 6 ) update list of persons
        personDAO.batchUpdate(persons);

        //**check batch update
        personDAO.select();

        //( 7 ) count all
        personDAO.count();

    }
}
