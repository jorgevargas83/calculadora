//INTERFAZ DE LAS OPERACIONES DE LA CALCULADORA
package com.mycompany.tarea2_calculadora.controller;

/**
 *
 * @author 1214k
 */
public interface AbstractFactoryOperaciones {

    OperacionesController efectuarSuma();

    OperacionesController efectuarResta();

    OperacionesController efectuarMultiplicacion();

    OperacionesController efectuarDivision();
}
