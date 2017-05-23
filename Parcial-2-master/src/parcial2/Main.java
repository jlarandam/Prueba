/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        //ArrayList<Estacion> estaciones = new ArrayList<Estacion>;
        
        try{
            Scanner input = new Scanner(new File("datos.txt"));
            while (input.hasNext()){
                String ci = input.next();
                int esR = input.nextInt();
                String nomE = input.next();
                int numS = input.nextInt();
                System.out.println(ci);
                
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
//        try{
//            Scanner dat = new Scanner(new File("datos.txt"));
//            while(dat.hasNext()){
//                int promT;
//                int promA;
//                int promE;
//                String ci = dat.next();
//                int numR = dat.nextInt();
//                String nomE = dat.next();
//                int datS = dat.nextInt();
//                String espec = dat.next();
//                for (int i=0; i<4; i++){
//                    String fech = dat.next();
//                    int temp[]= new int[12];
//                    temp[i] = dat.nextInt();
//                    int agua[]= new int[12];
//                    agua[i] = dat.nextInt();
//                    int elec[]= new int[12];
//                    elec[i] = dat.nextInt();
//                    
//                    promT=(temp[1]+temp[2]+temp[3]+temp[4]+temp[5]+temp[6]+
//                            temp[7]+temp[8]+temp[9]+temp[10]+temp[11]+temp[12])/12;
//                    promA=(agua[1]+agua[2]+agua[3]+agua[4]+agua[5]+agua[6]+
//                            agua[7]+agua[8]+agua[9]+agua[10]+agua[11]+agua[12])/12;
//                    promE=(elec[1]+elec[2]+elec[3]+elec[4]+elec[5]+elec[6]+
//                            elec[7]+elec[8]+elec[9]+elec[10]+elec[11]+elec[12])/12;
//                    System.out.println(promT);
//                    System.out.println(promA);
//                    System.out.println(promE);
//                }
//        System.out.println(ci);
//                
//            }
//            dat.close();
//        }   
//        catch(FileNotFoundException e){
//            System.out.println(e.getMessage());
//            
//        }
    }
}
