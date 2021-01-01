package com.generics.typeBound;
//any class extends(implements) Comparable
public class SortedTwoEmployee<T extends Comparable<T> > {

    private final T firstEmployee;
    private final  T secondEmployee;

    public SortedTwoEmployee(T firstEmployee, T secondEmployee) {
       if(firstEmployee.compareTo(secondEmployee) < 0 ){
           this.firstEmployee = firstEmployee;
           this.secondEmployee = secondEmployee;
       }else{
           this.firstEmployee = secondEmployee;
           this.secondEmployee = firstEmployee;
       }
    }

    public T getFirstEmployee() {
        return firstEmployee;
    }

    public T getSecondEmployee() {
        return secondEmployee;
    }
}
