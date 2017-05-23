/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public abstract class Estacion implements UIM {
    protected String nombreEstacion;
    protected String ubicacion;
    protected String instalacion;
    protected String ciudad;
    protected Sensor sensor;
    protected ArrayList<Sensor> sensores;

    public Estacion(String nombreEstacion, String ubicacion, String instalacion, String ciudad, ArrayList<Sensor> sensores) {
        this.nombreEstacion = nombreEstacion;
        this.ubicacion = ubicacion;
        this.instalacion = instalacion;
        this.ciudad = ciudad;
        this.sensores = sensores;
        //this.sensor = new Sensor();
    }

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }
    
    public abstract void datosMedicion();
    
}
