/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.session;

import javax.ejb.Local;

/**
 *
 * @author pc
 */
@Local
public interface CalcBeanLocal {

    Double Sumar(double a, double b);

    Double Restar(double a, double b);

    Double Multiplicar(double a, double b);

    Double Dividir(double a, double b);

    Double Modulo(double a, double b);

    Double Potencia(double a, double b);
    
}
