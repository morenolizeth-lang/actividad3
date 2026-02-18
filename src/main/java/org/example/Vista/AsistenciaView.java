package org.example.Vista;
import org.example.Modelo.Asistencia;

//vista del usuario

public class AsistenciaView {


    public void mostrarAsistencia(Asistencia asistencia) {

//muestra en consola lo que esta asociado a los objetos
        System.out.println("----- ASISTENCIA -----");
        System.out.println(asistencia.getEstudiante());
        System.out.println("Fecha: " + asistencia.getFecha());
        System.out.println("Estado: " + asistencia.getEstado());

    }

    public void mostrarMensaje(String mensaje) {

        System.out.println(mensaje);

    }
}
