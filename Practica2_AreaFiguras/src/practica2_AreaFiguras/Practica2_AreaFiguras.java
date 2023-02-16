
package practica2_AreaFiguras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Practica2_AreaFiguras extends JFrame implements ActionListener {
    
    JLabel lblBase,lblAltura,lblArea;
    JTextField txtBase,txtAltura,txtArea;
    JComboBox cbOpcion;
    JButton btnCalcularArea;
    Triangulo t;
    Cuadrado c;
    Rectangulo r;
    Poligono p;
    
    public Practica2_AreaFiguras() {
        this.setBounds(0, 0, 400, 400);
        
        lblBase = new JLabel();
        lblBase.setBounds(10, 20, 130, 20);
        lblBase.setName("lblBase");
        lblBase.setText("Ingrese Base (Lados):");
        lblBase.setVisible(true);
        this.add(lblBase);
        
        txtBase = new JTextField();
        txtBase.setBounds(140, 20, 100, 20);
        txtBase.setName("txtBase");
        txtBase.setText("");
        txtBase.setVisible(true);
        this.add(txtBase);
        
        lblAltura = new JLabel();
        lblAltura.setBounds(10, 50, 160, 20);
        lblAltura.setName("lblAltura");
        lblAltura.setText("Ingrese Altura(Num. Lados):");
        lblAltura.setVisible(true);
        this.add(lblAltura);
        
        txtAltura = new JTextField();
        txtAltura.setBounds(170, 50, 100, 20);
        txtAltura.setName("txtAltura");
        txtAltura.setText("");
        txtAltura.setVisible(true);
        this.add(txtAltura);
        
        lblArea = new JLabel();
        lblArea.setBounds(10, 90, 100, 20);
        lblArea.setName("lblArea");
        lblArea.setText("Area:");
        lblArea.setVisible(true);
        this.add(lblArea);
        
        txtArea = new JTextField();
        txtArea.setBounds(120, 90, 100, 20);
        txtArea.setName("txtArea");
        txtArea.setText("");
        txtArea.setVisible(true);
        this.add(txtArea);
        
        cbOpcion = new JComboBox();
        cbOpcion.setBounds(120, 120, 100, 20);
        cbOpcion.setName("cbOpcion");
        cbOpcion.addItem("Triangulo");
        cbOpcion.addItem("Cuadrado");
        cbOpcion.addItem("Rectangulo");
        cbOpcion.addItem("Poligono");
        cbOpcion.setVisible(true);
        this.add(cbOpcion);
        
        btnCalcularArea = new JButton();
        btnCalcularArea.setBounds(120, 150, 100, 20);
        btnCalcularArea.setName("btnCalcularArea");
        btnCalcularArea.setText("Calcular Area");
        btnCalcularArea.setVisible(true);
        btnCalcularArea.addActionListener(this);
        this.add(btnCalcularArea);
        
        this.setLayout(null);
        this.setVisible(true);
        
        t = new Triangulo();//Crea el objeto
        c = new Cuadrado();
        r = new Rectangulo();
        p = new Poligono();
        
    }
    
    public static void main(String[] args) {
        Practica2_AreaFiguras ob= new Practica2_AreaFiguras();
        ob.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnCalcularArea){
            switch(cbOpcion.getSelectedItem().toString()){
                case "Triangulo":
                    t.setBase(Double.parseDouble(txtBase.getText()));
                    t.setAltura(Double.parseDouble(txtAltura.getText()));
                    t.CalcularArea();
                    txtArea.setText(String.valueOf(t.getArea()));
                    
                    break;
                case "Cuadrado":
                    c.setLado(Double.parseDouble(txtBase.getText()));
                    c.CalcularArea();
                    txtArea.setText(String.valueOf(c.getArea()));
                    
                    ;break;
                case "Rectangulo":
                    r.setBase(Double.parseDouble(txtBase.getText()));
                    r.setAltura(Double.parseDouble(txtAltura.getText()));
                    r.CalcularArea();
                    txtArea.setText(String.valueOf(r.getArea()));
                    
                    break;
                case "Poligono":
                    p.setLado(Double.parseDouble(txtBase.getText()));
                    p.setNum_Lados(Double.parseDouble(txtAltura.getText()));
                    p.CalcularArea();
                    txtArea.setText(String.valueOf(String.format("%.2f",p.getArea())));
                    
                    break;   
            }
           
        }
    }
    
}
