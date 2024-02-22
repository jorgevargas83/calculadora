//IMPLEMENTACION PARA CREAR CREAR LAS OPERACIONES
package com.mycompany.tarea2_calculadora.controller;

/**
 *
 * @author 1214k
 */
public class FactoryOperaciones implements AbstractFactoryOperaciones{

    @Override
    public OperacionesController efectuarSuma() {
        return new OperarSuma();
    }

    @Override
    public OperacionesController efectuarResta() {
        return new OperarResta();
    }

    @Override
    public OperacionesController efectuarMultiplicacion() {
        return new OperarMultiplicacion();
    }

    @Override
    public OperacionesController efectuarDivision() {
        return new OperarDivision();
    }
    
}
