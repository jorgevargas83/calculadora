package com.mycompany.tarea2_calculadora;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;
import com.mycompany.tarea2_calculadora.vista.Calculadora;

/**
 *
 * @author 1214k
 */
public class Tarea2_calculadora {

    public static void main(String[] args) {
        System.out.println("Hello World!"); //HOLA MUNDO :D
        FlatMaterialDeepOceanIJTheme.setup(); //TEMA DE LA CALCULADORA
        Calculadora calculadora = new Calculadora();
        calculadora.setVisible(true);
    }
}
