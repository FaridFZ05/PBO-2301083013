/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_04_23_24;

/**
 *
 * @author LOQ
 */
public class StudentExample {
    public static void main(String[] args) {
        Person ref;
        Student ali = new Student();
        ali.setName("Ali");
        ali.setAddress("Padang");
        Employee tono = new Employee();
        tono.setName("tono");
        tono.setAddress("Bukittinggi");
        
        printInformation(ali);
        printInformation(tono);
    }
        
    public static void printInformation(Person p){
        if(p instanceof Student){
            System.out.println("Nama Mahasiswa :"+p.getName());
            System.out.println("Alamat         :"+p.getAddress());
        }
        if(p instanceof Employee){
            System.out.println("Nama Karyawan  :"+p.getName());
            System.out.println("Alamat         :"+p.getAddress());
        }
    }
    
}
