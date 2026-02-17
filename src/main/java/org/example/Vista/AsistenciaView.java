package org.example.Vista;

import org.example.Modelo.Asistencia;

public class AsistenciaView {


    public void mostrarAsistencia(Asistencia asistencia) {


        System.out.println("----- ASISTENCIA -----");

        System.out.println(

                asistencia.getEstudiante()

        );


        System.out.println(

                "Fecha: " + asistencia.getFecha()

        );


        System.out.println(

                "Estado: " + asistencia.getEstado()

        );

    }



    public void mostrarMensaje(String mensaje) {

        System.out.println(mensaje);

    }

}
