package com.juaracoding.fljavafundamental.cobacoba;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 7/3/2023 5:39 PM
@Last Modified 7/3/2023 5:39 PM
Version 1.0
*/

import java.util.Random;

public class FungsiRandom {
    /*
    Membuat 10 data email dengan mekanisme Random dengan format:
    - Huruf awal kapital [A-Z], sisanya huruf kecil [a-z]
    - Interval length 8-20
    - Format email
    - [A-Z][a-z] interval length 8-20, @, provider(gmail, yahoo, dll), domain(com, co.id, id)
     */
    public static void main(String[] args) {
        Random random = new Random();

        String strEmail = "";       //Variabel untuk menampung data email
        String strProvider [] = {"gmail", "yahoo", "rocketmail","juaracoding"};
        String strDomain [] = {".com", ".co.id",".id"};

        int intLengthBegin = 8;     //Random length kata awal
        int intLengthEnd = 20;      //Random length kata akhir
        int intKapitalAwal = 65;    //Random ASCII huruf kapital awal
        int intKapitalAkhir = 91;   //Random ASCII huruf kapital akhir
        int intCharAwal = 97;       //Random ASCII huruf kecil awal
        int intCharAkhir = 123;     //Random ASCII huruf kecil akhir

        char chHurufBesar = 'A';
        char chHurufKecil = 'a';

        for (int i = 0; i < 10; i++) {
            strEmail = "";
            int intRandomLength = random.nextInt(intLengthBegin, intLengthEnd);
            int intRandomProvider = random.nextInt(0, 4);   //Random provider
            int intRandomDomain = random.nextInt(0, 3);     //Random domain

            for (int j = 0; j < intRandomLength; j++) {
                //Huruf kapital di awal email
                if (j == 0) {
                    chHurufBesar = (char) random.nextInt(intKapitalAwal, intKapitalAkhir);
                    strEmail = strEmail + chHurufBesar;
                }

                //Huruf kecil sisanya
                else {
                    chHurufKecil = (char) random.nextInt(intCharAwal, intCharAkhir);
                    strEmail = strEmail + chHurufKecil;
                }

            }
            //Hasil output email
            System.out.println(strEmail.concat("@").concat(
                    strProvider[intRandomProvider]).concat(
                    strDomain[intRandomDomain]));
        }
    }
}
