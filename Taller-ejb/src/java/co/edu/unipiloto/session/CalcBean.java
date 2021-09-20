/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.session;

import javax.ejb.Singleton;

/**
 *
 * @author pc
 */
@Singleton
public class CalcBean implements CalcBeanLocal {

    @Override
    public Double Sumar(double a, double b) {
        return a+b;
    }

    @Override
    public Double Restar(double a, double b) {
        return a-b;
    }

    @Override
    public Double Multiplicar(double a, double b) {
        return a*b;
    }

    @Override
    public Double Dividir(double a, double b) {
        return a/b;
    }

    @Override
    public Double Modulo(double a, double b) {
        return a%b;
    }

    @Override
    public Double Potencia(double a, double b) {
        return Math.pow(a,b);
    }
}
