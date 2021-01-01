package com.generics.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Employee employee1 = new Employee(10,"Ebrahim",15000);
        Employee employee2 = new Employee(10,"Ebrahim",15000);
        Employee employee = new Employee(20,"Mohamed",14000);


        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(employee1);
        //if you override the equals and hashcode will don't save duplicate value
        employeeSet.add(employee2);
        employeeSet.add(employee2);
        employeeSet.add(employee);
        System.out.println(employeeSet);
        System.out.println("============== Using Iterator ==============");
        //using Iterator
        Iterator<Employee> setIterator = employeeSet.iterator();
        while (setIterator.hasNext()){
            System.out.println(setIterator.next());
        }


    }
}
