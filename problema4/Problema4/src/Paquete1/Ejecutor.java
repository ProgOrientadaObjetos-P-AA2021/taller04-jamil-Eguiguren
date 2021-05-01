/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;
import Paquete2.Cheques;
/**
 *
 * @author Smart
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cheques ob = new Cheques("Jamil", "Banco de Guayaquil", 452.3);
        ob.calcularComision();
        Cheques ob2 = new Cheques("Estefania", "Banco de loja", 1486.7);
        ob2.calcularComision();
        System.out.println(ob.toString() + "\n"
                + ob2.toString());       
    }
    
}
