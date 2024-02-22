//SE IMPLEMENTA CALCULAR
//SE CREA EL CODIGO CONCRETO PARA RESTAR
package com.mycompany.tarea2_calculadora.controller;

/**
 *
 * @author 1214k
 */
public class OperarResta implements OperacionesController{

    @Override
    public double calcular(double n1, double n2) {
        double resultado = 0;

        resultado = n1 - n2;

        return resultado;
    }
    
}
