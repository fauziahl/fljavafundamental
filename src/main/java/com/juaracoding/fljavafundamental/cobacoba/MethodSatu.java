package com.juaracoding.fljavafundamental.cobacoba;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 6/28/2023 8:51 PM
@Last Modified 6/28/2023 8:51 PM
Version 1.0
*/

public class MethodSatu {
    public static void main(String[] args) {
        System.out.println(hitungLuasPersegi(7));
        System.out.println(hitungLuasLayangLayang(5.0,4.0));
    }

    //Menghitung luas persegi
    public static int hitungLuasPersegi(int intSisi)
    {
        int intLuasPersegi = intSisi*intSisi;
        return intLuasPersegi;

    }

    //Menghitung luas Layang-layang
    public static double hitungLuasLayangLayang(double doDiagonal1, double doDiagonal2)
    {
        double doLuasLayangLayang = (doDiagonal1*doDiagonal2)/2;
        return doLuasLayangLayang;
    }
}
