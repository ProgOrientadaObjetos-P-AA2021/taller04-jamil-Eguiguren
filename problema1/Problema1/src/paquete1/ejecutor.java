/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import paquete2.Estudiante;
/**
 *
 * @author Smart
 */
public class ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante ob = new Estudiante("jose", 5, 9, 4);
        ob.calcularPromedio();
        Estudiante ob2 = new Estudiante("pedro", 3, 7, 2);
        ob2.calcularPromedio();
        System.out.println(ob.toString() + "\n"
                + ob2.toString());
    }

}