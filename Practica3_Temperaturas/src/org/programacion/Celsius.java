
package org.programacion;

public class Celsius {
    
    private double valor;
    private double resultado;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResultado() {
        return resultado;
    }

    public void Celsius_Kelvin() {
        this.resultado = this.valor + 273.16;
    }
    
    public void Celsius_Fahrenheit(){
        this.resultado = (this.valor * 9/5) + 32;
    }
    
    
    
}
