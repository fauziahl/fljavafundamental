package com.juaracoding.fljavafundamental.cobacoba;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 7/4/2023 8:01 PM
@Last Modified 7/4/2023 8:01 PM
Version 1.0
*/

public class ConsOne {

    private String strKata;
    private int intAngka;

    public ConsOne(){
        strKata = "Hello";
    }

    public ConsOne(String strKata, int intAngka){
        this.strKata = strKata;
        this.intAngka = intAngka;

        //System.out.println(strKata);
        System.out.println(intAngka);
    }

    public String getStrKata() {
        return strKata;
    }

    public void setStrKata(String strKata) {
        this.strKata = strKata;
    }

}
