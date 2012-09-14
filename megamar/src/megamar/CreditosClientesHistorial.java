/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package megamar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedro.lizondo
 */
public class CreditosClientesHistorial extends javax.swing.JDialog {
    private int id_credito;
    private float compra;
    private float pagado;
    private float saldo;
    //private float incremento;
    /**
     * Creates new form CreditosClientes
     */
    public CreditosClientesHistorial(java.awt.Frame parent, boolean modal,int idcliente) {
        super(parent,modal);
        initComponents();
        this.setLocationRelativeTo(null);
        cargartablacreditos(idcliente);
    }
    
    public CreditosClientesHistorial(java.awt.Dialog parent, boolean modal,int idcliente) {
        super(parent,modal);
        initComponents();
        this.setLocationRelativeTo(null);
        cargartablacreditos(idcliente);
    }
    public int getidcredito(){
        return id_credito;
    }
    public float getcompra(){
        return compra;
    }
    public float getpagado(){
        return pagado;
    }
    public float getsaldo(){
        return saldo;
    }
    /*public float getincremento(){
        return incremento;
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacreditos = new javax.swing.JTable();
        jbseleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Cancel.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablacreditos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablacreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablacreditosMouseClicked(evt);
            }
        });
        tablacreditos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tablacreditosFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(tablacreditos);

        jbseleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ok.png"))); // NOI18N
        jbseleccionar.setText("Seleccionar");
        jbseleccionar.setEnabled(false);
        jbseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbseleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 946, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbseleccionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jbseleccionar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablacreditosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacreditosMouseClicked
        jbseleccionar.setEnabled(true);
    }//GEN-LAST:event_tablacreditosMouseClicked

    private void tablacreditosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablacreditosFocusLost
        //jButtonModificar.setEnabled(false);
    }//GEN-LAST:event_tablacreditosFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

private void jbseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbseleccionarActionPerformed
    int fila = tablacreditos.getSelectedRow();
    id_credito = Integer.parseInt(tablacreditos.getValueAt(fila,0).toString());
    compra = Float.parseFloat(tablacreditos.getValueAt(fila,1).toString());
    pagado = Float.parseFloat(tablacreditos.getValueAt(fila,8).toString());
    saldo = Float.parseFloat(tablacreditos.getValueAt(fila,12).toString());
    this.dispose();
}//GEN-LAST:event_jbseleccionarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreditosClientesHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreditosClientesHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreditosClientesHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreditosClientesHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        /*java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CreditosClientes().setVisible(true);
            }
        });*/
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbseleccionar;
    private javax.swing.JTable tablacreditos;
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
    
    private void cargartablacreditos(int idcliente) {
        //String consulta = "SELECT idcredito, compra as 'Compra' FROM credito where idcliente = '"+idcliente+"'";
        String consulta = "SELECT idcredito, compra as 'Compra',(compra*interes/100)+compra as 'Compra Total', plan as 'Plan', interes as 'Interes(%)',cuota as 'Cuota', "
            + "fecha_compra as 'Fecha Compra', estado as 'Estado', pagado as 'Pagado', fecha_cancelacion as 'Cancelacion', credito_numero as 'Credito Num', "
            + "comision as 'Comision(%)', saldo as 'Saldo' "
            + "FROM credito where idcliente = '"+idcliente+"'";
        /*fecha_ultimo_pago as 'Ultimo Pago'    ->   ERROR: no puede mostrar la fecha cuando es del tipo 0000-00-00*/
        try {
            Conectar();
            ResultSet rs = stmt.executeQuery(consulta);
            DefaultTableModel modelo = new DefaultTableModel();
            tablacreditos.setModel(modelo);
            ConversorRSaDefaultTableModel.completar(rs, modelo);
            //codigo para ocultar la primera columna (idplan)
            tablacreditos.getColumnModel().getColumn(0).setMaxWidth(0);
            tablacreditos.getColumnModel().getColumn(0).setMinWidth(0);
            tablacreditos.getColumnModel().getColumn(0).setPreferredWidth(0);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla de Creditos de Clientes.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
