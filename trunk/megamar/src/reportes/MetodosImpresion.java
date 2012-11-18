/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import megamar.conexion;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Lizondo1
 */
public class MetodosImpresion {
    public void ReporteClientes(String estado, int idzona)throws ClassNotFoundException, SQLException{
        Conectar();
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject(this.getClass().getResource("reporteclientes.jasper"));
            //JasperReport reporte = (JasperReport) JRLoader.loadObject("reportes//reporteclientes.jasper");
            //JasperReport reporte = JasperCompileManager.compileReport("src//reportes//reporteclientes.jrxml");
            Map parametros = new HashMap();
            parametros.put("pidzona", idzona);
            parametros.put("pestado", estado);
            
            JasperPrint print = JasperFillManager.fillReport(reporte, parametros, db.getMyConnection());
            //JasperViewer.viewReport(print);
            JasperViewer view = new JasperViewer(print,false);
            view.setTitle("Ejemplo Jasper Report");
            view.setExtendedState(view.MAXIMIZED_BOTH);
            view.setVisible(true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void ReporteCuentaCorrienteCliente(String id)throws ClassNotFoundException, SQLException{
        Conectar();
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject(this.getClass().getResource("reportecuentacorrientecliente.jasper"));
            //JasperReport reporte = (JasperReport) JRLoader.loadObject("reportes//reporteclientes.jasper");
            //JasperReport reporte = JasperCompileManager.compileReport("src//reportes//reporteclientes.jrxml");
            Map parametros = new HashMap();
            parametros.put("idcredito", id);
            /*parametros.put("pnombre",nombre);
            parametros.put("pcodigo",id_cliente);
            parametros.put("ptelefono",telefono);
            parametros.put("pdom_particular",domiciliop);
            parametros.put("pdom_comercial",domicilioc);
            parametros.put("prubro",rubro);
            parametros.put("pmontoprestamo",monto_prestamo);
            parametros.put("pplan",plan);
            parametros.put("pmontocuota",monto_cuota);
            parametros.put("pfechaprestamo",fecha_prestamo);
            parametros.put("pfechacancelacion",fecha_cancelacion);*/
            
            JasperPrint print = JasperFillManager.fillReport(reporte, parametros, db.getMyConnection());
            //JasperViewer.viewReport(print);
            JasperViewer view = new JasperViewer(print,false);
            view.setTitle("Detalles del credito");
            view.setExtendedState(view.MAXIMIZED_BOTH);
            view.setVisible(true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ReporteEstadoZona(String zona, String estado_zona, String total_cobrar, String num_recibos) throws ClassNotFoundException, SQLException {
        Conectar();
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject(this.getClass().getResource("reporteestadozona.jasper"));
            //JasperReport reporte = (JasperReport) JRLoader.loadObject("reportes//reporteclientes.jasper");
            //JasperReport reporte = JasperCompileManager.compileReport("src//reportes//reporteclientes.jrxml");
            Map parametros = new HashMap();
            parametros.put("pzona", zona);
            parametros.put("pestadozona", estado_zona);
            parametros.put("ptotalacobrar", total_cobrar);
            parametros.put("pcantrecibos", num_recibos);


            JasperPrint print = JasperFillManager.fillReport(reporte, parametros, db.getMyConnection());
            //JasperViewer.viewReport(print);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Estado de la Zona");
            view.setExtendedState(view.MAXIMIZED_BOTH);
            view.setVisible(true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ReporteLiquidacion(String param[])throws ClassNotFoundException, SQLException{
        Conectar();
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject(this.getClass().getResource("reporteliquidacion.jasper"));
            //JasperReport reporte = (JasperReport) JRLoader.loadObject("reportes//reporteclientes.jasper");
            //JasperReport reporte = JasperCompileManager.compileReport("src//reportes//reporteclientes.jrxml");
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
            
            JasperPrint print = JasperFillManager.fillReport(reporte, parametros, db.getMyConnection());
            //JasperViewer.viewReport(print);
            JasperViewer view = new JasperViewer(print,false);
            view.setTitle("Ejemplo Jasper Report");
            view.setExtendedState(view.MAXIMIZED_BOTH);
            view.setVisible(true);

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
