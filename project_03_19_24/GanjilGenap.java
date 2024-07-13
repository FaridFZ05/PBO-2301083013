/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_03_19_24;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class GanjilGenap {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat : ");
        a = input.nextInt();
        if(a%2==0)
            System.out.print(a + " = Merupakan bilangan genap");
        else //a mod 2 = 1
            System.out.print(a + " = Merupakan bilangan genjil");
    }
    
}
