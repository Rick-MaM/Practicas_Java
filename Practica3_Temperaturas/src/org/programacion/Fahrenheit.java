
package org.programacion;

public class Fahrenheit {
    
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

    public void Fahrenheit_Celsius() {
        this.resultado = (this.valor - 32) * 5/9;
    }
    
    public void Fahrenheit_Kelvin(){
        this.resultado = (this.valor - 32) * 5/9 + 273.15;
    }
    
}
