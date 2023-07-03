package com.juaracoding.fljavafundamental.testharian.praktikum1;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 6/27/2023 12:26 AM
@Last Modified 6/27/2023 12:26 AM
Version 1.0
*/

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
    /*
    Program untuk mencari nilai dari suatu input string

    Percobaan pertama
    (Input)		Kata    : Jquery 1995@v1.0
    (Output)	Hasil	: 529

    Percobaan kedua
    (Input) 	Kata    : Bebas Lepas@
    (Output)	Hasil	: 238

    Berapakah output jika kata yang diinput adalah Tid4k $@ma?
    */
        Scanner scanner = new Scanner(System.in);

        String strInput = "";   //Variabel untuk menampung input string
        char chInput = 'a';     //Variabel untuk menampung karakter string
        int intCharacter = 0;   //Variabel untuk convert huruf menjadi kode ASCII
        int intResult = 0;      //Variabel untuk menampung hasil penjumlahan character string

        /*
        Setelah dianalisa, nilai ASCII yang digunakan adalah
        ASCII huruf kapital, angka, simbol-simbol, dan karakter spasi
        yaitu dari nilai 32 s.d 90
        */

        //step1
        System.out.print("Masukan Kata: ");
        strInput = scanner.nextLine();

        //step2
        for(int i = 0; i < strInput.length(); i++){
            //step3
            chInput = strInput.charAt(i);

            //step4
            intCharacter = chInput;

            //step5
            if(intCharacter >= 32 && intCharacter <= 90){    //Kode ASCII yang digunakan dalam perhitungan
                intResult += intCharacter;
            }
        }

        //step6
        System.out.println("Output dari " + strInput + " adalah " + intResult);   //Hasil output dari suatu input string

        /*
        Masukan Kata: Tid4k $@ma
        Output dari Tid4k $@ma adalah 268
         */

    }
}