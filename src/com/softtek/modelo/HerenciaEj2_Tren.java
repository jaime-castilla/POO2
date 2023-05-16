package com.softtek.modelo;

public class HerenciaEj2_Tren extends HerenciaEj2_Vehiculo{

    //Atributos.
    private int longitud;

    //Constructor vacio.
    public HerenciaEj2_Tren() {
    }

    //Constructor lleno.
    public HerenciaEj2_Tren(int anio, int matricula, int longitud) {
        super(anio, matricula);
        this.longitud = longitud;
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
