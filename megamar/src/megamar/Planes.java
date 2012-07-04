/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Planes.java
 *
 * Created on 08-jun-2012, 3:28:13
 */
package megamar;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Lizondo1
 */
public class Planes extends javax.swing.JDialog {

    /** Creates new form Planes */
    public Planes(java.awt.Frame parent, boolean modal) {
        super(parent,modal);
        initComponents();
        this.setSize(new Dimension(500, 350));
        jpanelnuevoplan.setVisible(false);
        this.setLocationRelativeTo(null);
        completartablaplanes();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonModificar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaplanes = new javax.swing.JTable();
        jpanelnuevoplan = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtsemanas = new javax.swing.JTextField();
        txtinteres = new javax.swing.JTextField();
        txtcomision = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion de Planes");

        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/planes_editar_48.png"))); // NOI18N
        jButtonModificar.setText("Modificar Plan");
        jButtonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonModificar.setEnabled(false);
        jButtonModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonModificar.setIconTextGap(1);
        jButtonModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/planes_nuevo_48.png"))); // NOI18N
        jButton1.setText("Nuevo Plan");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(1);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Planes"));

        tablaplanes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaplanes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaplanesMouseClicked(evt);
            }
        });
        tablaplanes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tablaplanesFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(tablaplanes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanelnuevoplan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Plan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));

        jPanel6.setLayout(new java.awt.GridLayout(3, 0, 5, 5));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Semanas");
        jPanel6.add(jLabel1);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Interés (%)");
        jPanel6.add(jLabel16);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Comision (%)");
        jPanel6.add(jLabel2);

        jPanel5.setLayout(new java.awt.GridLayout(3, 0, 5, 5));
        jPanel5.add(txtsemanas);
        jPanel5.add(txtinteres);
        jPanel5.add(txtcomision);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save_32.png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.setPreferredSize(new java.awt.Dimension(125, 41));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Cancel.png"))); // NOI18N
        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelnuevoplanLayout = new javax.swing.GroupLayout(jpanelnuevoplan);
        jpanelnuevoplan.setLayout(jpanelnuevoplanLayout);
        jpanelnuevoplanLayout.setHorizontalGroup(
            jpanelnuevoplanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelnuevoplanLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jpanelnuevoplanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelnuevoplanLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelnuevoplanLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(21, 21, 21))))
        );
        jpanelnuevoplanLayout.setVerticalGroup(
            jpanelnuevoplanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelnuevoplanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelnuevoplanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jpanelnuevoplanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButtonModificar)
                .addGap(235, 235, 235))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelnuevoplan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButtonModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelnuevoplan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.setSize(new Dimension(500, 550));
    jpanelnuevoplan.setVisible(true);
    //jpanelmodificarzona.setVisible(false);
}//GEN-LAST:event_jButton1ActionPerformed

private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
    int fila = tablaplanes.getSelectedRow();
    String idplan =String.valueOf(tablaplanes.getValueAt(fila,0));
    ModificarPlan M = new ModificarPlan(idplan,this,true);
    M.setVisible(true);
}//GEN-LAST:event_jButtonModificarActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    this.dispose();
}//GEN-LAST:event_jButton6ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String semanas = txtsemanas.getText();
    String interes = txtinteres.getText();
    String comision = txtcomision.getText();
    if(Integer.parseInt(comision) > 5){
        JOptionPane.showMessageDialog(null, "Error! La comision no puede ser mayor a 5%. ","Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    String consulta = "insert into plan (semanas,interes,comision) values('" + semanas + "', '" + interes + "', '" + comision + "' )";
    try {
        Conectar();
        int done = stmt.executeUpdate(consulta);
        //JOptionPane.showMessageDialog(null,"alta","Aviso",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Se guardaron los datos del plan", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        db.close(stmt);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Error! No se pudo guardar los datos de la zona", JOptionPane.ERROR_MESSAGE);
    }
    db.destroy();
    this.dispose();
}//GEN-LAST:event_jButton2ActionPerformed

private void tablaplanesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaplanesMouseClicked
    jButtonModificar.setEnabled(true);
}//GEN-LAST:event_tablaplanesMouseClicked

private void tablaplanesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablaplanesFocusLost
    //jButtonModificar.setEnabled(false);
}//GEN-LAST:event_tablaplanesFocusLost

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
            java.util.logging.Logger.getLogger(Planes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Planes().setVisible(true);
            }
        });*/
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpanelnuevoplan;
    private javax.swing.JTable tablaplanes;
    private javax.swing.JTextField txtcomision;
    private javax.swing.JTextField txtinteres;
    private javax.swing.JTextField txtsemanas;
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
    
    private void completartablaplanes() {
        String consulta = "Select idplan as Plan, semanas as Semanas, interes as 'Interes (%)', comision as 'Comision(%)' from plan ";
        try {
            Conectar();
            ResultSet rs = stmt.executeQuery(consulta);
            DefaultTableModel modelo = new DefaultTableModel();
            tablaplanes.setModel(modelo);
            ConversorRSaDefaultTableModel.completar(rs, modelo);
            //codigo para ocultar la primera columna (idplan)
            tablaplanes.getColumnModel().getColumn(0).setMaxWidth(0);
            tablaplanes.getColumnModel().getColumn(0).setMinWidth(0);
            tablaplanes.getColumnModel().getColumn(0).setPreferredWidth(0);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla de clientes.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}