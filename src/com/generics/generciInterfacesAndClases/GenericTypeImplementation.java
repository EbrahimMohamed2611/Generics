package com.generics.generciInterfacesAndClases;

import com.generics.collection.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.generics.collection.Employee;

public class GenericTypeImplementation {

    public static void main(String[] args) {

        Employee employee1 = new Employee(57,"Ebrahim",15000);
        Employee employee2 = new Employee(63,"Taha",16000);
        Employee employee3 = new Employee(10,"Mohsen",17000);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        Collections.sort(employees, new EmployeeComparatorUsingId());
        System.out.println(employees);

        System.out.println("Using lambda Expression");
        Collections.sort(employees, (emp1, emp2)->Integer.compare(emp1.getId(), emp2.getId()));

        System.out.println("Using Method Reference");
        Collections.sort(employees, Comparator.comparingInt(Employee::getId));
        System.out.println(employees);

        System.out.println("Using anonymous inner class");
        Collections.sort(employees, new Comparator<Employee>()
        {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return Integer.compare(employee1.getId(), employee2.getId());
            }
        });
        System.out.println(employees);
    }
}
