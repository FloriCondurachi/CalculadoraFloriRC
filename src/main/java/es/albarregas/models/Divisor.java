/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.models;

import es.albarregas.exceptions.DivisionPorCeroException;

/**
 *
 * @author Flori
 */
public class Divisor {
    public int dividir(int operando1,int operando2)throws DivisionPorCeroException{
       int resultado=0;
       if(operando2 != 0){
           resultado=operando1/operando2;
       }else{
           throw new DivisionPorCeroException("ERROR.No se puede dividir por 0.");
       }
       return resultado;
    }
    
}
