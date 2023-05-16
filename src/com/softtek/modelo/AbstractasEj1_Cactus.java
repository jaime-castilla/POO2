package com.softtek.modelo;

public class AbstractasEj1_Cactus extends AbstractasEj1_Planta{

    @Override
    public void regar(int cantidad, int tiempo) {

        String resultado1 = "El cactus se ha regado";

        System.out.println(resultado1);

    }
}
