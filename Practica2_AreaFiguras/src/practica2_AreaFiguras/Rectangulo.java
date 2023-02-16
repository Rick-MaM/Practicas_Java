
package practica2_AreaFiguras;


public class Rectangulo {
    
    //Atrivutos del objeto
    private Double base;
    private Double altura;
    private Double area;
    
    //Metodos o comportamiento del objeto
    
    public void setBase(Double base){
        this.base = base;
    }
    
    public Double getBase(){
        return this.base;
    }
    
    public void setAltura(Double Altura){
        this.altura = Altura;
    }
    
    public Double getAltura(){
        return this.altura;
    }
    
    public void CalcularArea(){
        this.area = this.base * this.altura;
    }
    
    public Double getArea(){
        return this.area;
    }
    
}
