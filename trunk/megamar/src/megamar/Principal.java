/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Principal.java
 *
 * Created on 07-jun-2012, 22:03:59
 */
package megamar;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import reportes.MetodosImpresion;


/**
 *
 * @author Lizondo1
 */
public class Principal extends javax.swing.JFrame {

    private String zona;
    private int idzona;
    private String idusuario;
    private String perfil;
    private String tipo_sistema;

    /** Creates new form Principal */
    public Principal(String nombrezona, int idz, String idu, String perf, String sistema) {
        initComponents();
        //codigo para maximizar la ventana principal al iniciar el sistema
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize((int) d.getWidth(), (int) d.getHeight());
        this.setTitle(this.getTitle() + " - " + nombrezona);
        this.labelzona.setText(nombrezona);
        //this.labelidzona.setVisible(false);
        //this.labelidzona.setText(Integer.toString(idzona));
        zona = nombrezona;
        idzona = idz;
        idusuario = idu;
        tipo_sistema = sistema;
        perfil = perf;
        if (!perfil.equals("ADMINISTRADOR")) {
            jMenu3.setVisible(false);
            jMenuItem2.setVisible(false);
            jMenuItem4.setVisible(false);
            JMenu5.setVisible(false);
        }
        Conectar();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelzona = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        JMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Megamar Financiera");

        labelzona.setFont(new java.awt.Font("Calibri", 2, 48));
        labelzona.setToolTipText("");
        labelzona.setEnabled(false);

        jMenu1.setText("Actualizaciones");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/zona_24.png"))); // NOI18N
        jMenuItem2.setText("Zonas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user_24.png"))); // NOI18N
        jMenuItem1.setText("Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/planes_24.png"))); // NOI18N
        jMenuItem4.setText("Planes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/misionp.png"))); // NOI18N
        jMenuItem3.setText("Rubros");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Informes");

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/planes_24.png"))); // NOI18N
        jMenuItem8.setText("Listado de Clientes");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/planes_24.png"))); // NOI18N
        jMenuItem13.setText("Listado de Creditos Activos");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Creditos");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/form.png"))); // NOI18N
        jMenuItem5.setText("Nuevo Credito");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Pagos");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/planes_24.png"))); // NOI18N
        jMenuItem6.setText("Nuevo Pago");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Zonas");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/zona_24.png"))); // NOI18N
        jMenuItem10.setText("Estado de Zona");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/planes_24.png"))); // NOI18N
        jMenuItem11.setText("Impresion de Recibos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuBar1.add(jMenu6);

        JMenu5.setText("Liquidación");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user_24.png"))); // NOI18N
        jMenuItem9.setText("Liquidar Sueldo");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        JMenu5.add(jMenuItem9);

        jMenuBar1.add(JMenu5);

        jMenu3.setText("Administrar");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user_24.png"))); // NOI18N
        jMenuItem7.setText("Nuevo Usuario");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/llaves.png"))); // NOI18N
        jMenuItem12.setText("Cambiar Contaseña");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(1014, Short.MAX_VALUE)
                .addComponent(labelzona)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelzona)
                .addGap(0, 747, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    Clientes C = new Clientes(Integer.toString(idzona), this, true);
    C.setVisible(true);
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    Zonas Z = new Zonas(this, true);
    Z.setVisible(true);
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    Planes P = new Planes(this, true,tipo_sistema);
    P.setVisible(true);
}//GEN-LAST:event_jMenuItem4ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    Rubros R = new Rubros(this, true);
    R.setVisible(true);
}//GEN-LAST:event_jMenuItem3ActionPerformed

private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    Creditos C = new Creditos(Integer.toString(idzona), zona, this, true, tipo_sistema);
    C.setVisible(true);
}//GEN-LAST:event_jMenuItem5ActionPerformed

private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    Usuarios U = new Usuarios(this, true);
    U.setVisible(true);
}//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Pagos P = new Pagos(Integer.toString(idzona), zona, idusuario, this, true);
        P.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ImprimirListadoClientes I = new ImprimirListadoClientes(this,true,idzona);
        I.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Liquidacion L = new Liquidacion(this, true, idzona);
        L.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        EstadoZonas E = new EstadoZonas(this, true);
        E.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        UsuarioModificarPass U = new UsuarioModificarPass(this, true, idusuario);
        U.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        ImprimirRecibos I = new ImprimirRecibos(this, true, idzona);
        I.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        try {
            new MetodosImpresion().ReporteCreditosActivos(idzona);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ImprimirRecibos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ImprimirRecibos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        
        public void run() {
        new Principal().setVisible(true);
        }
        });*/
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenu5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel labelzona;
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
}