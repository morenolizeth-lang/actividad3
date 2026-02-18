
package org.example.Modelo;

public class Estudiante {

    //atributos
   private String nombre;
   private  String identificacion;

   //constructor por defecto vacio para luego agregar datos
    public Estudiante() {
    }

    //constructor con parametros para crear objetos
    public Estudiante(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }
// getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                '}';
    }
}