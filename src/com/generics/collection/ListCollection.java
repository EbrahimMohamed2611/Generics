package com.generics.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollection {

    public static void main(String[] args) {
        Employee employee1 = new Employee(10,"Ebrahim",15000);
        Employee employee2 = new Employee(20,"Taha",16000);
        Employee employee = new Employee(30,"Mohsen",17000);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee);
        System.out.println(employees);
        //Using Stream
       employees.stream().map(Employee::getName).forEach(System.out::println);

        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()){
            System.out.println(employeeIterator.next());
        }
    }
}
