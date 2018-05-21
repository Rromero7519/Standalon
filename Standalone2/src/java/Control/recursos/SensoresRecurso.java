/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.recursos;

import Control.modelo.Sensor;
import Control.servicio.SensorServico;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author CcorLabIng
 */
@Path("/sensores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SensoresRecurso {
    SensorServico servicio = new SensorServico();
    
    @GET
    public List<Sensor> getSensores(@QueryParam("nombre")String nombre,
                                    @QueryParam("estado")String estado){
        if(nombre != null && nombre.length()>0){
            return servicio.getSensorPorNombre(nombre);
        }
        if (estado != null && estado.length()>0){
            return servicio.getSensorPorEstado(estado);
        }
        return servicio.getSensor();
    }
    
    
    @GET
    @Path("/{sensorid}")
    public Sensor getSensor(@PathParam("sensorid") int id){
        return servicio.getSensor(id);
    }
    
    @POST    
    public Sensor addSensor(Sensor sensor){
        return servicio.addSensor(sensor);
    }
    
    @DELETE
    @Path("/{articuloid}")
    public void deleteSensor (@PathParam("articuloid")int id){
        servicio.deleteSensor(id);
    }
    @PUT
    @Path("/{articuloid}")    
    public Sensor updateSensor(@PathParam("articuloid")int id, Sensor sensor){
        sensor.setId(id);
        return servicio.updateSensro(sensor);
    }
    
      
    
}
