/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pack1;

import pack2.Deparment;

/**
 *
 * @author Thai
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee el = new Employee("Nguyen Du Thai", 969898450,"Vinh Ninh");
        Deparment d = new Deparment(3);
        d.addEmployee(el);
        Employee e2 = new Employee("Nguyen Van A", 123898450,"Vinh Quynh");
        d.addEmployee(e2);
        d.DisPlay();
    }
    
}
    