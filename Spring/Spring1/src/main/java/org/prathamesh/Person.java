package org.prathamesh;

public class Person {
    private int age;
    private Laptop lap;

    public Person() {
        System.out.println("Person Object Created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        System.out.println("Coding..");
        lap.compile();
    }
}
