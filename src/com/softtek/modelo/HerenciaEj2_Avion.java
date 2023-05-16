package com.softtek.modelo;

public class HerenciaEj2_Avion extends HerenciaEj2_Vehiculo{

    //Atributos.
    private int capacidad;

    //Constructor vacio.
    public HerenciaEj2_Avion() {
        super();
    }

    //Contructor lleno.
    public HerenciaEj2_Avion(int anio, int matricula, int capacidad) {
        super(anio, matricula);
        this.capacidad = capacidad;
    }


    //Métodos.
    @Override
    public String acelerar() {
        return super.acelerar();
    }
    @Override
    public String frenar() {
        return super.frenar();
    }
}
