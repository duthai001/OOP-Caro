
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truutuong;

/**
 *
 * @author Thai
 */
public abstract class Animal {
    String Name;
    public Animal(){
        this.Name = "";
    }
    abstract void sayHello();
    
    public String getName()
    {
        return this.Name;
    }
}
