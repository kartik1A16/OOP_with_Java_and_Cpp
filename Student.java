/*
 * Topic: Data Hiding and Abstraction using Classes and Methods 
 * Objective: To implement encapsulation using access modifiers 
 *      and abstraction using class methods. 
 * Problem Statement: Create a class Student with private data members name, 
 *      rollNo, and marks. Provide public getter and setter methods 
 *      to access and update data. Add a method display() to print student details.
 * Concepts Covered: Encapsulation, Abstraction, Access Modifiers
 */
public class Student {
    // Private data members
    private String name;
    private int rollNo;
    private double marks;
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getRollNo() {
        return rollNo;
    }
    
    public double getMarks() {
        return marks;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    
    public void setMarks(double marks) {
        this.marks = marks;
    }
    
    // Method to display student details
    public void display() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    // Main method
    public static void main(String args[]){

        Student s1 = new Student();
        s1.setName("Kartik");
        s1.setRollNo(48);
        s1.setMarks(95.0);
        s1.display();
    }
}

/*The implementation follows the principles of:

Encapsulation: Data members are private and accessed only through public methods
Data Hiding: Direct access to class variables is prevented
Abstraction: Internal implementation is hidden, only method interfaces are exposed */
