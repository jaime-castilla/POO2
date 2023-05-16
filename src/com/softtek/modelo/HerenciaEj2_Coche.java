package com.softtek.modelo;

public class HerenciaEj2_Coche extends HerenciaEj2_Vehiculo{

    //Atributos
    private String marca;
    private String color;

    //Constructor vacio.
    public HerenciaEj2_Coche() {
        super();
    }

    //Contructor lleno.
    public HerenciaEj2_Coche( int anio, int matricula, String marca, String color) {
        super(anio, matricula);
        this.marca = marca;
        this.color = color;
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
