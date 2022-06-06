/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack2;

import java.util.ArrayList;
import pack1.Employee;

/**
 *
 * @author Thai
 */
public class Deparment {
    String name;
    Employee emps[];
    int num;
    public Deparment(int N)
    {
        emps = new Employee[N];
        num = 0;
    }
    public void addEmployee(Employee e)
    {
            emps[num] = e;
            num ++;            
    }
    public void DisPlay(){
        int i;
        for (i=0;i<num;i++)
        {
            emps[i].Display();
        }
    }
}
