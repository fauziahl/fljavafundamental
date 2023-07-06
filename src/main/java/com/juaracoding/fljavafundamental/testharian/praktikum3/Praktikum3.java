package com.juaracoding.fljavafundamental.testharian.praktikum3;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 7/6/2023 11:41 AM
@Last Modified 7/6/2023 11:41 AM
Version 1.0
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Praktikum3 {
    public static void main(String[] args) {

        /*
        Program untuk mencari nilai rata-rata dari seluruh nilai input.
        User dapat memasukkan angka sepuasnya, jika sudah puas, user tinggal
        memasukkan karakter lain selain angka, kemudian program akan
        mengeluarkan nilai rata-ratanya
         */

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> arrInput = new ArrayList<Double>();   //Array untuk menampung input

        try{
            while(true){
                System.out.print("Masukkan angka (Bilangan bulat atau desimal, contoh: 3.7) : ");
                arrInput.add(scanner.nextDouble());
            }
        }
        catch(Exception e){
            output(arrInput);
        }
    }

    //Method menghitung nilai rata-rata
    public static double rataRata(ArrayList<Double> arrList){
        double dototal = 0.0;   //Variabel untuk menghitung total nilai
        double doResult = 0.0;  //Variabel untuk menampung hasil rata-rata

        //Total nilai input
        for(double i : arrList){
            dototal += i;
        }
        //Rata-rata nilai input
        doResult = dototal/arrList.size();
        return doResult;
    }

    //Method menampilkan nilai-nilai yang diinput
    public static String dataInput(ArrayList<Double> arrList){
        String strDataInput = "";
        for(int i = 0; i < arrList.size(); i++){
            if(i == (arrList.size() - 1)){
                strDataInput = strDataInput + "dan " + arrList.get(i);
            }
            else{
                strDataInput = strDataInput + arrList.get(i) + ", ";
            }
        }

        return strDataInput;
    }

    //Method output yang dihasilkan
    public static void output(ArrayList<Double> arrInput){
        System.out.println("-----------------------------------------");
        System.out.println("User melakukan input data sebanyak " + arrInput.size() + " kali");
        System.out.println("Dengan data input " + dataInput(arrInput));
        System.out.printf("Rata-rata: %.2f \n", rataRata(arrInput));
    }

}
