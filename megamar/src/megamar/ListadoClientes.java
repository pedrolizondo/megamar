/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ListadoClientes.java
 *
 * Created on 08-jun-2012, 2:36:46
 */
package megamar;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;*/


/**
 *
 * @author Lizondo1
 */
public class ListadoClientes extends javax.swing.JDialog {
    //private JFrame frameclientes;
    private String idzona;
    private String idcliente="";
    /** Creates new form ListadoClientes */
    public ListadoClientes(String idz, java.awt.Dialog parent, boolean modal) {
        super(parent,modal);
        initComponents();
        this.setLocationRelativeTo(null);
        //frameclientes = framecli;
        idzona = idz;
        completartablaclientes(idzona,"");   //idzona, dni o apellido
    }
    
    public String getidcliente(){
        return idcliente;
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
        jLabel1 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaclientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado de Clientes");
        setPreferredSize(new java.awt.Dimension(1024, 570));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Cliente"));

        jLabel1.setText("DNI o Apellido");

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        jButton2.setText("Imprimir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ok.png"))); // NOI18N
        jButton1.setText("Seleccionar");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaclientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
    completartablaclientes(idzona, txtbuscar.getText());
}//GEN-LAST:event_txtbuscarKeyReleased

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int fila = tablaclientes.getSelectedRow();
    idcliente = String.valueOf(tablaclientes.getValueAt(fila,0));
    this.dispose();
}//GEN-LAST:event_jButton1ActionPerformed

    private void tablaclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclientesMouseClicked
        jButton1.setEnabled(true);
    }//GEN-LAST:event_tablaclientesMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CrearReporte();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ListadoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ListadoClientes().setVisible(true);
            }
        });*/
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaclientes;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
    private conexion db;
    private Statement stmt;
    private Connection conn;
    
    public void Conectar() {
        try {
            db = new conexion();      //instancia de la clase conexion.java
            db.init();
             conn = db.getMyConnection();
            stmt = conn.createStatement();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problemas al concetarse a la Base de Datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void completartablaclientes(String idzona, String buscar) {
        String consulta = "Select idcliente as 'Codigo', CONCAT(apellido,', ',nombre) as 'Nombre', dni as DNI, num_creditos as Creditos, r.descripcion as 'Rubro', "
                + "domicilio_particular as 'Domicilio Particular', barrio_particular as 'Barrio Particular', domicilio_comercial as 'Domicilio Comercial', "
                + "barrio_comercial as 'Barrio Comercial', telefono as 'Telefono', perno as 'Perno', estado as 'Estado' "
                + "from cliente c, rubro r where c.idrubro=r.idrubro and c.idzona='" + idzona + "' and (dni like '%" + buscar + "%' or apellido like '%" + buscar + "%') ";
        try {
            Conectar();
            ResultSet rs = stmt.executeQuery(consulta);

            DefaultTableModel modelo = new DefaultTableModel();
            tablaclientes.setModel(modelo);
            ConversorRSaDefaultTableModel.completar(rs, modelo);
            //codigo para ocultar la primera columna (idplan)
            tablaclientes.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaclientes.getColumnModel().getColumn(0).setMinWidth(50);
            tablaclientes.getColumnModel().getColumn(1).setMaxWidth(100);
            tablaclientes.getColumnModel().getColumn(1).setMinWidth(100);
            tablaclientes.getColumnModel().getColumn(2).setMaxWidth(70);
            tablaclientes.getColumnModel().getColumn(2).setMinWidth(70);
            tablaclientes.getColumnModel().getColumn(3).setMaxWidth(60);
            tablaclientes.getColumnModel().getColumn(3).setMinWidth(60);
            tablaclientes.getColumnModel().getColumn(9).setMaxWidth(70);
            tablaclientes.getColumnModel().getColumn(9).setMinWidth(70);
            tablaclientes.getColumnModel().getColumn(10).setMaxWidth(50);
            tablaclientes.getColumnModel().getColumn(10).setMinWidth(50);
            tablaclientes.getColumnModel().getColumn(11).setMaxWidth(50);
            tablaclientes.getColumnModel().getColumn(11).setMinWidth(50);
            tablaclientes.getColumnModel().getColumn(0).setPreferredWidth(50);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla de clientes.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void CrearReporte(){
        
        
        
        /*try {
            Conectar();
            String archivo = "reporteclientes.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(archivo);
            JasperPrint print = JasperFillManager.fillReport(reporte, null, db.getMyConnection());
            JasperViewer.viewReport(print);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
        
        /*JasperReport masterReport = null;
        try{
            masterReport = (JasperReport) JRLoader.loadObjectFromFile(archivo);
        }catch(JRException e){
            System.out.println("Error la cargar el reporte: "+e.getMessage());
        }*/
        
        //Parametro
        /*Map parametro = new HashMap();
        parametro.put("zona", idzona);
        try {
            //Reporte diseñado y compilado con iReport
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parametro, db.getMyConnection());
            //Se lanza el Viewer de Jasper, no termina aplicacion al salir
            JasperViewer jviewer = new JasperViewer(jasperPrint,false);
            jviewer.setTitle("Reporte de Clientes");
            jviewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ListadoClientes.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
}