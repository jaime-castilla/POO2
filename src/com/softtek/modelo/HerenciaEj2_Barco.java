package com.softtek.modelo;

public class HerenciaEj2_Barco extends HerenciaEj2_Vehiculo{

    //Atributos.
    private String tamaño;

    //Constructor vacio.
    public HerenciaEj2_Barco() {
        super();
    }

    //Constructor lleno.
    public HerenciaEj2_Barco(int anio, int matricula, String tamaño) {
        super(anio, matricula);
        this.tamaño = tamaño;
    }

    //Metodos.
    @Override
    public String acelerar() {
        return super.acelerar();
    }
    @Override
    public String frenar() {
        return super.frenar();
    }
}
