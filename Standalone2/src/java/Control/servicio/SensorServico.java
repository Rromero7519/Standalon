/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.servicio;

import Control.datos.DatosSensor;
import Control.modelo.Sensor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CcorLabIng
 */
public class SensorServico {
    
    private final List<Sensor> lista = DatosSensor.getInstancia().getlista();
    public List<Sensor> getSensor(){
        return lista;
    }
    public Sensor getSensor (int id){
        for(Sensor sensor:lista){
            if(sensor.getId()==id){
                return sensor;
            }
        }
        return null;
    }
    public List<Sensor> getSensorPorNombre(String nombre){
        List<Sensor> resultado= new ArrayList<>();
        for(Sensor sensor: lista){
            if(sensor.getNombre().equalsIgnoreCase(nombre)){
                resultado.add(sensor);
            }
        }
        return resultado;
    }
    
     public List<Sensor> getSensorPorEstado(String estado){
        List<Sensor> resultado= new ArrayList<>();
        for(Sensor sensor: lista){
            if(sensor.getEstado().equalsIgnoreCase(estado)){
                resultado.add(sensor);
            }
        }
        return resultado;
    }
    
    
    
    public Sensor addSensor(Sensor sensor){
       sensor.setId(getMaximo());
       lista.add(sensor);
       return sensor;
    }
    public Sensor updateSensro(Sensor sensor){
        int posicion = getPosicion(sensor.getId());
        try{
            lista.set(posicion, sensor);
        }catch (IndexOutOfBoundsException ioobe){
            return null;
        }
        return sensor;
    }
    public void deleteSensor(int id){
        int posicion = getPosicion(id);
        lista.remove(posicion);
    }
    private int getPosicion(int id){
        for(int i=0; i <lista.size();i++){
            if(lista.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }
    private int getMaximo(){
        int size=lista.size();
        if(size>0){
            return lista.get(size-1).getId()+1;
        }
        return 1;
    }
}
    

