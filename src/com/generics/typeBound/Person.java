package com.generics.typeBound;

public class Person implements Comparable<Person> {

    private int id;
    private String name;
    private double salary;

    public Person() {
    }

    public Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        /*
         * using normal way
         *   if(this.getId() > person.getId())
         *             return 1;
         *         else if (this.getId() < person.getId())
         *             return -1;
         *         else
         *             return 0;
         */

        return Integer.compare(this.getId(), person.getId());
    }
}
