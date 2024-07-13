/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_04_23_24;

/**
 *
 * @author LOQ
 */
public class Student extends Person {
    public Student() {
        super();
        //super("Ali","Padang");
        System.out.println("Student Constructor");
        super.name="Ali";
        super.address="Padang";
    }
    
    @Override
    public String getName(){
        System.out.println("Student: getName");
        return name;
    }

}
