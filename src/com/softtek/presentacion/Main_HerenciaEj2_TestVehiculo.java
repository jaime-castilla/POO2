package com.softtek.presentacion;

import com.softtek.modelo.HerenciaEj2_Vehiculo;
import com.softtek.modelo.HerenciaEj2_Coche;
import com.softtek.modelo.HerenciaEj2_Barco;
import com.softtek.modelo.HerenciaEj2_Avion;
import com.softtek.modelo.HerenciaEj2_Tren;
public class Main_HerenciaEj2_TestVehiculo {

    public static void main(String[] args) {

        HerenciaEj2_Vehiculo vehiculo = new HerenciaEj2_Vehiculo();
        HerenciaEj2_Coche coche = new HerenciaEj2_Coche();
        HerenciaEj2_Barco barco = new HerenciaEj2_Barco();
        HerenciaEj2_Avion avion = new HerenciaEj2_Avion();
        HerenciaEj2_Tren tren = new HerenciaEj2_Tren();

        System.out.println("El vehiculo " + vehiculo.acelerar());
        System.out.println("El coche " + coche.acelerar());
        System.out.println("El barco " + barco.acelerar());
        System.out.println("El avion " + avion.acelerar());
        System.out.println("El tren " + tren.acelerar());

        System.out.println("El vehiculo " + vehiculo.frenar());
        System.out.println("El coche " + coche.frenar());
        System.out.println("El barco " + barco.frenar());
        System.out.println("El avion " + avion.frenar());
        System.out.println("El tren " + tren.frenar());

    }
}
