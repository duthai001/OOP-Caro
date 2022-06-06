/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Thai
 */
public class Employee extends Person {
    private float salary;
public Employee() {
this.salary=0;
}
public Employee(float salary, long
id, String name) {
super(id, name);
this.salary = salary;
}
public void display(){
super.display();
System.out.println("has salary:"+this.salary+"$");
}

}
