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

public class ConsTwo {
    public static void main(String[] args) {
        ConsOne consOne = new ConsOne();
        //System.out.println(consOne.getStrKata());

        consOne.setStrKata("Hola");
        //System.out.println(consOne.getStrKata());

        consOne = new ConsOne("Hai", 11);
        System.out.println(consOne.getStrKata());
    }
}
