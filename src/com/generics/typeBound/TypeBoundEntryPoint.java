package com.generics.typeBound;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class TypeBoundEntryPoint {

    public static void main(String[] args) {
        Person person1 = new Person(15,"Ebrahim Mohamed", 130000.5);
        Person person2 = new Person(5,"Mohsen Mohamed", 147.3552);
        Person person3 = new Person(1,"Ahmed Mohamed", 1458.036);
        Person person4 = new Person(100,"Habiba Mohamed", 10000.235);
        Person person5 = new Person(65,"Hanen Mohamed", 147000.25);

        List<Person> personList =new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        System.out.println(personList);

//        SortedTwoEmployee<Person> sortedTwoEmployee = new SortedTwoEmployee<>(person1,person2);
          SortedTwoEmployee<Person> sortedTwoEmployee = new SortedTwoEmployee<>(person2,person5);
        System.out.println(sortedTwoEmployee.getFirstEmployee());
    }
}
