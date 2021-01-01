package com.generics.generciInterfacesAndClases;

import com.generics.collection.Employee;

import java.util.Comparator;

public class EmployeeComparatorUsingId implements Comparator<Employee> {
    @Override
    public int compare(Employee left, Employee right) {

        return Integer.compare(left.getId(), right.getId());
    }
}
