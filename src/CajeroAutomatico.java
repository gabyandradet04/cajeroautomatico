/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
public class CajeroAutomatico extends javax.swing.JFrame {

    /**
     * Creates new form CajeroAutomatico
     */
     int acumulador=0;
     int saldo;
     int retiro;
     int deb;
     int cuenta;
     int i=0;
    
    
    public CajeroAutomatico() {
        
        initComponents();
        setLocationRelativeTo(null);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        total = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        btndebito = new javax.swing.JButton();
        debito = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        btntotal = new javax.swing.JButton();
        txt4 = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        monto = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombre.setText("NOMBRE:");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 149, -1));

        total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total.setText("TOTAL:");
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 149, -1));

        btndebito.setText("DEBITO");
        btndebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndebitoActionPerformed(evt);
            }
        });
        getContentPane().add(btndebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        debito.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        debito.setText("DEBITO");
        getContentPane().add(debito, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 149, -1));

        btntotal.setText("TOTAL");
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });
        getContentPane().add(btntotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 80, -1));
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 149, -1));

        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        monto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        monto.setText("MONTO:");
        getContentPane().add(monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        label2.setText("jLabel2");
        label2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 220, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/collage_banco.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 580, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
      
            saldo=Integer.parseInt(this.txt2.getText());
            acumulador=acumulador+saldo;
            label2.setText(String.valueOf(acumulador));
         
       
       
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btndebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndebitoActionPerformed
        // TODO add your handling code here:
        retiro=Integer.parseInt(this.txt3.getText());
        deb=deb+retiro;
        label2.setText(String.valueOf(deb));
    }//GEN-LAST:event_btndebitoActionPerformed

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
        // TODO add your handling code here:
        cuenta=acumulador-deb;
        txt4.setText(String.valueOf(cuenta));
    }//GEN-LAST:event_btntotalActionPerformed

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
            java.util.logging.Logger.getLogger(CajeroAutomatico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CajeroAutomatico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CajeroAutomatico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CajeroAutomatico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CajeroAutomatico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btndebito;
    private javax.swing.JButton btntotal;
    private javax.swing.JLabel debito;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel monto;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel total;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    // End of variables declaration//GEN-END:variables
}
