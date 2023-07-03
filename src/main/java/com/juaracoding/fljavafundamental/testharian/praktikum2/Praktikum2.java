package com.juaracoding.fljavafundamental.testharian.praktikum2;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 6/28/2023 7:05 PM
@Last Modified 6/28/2023 7:05 PM
Version 1.0
*/

import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {

        /*
        Program untuk mencari nilai rata-rata dari seluruh nilai input.
        User dapat memasukkan angka sepuasnya, jika sudah puas, user tinggal
        memasukkan karakter lain selain angka, kemudian program akan
        mengeluarkan nilai rata-ratanya
         */

        Scanner scanner = new Scanner(System.in);

        double doInput = 0.0;   //Variabel untuk menampung input
        int intCounter = 0;     //Variabel untuk menghitung banyak angka

        try{
            while(true){
                System.out.print("Masukkan angka : ");
                doInput += scanner.nextDouble();
                intCounter++;
            }
        }
        catch(Exception e){
            System.out.println("Nilai rata-ratanya adalah " + doInput/intCounter); //Output nilai rata-rata dari seluruh nlai input
        }
    }
}
