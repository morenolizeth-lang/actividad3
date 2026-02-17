package org.example.Controlador;

import org.example.Modelo.Asistencia;
import org.example.Modelo.Estudiante;
import org.example.Modelo.EstadoAsistencia;
import org.example.Service.AsistenciaService;
import org.example.Vista.AsistenciaView;

public class AsistenciaController {

    private AsistenciaService service;

    private AsistenciaView view;

    public AsistenciaController(AsistenciaService service, AsistenciaView view) {

        this.service = service;

        this.view = view;

    }


    public Estudiante registrarEstudiante(String nombre, String identificacion){

        Estudiante estudiante = service.registrarEstudiante(nombre, identificacion);

        view.mostrarMensaje("Estudiante registrado");

        return estudiante;

    }


    public Asistencia registrarAsistencia(

            Estudiante estudiante,
            String fecha,
            EstadoAsistencia estado){

        Asistencia asistencia =
                service.registrarAsistencia(estudiante, fecha, estado);

        view.mostrarAsistencia(asistencia);

        return asistencia;

    }

}
