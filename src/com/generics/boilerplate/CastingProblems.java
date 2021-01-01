package com.generics.boilerplate;

import com.generics.collection.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CastingProblems {

    public static void main(String[] args) {
        Employee employee1 = new Employee(10,"Hamada",15000);
        Employee employee2 = new Employee(30,"Haleem",18000);
        Employee employee3 = new Employee(20,"Mohamed",14000);

        //boilerplate Code "Not safe"
        List<Object> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

       //ClassCastException:
        String emp =(String) employees.get(1);
        System.out.println(emp.charAt(0));

        //Type safe with generics
        List<Employee> employees2 = new ArrayList<>();
        employees2.add(employee1);
        employees2.add(employee2);
        employees2.add(employee3);

        //boilerplate Code "Not safe"
        Employee emp2 = employees2.get(1);
        System.out.println(emp2.getName().charAt(1));


    }
}
