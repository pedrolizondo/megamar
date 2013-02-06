/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package megamar;

/**
 *
 * @author CoLiSa
 * Clase que sirve para crear items de un combobox (id,descripcion)
 */
public class ComboboxItem {

    private int id;
    private String name;

    public ComboboxItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name;
    }
}
