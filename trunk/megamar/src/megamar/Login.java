/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * login.java
 *
 * Created on 07-jun-2012, 21:43:54
 */
package megamar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lizondo1
 */
public class Login extends javax.swing.JFrame {

    /** Creates new form login */
    public Login() {
        initComponents();
        completarcombozonas();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtusuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combozonas = new javax.swing.JComboBox();
        txtpass = new javax.swing.JPasswordField();
        jbaceptar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Megamar Financiera");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));

        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusuario.setPreferredSize(new java.awt.Dimension(150, 20));
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/key_32.png"))); // NOI18N
        jLabel2.setText("Contraseña");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user_32.png"))); // NOI18N
        jLabel1.setText("Usuario");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/acerca.png"))); // NOI18N
        jLabel6.setText("Zona");

        combozonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                combozonasKeyTyped(evt);
            }
        });

        txtpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpass.setPreferredSize(new java.awt.Dimension(150, 20));
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpassKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combozonas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combozonas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbaceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ok.png"))); // NOI18N
        jbaceptar.setText("Aceptar");
        jbaceptar.setActionCommand("");
        jbaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaceptarActionPerformed(evt);
            }
        });
        jbaceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jbaceptarKeyTyped(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Cancel.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.setPreferredSize(new java.awt.Dimension(107, 41));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbaceptar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbaceptar)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jbaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaceptarActionPerformed
    if(combozonas.getSelectedIndex() == 0){
        JOptionPane.showMessageDialog(null,"Seleccione una Zona de la lista.","Error!",JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    String consulta = "Select * from login where usuario = '" + txtusuario.getText() + "' and pass = md5('" + txtpass.getText() + "') ";
    boolean access = false;
    try {
        Conectar();
        ResultSet rs = stmt.executeQuery(consulta);
        rs.last();
        //System.out.println(rs.getRow());
        if (rs.getRow() == 0) {
            JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos. \nPor favor verifique los datos ingresados. ", "Error", JOptionPane.ERROR_MESSAGE);
            limpiarcampos();
        } else {
            access = true;
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error al cargar los datos del Cliente", "Error", JOptionPane.ERROR_MESSAGE);
    }
    if (access == true) {
        Principal P = new Principal(combozonas.getSelectedItem().toString(), combozonas.getSelectedIndex());
        P.setVisible(true);
    }
}//GEN-LAST:event_jbaceptarActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    System.exit(0);
}//GEN-LAST:event_jButton2ActionPerformed

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 10) {
            //transfiere el foco si presionas enter
            txtusuario.transferFocus();
        }
    }//GEN-LAST:event_txtusuarioKeyTyped

    private void combozonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combozonasKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 10) {
            //transfiere el foco si presionas enter
            jbaceptar.requestFocus();
        }
    }//GEN-LAST:event_combozonasKeyTyped

    private void jbaceptarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbaceptarKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 10) {
            //transfiere el foco si presionas enter
            jbaceptar.doClick();
        }
    }//GEN-LAST:event_jbaceptarKeyTyped

    private void txtpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 10) {
            //transfiere el foco si presionas enter
            txtpass.transferFocus();
        }

    }//GEN-LAST:event_txtpassKeyTyped

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combozonas;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbaceptar;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
    private conexion db;
    private Statement stmt;
    
    public void Conectar() {
        try {
            db = new conexion();      //instancia de la clase conexion.java
            db.init();
            Connection conn = db.getMyConnection();
            stmt = conn.createStatement();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problemas al concetarse a la Base de Datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void completarcombozonas() {
        String id;
        String consulta = "Select descripcion from zona";
         try {
            Conectar();
            ResultSet rs = stmt.executeQuery(consulta);
            rs.beforeFirst();
            combozonas.addItem("-");
            while (rs.next()) {
                combozonas.addItem(rs.getString(1));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los RUBROS.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarcampos() {
        //txtusuario.setText("");
        txtpass.setText("");
        combozonas.setSelectedIndex(0);
    }
}
