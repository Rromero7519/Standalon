/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.modelo;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CcorLabIng
 */
@XmlRootElement
public class Sensor {

    
    private int id;
    private String nombre;
    private String estado;
    public Sensor() {
    }

    public Sensor(int id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
