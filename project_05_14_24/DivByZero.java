/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_05_14_24;

/**
 *
 * @author LOQ
 */
public class DivByZero {

    public static void main(String[] args) {
        try {
            int angka = Integer.parseInt(args[0]);
            System.out.println(3 / angka);
            System.out.println("Cetak");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Argument TIdak Ada  :" + ex.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println("Bagi dengan 0   :" + ex.getMessage());
        } finally {
            System.out.println("Block Finally Exception");
        }
    }

    
}
