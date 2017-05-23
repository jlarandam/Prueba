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
public class Sensor extends Estacion{
    protected String marca;
    protected String referencia;
    protected String fechaIns;

    public Sensor(String marca, String referencia, String fechaIns, String nombreEstacion, String ubicacion, String instalacion, String ciudad, ArrayList<Sensor> sensores) {
        super(nombreEstacion, ubicacion, instalacion, ciudad, sensores);
        this.marca = marca;
        this.referencia = referencia;
        this.fechaIns = fechaIns;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFechaIns() {
        return fechaIns;
    }

    public void setFechaIns(String fechaIns) {
        this.fechaIns = fechaIns;
    }
    
    

    @Override
    public void datosMedicion() {
        
    }

    @Override
    public void registro() {
        
    }

    

    
    
}
