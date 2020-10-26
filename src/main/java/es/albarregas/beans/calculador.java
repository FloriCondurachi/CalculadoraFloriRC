/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

/**
 *
 * @author Flori
 */
public class calculador {
    private int operador1;
    private int operador2;
    private String signo;
    private int resultado;
    
    //métodos set y get para todos los atributos.
    public int getOperador1(){
        return operador1;
    }
    public void setOperador1(int operador1){
        this.operador1=operador1;
    }
    private int getOperador2(){
        return operador2;
    }
    private void setOperador2(int operador2){
        this.operador2=operador2;
    }
    private String getSigno(){
        return signo;
    }
    private void setSigno(String signo){
        this.signo=signo;
    }
    private int getResultado(){
        return resultado;
    }
    public void setResultado(int resultado){
        this.resultado=resultado;
    }
    
  
            
}
