/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_05_14_24;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LOQ
 */
public class BilGanjil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka antara 0 dan 10: ");

        try {
            int input = scanner.nextInt();

            if (input < 0) {
                throw new IllegalArgumentException("Input tidak boleh negatif.");
            }

            System.out.println("Angka ganjil dari 0 sampai " + input + " adalah:");

            for (int i = 1; i <= input; i += 2) {
                System.out.println(i);
            }
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
