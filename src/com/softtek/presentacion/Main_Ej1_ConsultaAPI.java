package com.softtek.presentacion;

public class Main_Ej1_ConsultaAPI {

    public static void main(String[] args) {

        String cadena = "Bienvenidos al curso de Java";

        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.substring(0,10));
        System.out.println(cadena.substring(23,28));
        System.out.println(cadena.substring(14,20));
        System.out.println(cadena.substring(14,15));
        System.out.println(cadena.length());
        System.out.println(cadena.concat(" con fecha 14 de Septiembre"));

    }


}
