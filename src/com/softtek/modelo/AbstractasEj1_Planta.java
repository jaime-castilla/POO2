package com.softtek.modelo;

 public abstract class AbstractasEj1_Planta {

    //Atributos.
    private String nombreCientifico;
    private int edad;

    //Constructor vacio.
    public AbstractasEj1_Planta() {
    }

    //Contructor lleno.
    public AbstractasEj1_Planta(String nombreCientifico, int edad) {
        this.nombreCientifico = nombreCientifico;
        this.edad = edad;
    }

    //Método.
    public abstract void regar(int cantidad, int tiempo);


}
