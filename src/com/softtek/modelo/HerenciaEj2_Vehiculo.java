package com.softtek.modelo;

public class HerenciaEj2_Vehiculo {

    //Atributos
    protected int anio;
    protected int matricula;

    //Constructor vacio.
    public HerenciaEj2_Vehiculo() {

    }
    //Constructor lleno.
    public HerenciaEj2_Vehiculo(int anio, int matricula) {
        this.anio = anio;
        this.matricula = matricula;
    }


    //Métodos.
    public String acelerar() {

        return "está acelerando...";

    }
    public String frenar() {

        return "está frenando...";

    }
}
