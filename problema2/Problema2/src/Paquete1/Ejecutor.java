/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;
import Paquete2.Profesores;
/**
 *
 * @author Smart
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Profesores ob = new Profesores("Juan", "Gabriel", 84.42, 100637895);
        ob.calcularStotal();
        Profesores ob2 = new Profesores("Juan", "Francisco", 41.8, 11012534);
        ob2.calcularStotal();
        System.out.println(ob.toString() + "\n\n"
                + ob2.toString());
    
        
        
    }
    
}
