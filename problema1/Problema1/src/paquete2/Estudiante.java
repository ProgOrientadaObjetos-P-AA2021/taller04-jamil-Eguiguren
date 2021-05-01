/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Smart
 */
public class Estudiante {
    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Estudiante(String nombre, double calificacion1, double calificacion2, double calificacion3) {
        this.nombre = nombre;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacion1() {
        return calificacion1;
    }

    public void setCalificacion1(double calificacion1) {
        this.calificacion1 = calificacion1;
    }

    public double getCalificacion2() {
        return calificacion2;
    }

    public void setCalificacion2(double calificacion2) {
        this.calificacion2 = calificacion2;
    }

    public double getCalificacion3() {
        return calificacion3;
    }

    public void setCalificacion3(double calificacion3) {
        this.calificacion3 = calificacion3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void calcularPromedio() {
        this.promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }
    
    @Override
    public String toString() {
        return String.format("Nombre: %s \n"
                + "Calificación 1: %.2f \n"
                + "Calificación 2: %.2f \n"
                + "Calificación 3: %.2f \n"
                + "Promedio: %.2f", getNombre(),getCalificacion1(),
                getCalificacion2(),  getCalificacion3() ,getPromedio());
    }

}

    

