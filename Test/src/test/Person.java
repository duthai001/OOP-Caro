/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Thai
 */
public class Person {
    private long id;
    private String name;
    public Person() {
    System.out.println("constructor() of person");
    this.id=0;this.name="";
    }
    public Person(long id, String name) {
    this.id = id;
    this.name = name;
    }
    public void display(){
    System.out.println(id+","+name);
    }

}
