package org.prathamesh;

public class Person {
    private int age;
    private Computer com;

    public Person() {
        System.out.println("Person Object Created");
    }

    public Person(int age, Computer com) {
//        System.out.println("Param Constructor");
        this.age = age;
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding..");
        com.compile();
    }
}
