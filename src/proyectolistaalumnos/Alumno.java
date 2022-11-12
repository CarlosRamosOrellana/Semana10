/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectolistaalumnos;

/**
 *
 * @author CARLOS
 */
//Ingresar los nombres y las notas de n alumnos y reportar la lista en orden alfabético y en orden de mérito.
public class Alumno {

   private String nombre;
private double nota;

public Alumno(String nombre, double nota) {
this.nombre = nombre;
this.nota = nota;
}

public String getNombre() {
return nombre;
}

public void setNombre(String nombre) {
this.nombre = nombre;
}

public double getNota() {
return nota;
}

public void setNota(double nota) {
this.nota = nota;
}
}

 



