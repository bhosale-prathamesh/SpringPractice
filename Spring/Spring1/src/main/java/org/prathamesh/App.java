package org.prathamesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Person person = (Person) context.getBean("person");
//        person.setAge(22);
        System.out.println(person.getAge());
        person.code();
    }
}
