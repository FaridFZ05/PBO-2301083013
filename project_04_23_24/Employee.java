/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_04_23_24;

/**
 *
 * @author LOQ
 */
public class Employee extends Person {
    public Employee() {
        super();
        System.out.println("Employee Manager");
        super.name="Tono";
        super.address="Bukittinggi";
    }
    
    @Override
    public String getName(){
        System.out.println("Employee Name:" + name);
        return name;
    }
}
