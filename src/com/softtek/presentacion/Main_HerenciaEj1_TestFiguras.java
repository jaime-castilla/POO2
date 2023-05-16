package com.softtek.presentacion;

import com.softtek.modelo.HerenciaEj1_Figura;
import com.softtek.modelo.HerenciaEj1_Circulo;
import com.softtek.modelo.HerenciaEj1_Rectangulo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main_HerenciaEj1_TestFiguras {

    public static void main(String[] args) {

        HerenciaEj1_Figura figura = new HerenciaEj1_Figura(1,6);
        HerenciaEj1_Circulo circulo = new HerenciaEj1_Circulo(5,3,8);
        HerenciaEj1_Rectangulo rectangulo = new HerenciaEj1_Rectangulo(2,4,9,5);

        System.out.println("La posición de la figura es: " + figura.posicion());
        System.out.println("La posición del circulo es: " + circulo.posicion());
        System.out.println("La posición del rectangulo es: " + rectangulo.posicion());

    }
}