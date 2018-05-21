/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.datos;
import Control.modelo.Sensor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CcorLabIng
 */
public final class DatosSensor {
    private final static DatosSensor datos = new DatosSensor();
    private final List<Sensor> lista= new ArrayList<>();

    public DatosSensor() {
        Sensor art1= new Sensor (1,"Sensor Temperatura","Activo");
        Sensor art2= new Sensor (2,"Sensor Ruido","Activo");
        lista.add(art1);
        lista.add(art2);
    }
    public static DatosSensor getInstancia(){
    return datos;
    }
    public List<Sensor> getlista(){
    return lista;
    }
}
