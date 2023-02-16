
package practica2_AreaFiguras;


public class Cuadrado {
    
    //Atrivutos del objeto
    private Double Lado;
    private Double area;
    
    //Metodos o comportamiento del objeto
    
    public void setLado(Double lado_1){
        this.Lado = lado_1;
    }
    
    public Double getLado(){
        return this.Lado;
    }
    

    
    public void CalcularArea(){
        this.area = this.Lado * this.Lado;
    }
    
    public Double getArea(){
        return this.area;
    }
    
}
