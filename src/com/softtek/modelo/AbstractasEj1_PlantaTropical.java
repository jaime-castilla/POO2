package com.softtek.modelo;

public class AbstractasEj1_PlantaTropical extends AbstractasEj1_Planta {

    @Override
    public void regar(int cantidad, int tiempo) {

        String resultado = "La planta tropical se ha regado";

        System.out.println(resultado);

    }
}
