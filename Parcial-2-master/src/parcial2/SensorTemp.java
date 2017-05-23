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
public class SensorTemp extends Sensor{
    private int temp;

    public SensorTemp(int temp, String marca, String referencia, String fechaIns, String nombreEstacion, String ubicacion, String instalacion, String ciudad, ArrayList<Sensor> sensores) {
        super(marca, referencia, fechaIns, nombreEstacion, ubicacion, instalacion, ciudad, sensores);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
    
    

    
    
    
}
