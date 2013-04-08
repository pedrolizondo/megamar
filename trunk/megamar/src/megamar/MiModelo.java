/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package megamar;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CoLiSa
 */
public class MiModelo extends DefaultTableModel {

    /** Primera columna Boolean, segunda Integer y el resto Object */
    public Class getColumnClass(int columna) {
        if (columna == 0) return Boolean.class;
        //if (columna == 1) return Integer.class;
        return Object.class;
    }
}
