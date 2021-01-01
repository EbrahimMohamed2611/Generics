package com.generics.passingParameterToGenericType;

import com.generics.collection.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericTypeImplementation {

    public static void main(String[] args) {

        Employee employee1 = new Employee(68,"Ebrahim",15000);
        Employee employee2 = new Employee(73,"Nehad",16000);
        Employee employee3 = new Employee(10,"Hanen",17000);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);


        Collections.sort(employees,
                         new ReverseEmployeeComparatorUsingGenericParameter<>(new EmployeeComparator()));
        System.out.println(employees);




    }
}
