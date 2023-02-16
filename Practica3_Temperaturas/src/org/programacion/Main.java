
package org.programacion;


public class Main extends javax.swing.JFrame {

    Celsius c;
    Kelvin k;
    Fahrenheit f;
    public Main() {
        initComponents();
        c = new Celsius();
        k = new Kelvin();
        f = new Fahrenheit();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblValor = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        rbCK = new javax.swing.JRadioButton();
        rbKC = new javax.swing.JRadioButton();
        rbCF = new javax.swing.JRadioButton();
        rbFC = new javax.swing.JRadioButton();
        lblTitulo = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();
        rbKF = new javax.swing.JRadioButton();
        rbFK = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValor.setText("Ingrese valor");

        lblResultado.setText("Resultado");

        txtResultado.setEditable(false);

        buttonGroup1.add(rbCK);
        rbCK.setText("Celsius-Kelvin");

        buttonGroup1.add(rbKC);
        rbKC.setText("Kelvin-Celsius");
        rbKC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKCActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbCF);
        rbCF.setText("Celsius-Fahrenheit");

        buttonGroup1.add(rbFC);
        rbFC.setText("Fahrenheit-Celsius");

        lblTitulo.setText("Convercion entre temperaturas");

        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbKF);
        rbKF.setText("Kelvin-Fahrenheit");

        buttonGroup1.add(rbFK);
        rbFK.setText("Fahrenheit-Kelvin");
        rbFK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblResultado)
                            .addComponent(lblValor))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtValor)
                            .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbFK)
                    .addComponent(rbFC)
                    .addComponent(rbCF)
                    .addComponent(rbKC)
                    .addComponent(rbCK)
                    .addComponent(rbKF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblResultado)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbKC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbCF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbFC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbKF)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbFK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbKCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbKCActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        if(rbCK.isSelected()){
            c.setValor(Double.parseDouble(txtValor.getText()));
            c.Celsius_Kelvin();
            txtResultado.setText(String.valueOf(c.getResultado()));
        }
        else if(rbKC.isSelected()){
            k.setValor(Double.parseDouble(txtValor.getText()));
            k.Kelvin_Celsius();
            txtResultado.setText(String.valueOf(k.getResultado()));
        }
        else if(rbCF.isSelected()){
            c.setValor(Double.parseDouble(txtValor.getText()));
            c.Celsius_Fahrenheit();
            txtResultado.setText(String.valueOf(String.format("%.2f",c.getResultado())));
        }
        else if(rbFC.isSelected()){
            f.setValor(Double.parseDouble(txtValor.getText()));
            f.Fahrenheit_Celsius();
            txtResultado.setText(String.valueOf(String.format("%.2f",f.getResultado())));
        }
        else if(rbKF.isSelected()){
            k.setValor(Double.parseDouble(txtValor.getText()));
            k.Kelvin_Fahrenheit();
            txtResultado.setText(String.valueOf(String.format("%.2f",k.getResultado())));
        }
        
        else if(rbFK.isSelected()){
            f.setValor(Double.parseDouble(txtValor.getText()));
            f.Fahrenheit_Kelvin();
            txtResultado.setText(String.valueOf(String.format("%.2f",f.getResultado())));
        }
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void rbFKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JRadioButton rbCF;
    private javax.swing.JRadioButton rbCK;
    private javax.swing.JRadioButton rbFC;
    private javax.swing.JRadioButton rbFK;
    private javax.swing.JRadioButton rbKC;
    private javax.swing.JRadioButton rbKF;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
