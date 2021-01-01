package com.generics.collection;

import java.util.*;
import java.util.stream.Collectors;

public class MapCollection {
    public static void main(String[] args) {

        Employee employee1 = new Employee(10,"Hossam",15000);
        Employee employee2 = new Employee(20,"Amin",15000);
        Employee employee3 = new Employee(30,"Elian",17000);

        Map<String,Employee> employeeMap = new HashMap<>();
        employeeMap.put(employee1.getName(),employee1);
        employeeMap.put(employee2.getName(),employee2);
        employeeMap.put(employee3.getName(),employee3);


        System.out.println("========= Using Keys =========");
        Set<String> employeeNames= employeeMap.keySet();
        for (String name:employeeNames){
            System.out.println(employeeMap.get(name));
        }

        System.out.println("========= Using Values =========");
        Collection<Employee> employeeAsValues =  employeeMap.values();

        for (Employee name:employeeAsValues){
            System.out.println(name);
        }

        System.out.println("========= Using Map.Entry<K,V> =========");
        Set<Map.Entry<String,Employee>> employeeFullData = employeeMap.entrySet();
        for (Map.Entry<String,Employee> name:employeeFullData){
            System.out.println(name);
        }


    }
}
