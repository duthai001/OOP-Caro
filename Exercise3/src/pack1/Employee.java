/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack1;

/**
 *
 * @author Thai
 */
public class Employee {
    String name;
    long phone;
    String address;
    public Employee(){}
    public Employee(String name, long phone, String address){
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
    public void Display(){
    System.out.printf("%s %d %s\n",this.name,this.phone,this.address);
    }
}
