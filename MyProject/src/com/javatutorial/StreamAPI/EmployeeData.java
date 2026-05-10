package com.javatutorial.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeData {

    public static ArrayList<Employee> get(){
        return  new ArrayList<Employee>(Arrays.asList(
                new Employee(1,"madan","nalam","Dev","SE",25000.00,30),
                new Employee(2,"nikitha","kola","Dev","QA",35000,45),
                new Employee(3,"akhil","kosala","Dev","SD",45000,25),
                new Employee(4,"sumanth","boss","HR","MR",15000,35)

        ));
    }
}
