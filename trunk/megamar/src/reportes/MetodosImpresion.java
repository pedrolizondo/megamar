    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import megamar.conexion;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Lizondo1
 */
public class MetodosImpresion {
    private Toolkit tk = Toolkit.getDefaultToolkit();
    private Dimension screenSize = tk.getScreenSize();
    
    public void ReporteClientes(String estado, int idzona)throws ClassNotFoundException, SQLException{
        String where_estado;
        Conectar();
        if(estado.equals("TODOS")){
            where_estado = "";
        }else{
            where_estado = " and c.estado = '"+estado+"'";
        }
        try {
            JDialog viewer = new JDialog(new JFrame(), "Vista previa del reporte", true);
            viewer.setSize(screenSize.width, screenSize.height);
            viewer.setLocationRelativeTo(null);
            
            JasperReport reporte = (JasperReport) JRLoader.loadObject(this.getClass().getResource("reporteclientes.jasper"));
            
            //JasperReport reporte = (JasperReport) JRLoader.loadObject("reportes//reporteclientes.jasper");
            //JasperReport reporte = JasperCompileManager.compileReport("src//reportes//reporteclientes.jrxml");
            String reportsDirPath = String.valueOf(this.getClass().getResource("/reportes/"));
            
            Map parametros = new HashMap();
            parametros.put("pidzona", idzona);
            parametros.put("where_estado", where_estado);
            parametros.put("REPORT_DIR", reportsDirPath);
            
            
            JasperPrint print = JasperFillManager.fillReport(reporte, parametros, db.getMyConnection());
            //JasperViewer.viewReport(print);
           /* JasperViewer view = new JasperViewer(print,false);
            view.setTitle("Ejemplo Jasper Report");
            view.setExtendedState(view.MAXIMIZED_BOTH);
            view.setVisible(true);*/
            
            JRViewer jrv = new JRViewer(print);
            viewer.getContentPane().add(jrv);
            viewer.show();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void ReporteCuentaCorrienteCliente(String id)throws ClassNotFoundException, SQLException{
        Conectar();
        try {
            JDialog viewer = new JDialog(new JFrame(), "Vista previa del reporte", true);
            viewer.setSize(screenSize.width, screenSize.height);
            viewer.setLocationRelativeTo(null);
            JasperReport reporte = (JasperReport) JRLoader.loadObject(this.getClass().getResource("reporteresumencuenta.jasper"));
            //JasperReport reporte = (JasperReport) JRLoader.loadObject("reportes//reporteclientes.jasper");
            //JasperReport reporte = JasperCompileManager.compileReport("src//reportes//reporteclientes.jrxml");
            String reportsDirPath = String.valueOf(this.getClass().getResource("/reportes/"));
            Map parametros = new HashMap();
            parametros.put("idcredito", id);
            parametros.put("REPORT_DIR", reportsDirPath);
                        
            JasperPrint print = JasperFillManager.fillReport(reporte, parametros, db.getMyConnection());
            //JasperViewer.viewReport(print);
            /*JasperViewer view = new JasperViewer(print,false);
            view.setTitle("Detalles del credito");
            view.setExtendedState(view.MAXIMIZED_BOTH);
            view.setVisible(true);*/
            JRViewer jrv = new JRViewer(print);
            viewer.getContentPane().add(jrv);
            viewer.show();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ReporteEstadoZona(String zona, String estado_zona, String total_cobrar, String num_recibos) throws ClassNotFoundException, SQLException {
        Conectar();
        try {
            JDialog viewer = new JDialog(new JFrame(), "Vista previa del reporte", true);
            viewer.setSize(screenSize.width, screenSize.height);
            viewer.setLocationRelativeTo(null);
            JasperReport reporte = (JasperReport) JRLoader.loadObject(this.getClass().getResource("reporteestadozona.jasper"));
            //JasperReport reporte = (JasperReport) JRLoader.loadObject("reportes//reporteclientes.jasper");
            //JasperReport reporte = JasperCompileManager.compileReport("src//reportes//reporteclientes.jrxml");
            String reportsDirPath = String.valueOf(this.getClass().getResource("/reportes/"));
            Map parametros = new HashMap();
            parametros.put("pzona", zona);
            parametros.put("pestadozona", estado_zona);
            parametros.put("ptotalacobrar", total_cobrar);
            parametros.put("pcantrecibos", num_recibos);
            parametros.put("REPORT_DIR", reportsDirPath);

            JasperPrint print = JasperFillManager.fillReport(reporte, parametros, db.getMyConnection());
            //JasperViewer.viewReport(print);
            /*JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Estado de la Zona");
            view.setExtendedState(view.MAXIMIZED_BOTH);
            view.setVisible(true);*/
            JRViewer jrv = new JRViewer(print);
            viewer.getContentPane().add(jrv);
            viewer.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ReporteLiquidacion(String param[])throws ClassNotFoundException, SQLException{
        Conectar();
        try {
            JDialog viewer = new JDialog(new JFrame(), "Vista previa del reporte", true);
            viewer.setSize(screenSize.width, screenSize.height);
            viewer.setLocationRelativeTo(null);
            JasperReport reporte = (JasperReport) JRLoader.loadObject(this.getClass().getResource("reporteliquidacion.jasper"));
            //JasperReport reporte = (JasperReport) JRLoader.loadObject("reportes//reporteclientes.jasper");
            //JasperReport reporte = JasperCompileManager.compileReport("src//reportes//reporteclientes.jrxml");
            String reportsDirPath = String.valueOf(this.getClass().getResource("/reportes/"));
            Map parametros = new HashMap();
            parametros.put("ptotalacobrar", param[0]);
            parametros.put("ptotalcobrado", param[1]);
            parametros.put("pdinerocobrado", param[2]);
            parametros.put("ptotalreciboscortados", param[3]);
            parametros.put("ptotalrecibosnocortados", param[4]);
            
            parametros.put("precibolunes5", param[5]);
            parametros.put("precibolunes4", param[6]);
            parametros.put("precibolunes3", param[7]);
            parametros.put("precibomartes5", param[8]);
            parametros.put("precibomartes4", param[9]);
            parametros.put("precibomartes3", param[10]);
            parametros.put("precibomiercoles5", param[11]);
            parametros.put("precibomiercoles4", param[12]);
            parametros.put("precibomiercoles3", param[13]);
            parametros.put("precibojueves5", param[14]);
            parametros.put("precibojueves4", param[15]);
            parametros.put("precibojueves3", param[16]);
            
            parametros.put("ppagolunes5", param[17]);
            parametros.put("ppagolunes4", param[18]);
            parametros.put("ppagolunes3", param[19]);
            parametros.put("ppagomartes5", param[20]);
            parametros.put("ppagomartes4", param[21]);
            parametros.put("ppagomartes3", param[22]);
            parametros.put("ppagomiercoles5", param[23]);
            parametros.put("ppagomiercoles4", param[24]);
            parametros.put("ppagomiercoles3", param[25]);
            parametros.put("ppagojueves5", param[26]);
            parametros.put("ppagojueves4", param[27]);
            parametros.put("ppagojueves3", param[28]);
            
            parametros.put("ptotalrecibos5", param[29]);
            parametros.put("ptotalrecibos4", param[30]);
            parametros.put("ptotalrecibos3", param[31]);
            parametros.put("ptotalpagos5", param[32]);
            parametros.put("ptotalpagos4", param[33]);
            parametros.put("ptotalpagos3", param[34]);
            
            parametros.put("ptotalreciboscortados1", param[35]);
            parametros.put("ptotalcobrado1", param[36]);
            
            parametros.put("pcomision5", param[37]);
            parametros.put("pcomision4", param[38]);
            parametros.put("pcomision3", param[39]);
            parametros.put("psubtotal5", param[40]);
            parametros.put("psubtotal4", param[41]);
            parametros.put("psubtotal3", param[42]);
            
            parametros.put("ptotalapagar", param[43]);
            parametros.put("REPORT_DIR", reportsDirPath);
            
            JasperPrint print = JasperFillManager.fillReport(reporte, parametros, db.getMyConnection());
            //JasperViewer.viewReport(print);
            /*JasperViewer view = new JasperViewer(print,false);
            view.setTitle("Ejemplo Jasper Report");
            view.setExtendedState(view.MAXIMIZED_BOTH);
            view.setVisible(true);*/
            JRViewer jrv = new JRViewer(print);
            viewer.getContentPane().add(jrv);
            viewer.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void ReporteRecibos(int idzona, String idcreditos)throws ClassNotFoundException, SQLException{
        String where_idcreditos = "";
        if(!idcreditos.equals("")){
            where_idcreditos = " and c.idcredito in ("+idcreditos+") ";
        }
        
        Conectar();
        
        try {
            JDialog viewer = new JDialog(new JFrame(), "Vista previa del reporte", true);
            viewer.setSize(screenSize.width, screenSize.height);
            viewer.setLocationRelativeTo(null);
            JasperReport reporte = (JasperReport) JRLoader.loadObject(this.getClass().getResource("reporterecibos.jasper"));
            //JasperReport reporte = (JasperReport) JRLoader.loadObject("reportes//reporteclientes.jasper");
            //JasperReport reporte = JasperCompileManager.compileReport("src//reportes//reporteclientes.jrxml");
            String reportsDirPath = String.valueOf(this.getClass().getResource("/reportes/"));
            
            Map parametros = new HashMap();
            parametros.put("idzona", idzona);
            parametros.put("where_idcreditos", where_idcreditos);
            parametros.put("REPORT_DIR", reportsDirPath);
            
            
            JasperPrint print = JasperFillManager.fillReport(reporte, parametros, db.getMyConnection());
            //JasperViewer.viewReport(print);
            /*JasperViewer view = new JasperViewer(print,false);
            view.setTitle("Recibos");
            view.setExtendedState(view.MAXIMIZED_BOTH);
            view.setVisible(true);*/
            JRViewer jrv = new JRViewer(print);
            viewer.getContentPane().add(jrv);
            viewer.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ReporteCreditosActivos(int idzona)throws ClassNotFoundException, SQLException{
        Conectar();
        try {
            JDialog viewer = new JDialog(new JFrame(), "Vista previa del reporte", true);
            viewer.setSize(screenSize.width, screenSize.height);
            viewer.setLocationRelativeTo(null);
            JasperReport reporte = (JasperReport) JRLoader.loadObject(this.getClass().getResource("reportecuentacorrienteclientes.jasper"));
            //JasperReport reporte = (JasperReport) JRLoader.loadObject("reportes//reporteclientes.jasper");
            //JasperReport reporte = JasperCompileManager.compileReport("src//reportes//reporteclientes.jrxml");
            String reportsDirPath = String.valueOf(this.getClass().getResource("/reportes/"));
            
            Map parametros = new HashMap();
            parametros.put("idzona", idzona);
            parametros.put("REPORT_DIR", reportsDirPath);
            
            
            JasperPrint print = JasperFillManager.fillReport(reporte, parametros, db.getMyConnection());
            //JasperViewer.viewReport(print);
            /*JasperViewer view = new JasperViewer(print,false);
            view.setTitle("Recibos");
            view.setExtendedState(view.MAXIMIZED_BOTH);
            view.setVisible(true);*/
            JRViewer jrv = new JRViewer(print);
            viewer.getContentPane().add(jrv);
            viewer.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
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
}
