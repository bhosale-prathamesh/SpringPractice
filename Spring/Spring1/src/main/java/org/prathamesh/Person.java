package org.prathamesh;

public class Person {
    private int age;

    public Person() {
        System.out.println("Person Object Created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        System.out.println("Coding..");
    }
}
