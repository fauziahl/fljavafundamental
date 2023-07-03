package com.juaracoding.fljavafundamental.cobacoba;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 7/3/2023 9:03 PM
@Last Modified 7/3/2023 9:03 PM
Version 1.0
*/

import java.util.Scanner;

public class ProgramUpperLowerCase {
    public static void main(String[] args) {
        /*
        Buat Fungsi untuk cek Huruf
        jika memang inputan adalah huruf maka
        kembaliannya , huruf besar atau kecil dari inputan
         */

        Scanner scanner = new Scanner(System.in);

        String strInput = "";   //Variabel untuk menampung input string
        char chInput = 'a';     //Variabel untuk menampung karakter string
        int intHuruf = 0;       //Variabel untuk convert huruf menjadi kode ASCII

        System.out.print("Masukan Huruf: ");
        strInput = scanner.next();
        chInput = strInput.charAt(0);
        intHuruf = chInput;
        System.out.println(programUpperLowerCase(intHuruf));
    }

        public static String programUpperLowerCase(int intCharacter) {
            String strOutput = "";

            //Jika huruf besar
            if (intCharacter >= 65 && intCharacter <= 90) {
                strOutput = "Ini huruf besar";
            }

            //Jika huruf kecil
            else if (intCharacter >= 97 && intCharacter <= 122) {
                strOutput = "Ini huruf kecil";
            }

            //Jika bukan huruf
            else {
                strOutput = "Ini bukan huruf";
            }

            return strOutput;
        }
}
