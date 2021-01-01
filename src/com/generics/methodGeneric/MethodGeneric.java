package com.generics.methodGeneric;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodGeneric {

    public static void main(String[] args) {
    Person person1 = new Person(10,"Taha El Fakarany",24);
    Person person2 = new Person(20,"Henedy Mohamed",55);
    Person person3 = new Person(30,"Nada Mohamed",5);
    Person person4 = new Person(40,"Hanen Mohamed",10);
    List<Person> allPersons = new ArrayList<>();
    allPersons.add(person1);
    allPersons.add(person2);
    allPersons.add(person3);
    allPersons.add(person4);
    Person youngestPerson = minAgeOfPerson(allPersons, new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    });

        System.out.println(youngestPerson);

    }

    //Generic Method without Generic class

    public static <T> T minAgeOfPerson(List<T> values, Comparator<T> comparator) {
        //Defensive
        if (values.isEmpty()) {
            throw new IllegalArgumentException("Sorry but your list is Empty so cannot find the min value");
        }
        T lowestElement = values.get(0);
        for (int i = 1; i < values.size(); i++) {
            if(comparator.compare(values.get(i) ,lowestElement) <0 )
                lowestElement = values.get(i);
            }
        return lowestElement;
    }
}
