/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package megamar;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CoLiSa
 */
public class ConversorRSaDefaultTableModel {
    

    public static void completar(ResultSet rs, DefaultTableModel modelo) {
        try {
            // Se obtiene los metadatos de la consulta. Con ellos
            // podemos obtener el número de columnas y el nombre de las mismas.
            ResultSetMetaData metadatos = rs.getMetaData();

            // Se obtiene el número de columnas.
            int numeroColumnas = metadatos.getColumnCount();

            // Se crea un array de etiquetas para rellenar
            Object[] etiquetas = new Object[numeroColumnas];

            // Se obtiene cada una de las etiquetas para cada columna
            for (int i = 0; i < numeroColumnas; i++) {
                // Nuevamente, para ResultSetMetaData la primera columna es la 1.
                etiquetas[i] = metadatos.getColumnLabel(i + 1);
            }

            // Se meten las etiquetas en el modelo. 
            // El numero de columnas se ajusta automáticamente.
            modelo.setColumnIdentifiers(etiquetas);
            
            //Borramos todas las filas del modelo en caso de encontrar alguna
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }            
 
            // Añadimos al DefaultTableModel las filas correspondientes al ResultSet.
            while (rs.next()) {
                // Se crea un array que será una de las filas de la tabla.
                Object[] fila = new Object[numeroColumnas]; // numeroColumnas tiene la cantidad de columnas de la consulta.

                // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
                for (int i = 0; i < numeroColumnas; i++) {
                    fila[i] = rs.getObject(i + 1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
                }
                // Se añade al modelo la fila completa.
                modelo.addRow(fila);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
    }
}