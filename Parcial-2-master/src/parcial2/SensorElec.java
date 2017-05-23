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
public class SensorElec extends Sensor{
    private int carga;

    public SensorElec(int carga, String marca, String referencia, String fechaIns, String nombreEstacion, String ubicacion, String instalacion, String ciudad, ArrayList<Sensor> sensores) {
        super(marca, referencia, fechaIns, nombreEstacion, ubicacion, instalacion, ciudad, sensores);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    
    
}
