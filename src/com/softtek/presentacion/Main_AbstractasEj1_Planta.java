package com.softtek.presentacion;


import com.softtek.modelo.AbstractasEj1_Cactus;
import com.softtek.modelo.AbstractasEj1_Planta;
import com.softtek.modelo.AbstractasEj1_PlantaTropical;

public class Main_AbstractasEj1_Planta {

    public static void main(String[] args) {

        AbstractasEj1_Planta plantaTropical = new AbstractasEj1_PlantaTropical();
        AbstractasEj1_Planta cactus = new AbstractasEj1_Cactus();

        plantaTropical.regar(5,8);
        cactus.regar(4,7);

    }
}
