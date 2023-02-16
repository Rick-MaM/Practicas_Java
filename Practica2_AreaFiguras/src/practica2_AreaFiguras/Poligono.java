
package practica2_AreaFiguras;


public class Poligono {
    
    private Double Lado;
    private Double Num_Lados;
    private Double area;
    
    public void setLado(Double lado){
        this.Lado = lado;
    }
    
    public Double getLado(){
        return this.Lado;
    }
    
    public void setNum_Lados(Double num_lados){
        this.Num_Lados = num_lados;
    }
    
    public Double getNum_Lados(){
        return this.Num_Lados;
    }
    
    public void CalcularArea(){
        Double O = 360 / (2 * this.Num_Lados);
        Double Conv = Math.toRadians(O);
        Double Apotema = this.Lado / (2 * Math.tan(Conv));
        Double P = this.Lado * this.Num_Lados;
        this.area = (P * Apotema) / 2;
    }
    
    public Double getArea(){
        return this.area;
    }
}
