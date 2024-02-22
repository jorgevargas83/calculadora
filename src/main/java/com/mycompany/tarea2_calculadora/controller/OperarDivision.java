//SE IMPLEMENRA CALCULAR
//SE CREA EL CODIGO CONCRETO A DIVIDIR
package com.mycompany.tarea2_calculadora.controller;

/**
 *
 * @author 1214k
 */
public class OperarDivision implements OperacionesController{

    @Override
    public double calcular(double n1, double n2) {
        double resultado = 0;
        
        resultado = n1 / n2;
        
        return resultado;
    }
    
}
