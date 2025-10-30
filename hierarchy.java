/*
*Inheritance (Single and Multilevel)
*Topic: Inheritance
*Objective: To demonstrate single and multilevel inheritance in Java.
*Problem Statement:
*Create a class hierarchy:
*    Class Person → attributes: name, age
*    Class Employee extends Person → attributes: empId, salary
*    Class Manager extends Employee → attribute: department
*Display all manager details using constructors and the super keyword.
*Concepts Covered: Inheritance, Constructor Chaining, super Keyword 
*/


class Person{
    String name;
    int age;
    
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    
    void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Employee extends Person{
    int empID, salary;
    Employee(String name, int age, int empID, int salary){
        super(name,age);
        this.empID=empID;
        this.salary=salary;
    }
    void displayEmployee(){
        displayPerson();
        System.out.println("Employee ID: "+empID);
        System.out.println("Salary: "+salary);
    }
}

class Manager extends Employee{
    String department;
    Manager(String name, int age, int empID, int salary, String department){
        super(name, age, empID, salary);
        this.department=department;
    }
    void displayManager(){
        displayEmployee();
        System.out.println("Department: "+department);
    }
}
public class hierarchy{
    public static void main(String args[]){
        Manager m1=new Manager("Kartik", 20, 121, 500000,"Tech");
        m1.displayManager();
    }
}