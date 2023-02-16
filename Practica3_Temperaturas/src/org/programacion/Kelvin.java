
package org.programacion;

public class Kelvin {
    
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

    public void Kelvin_Celsius() {
        this.resultado = this.valor - 273.16;
    }
    
    public void Kelvin_Fahrenheit(){
        this.resultado = (this.valor - 273.15) * 9/5 + 32;
    }
    
}
