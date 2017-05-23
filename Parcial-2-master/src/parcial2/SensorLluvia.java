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
public class SensorLluvia extends Sensor {
    private int lluvia;

    public SensorLluvia(int lluvia, String marca, String referencia, String fechaIns, String nombreEstacion, String ubicacion, String instalacion, String ciudad, ArrayList<Sensor> sensores) {
        super(marca, referencia, fechaIns, nombreEstacion, ubicacion, instalacion, ciudad, sensores);
        this.lluvia = lluvia;
    }

    public int getLluvia() {
        return lluvia;
    }

    public void setLluvia(int lluvia) {
        this.lluvia = lluvia;
    }
    
    
    
    
}
