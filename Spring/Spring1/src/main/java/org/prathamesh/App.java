package org.prathamesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Person person = context.getBean("person",Person.class);
//        person.setAge(22);
        System.out.println(person.getAge());
        person.code();

        Computer com = context.getBean(Computer.class); //Using the primary bean as no name given
        Desktop obj = context.getBean(Desktop.class);
    }
}
