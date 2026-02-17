package org.example;

import org.example.Controlador.AsistenciaController;
import org.example.Modelo.Asistencia;
import org.example.Modelo.Estudiante;
import org.example.Modelo.EstadoAsistencia;
import org.example.Service.AsistenciaService;
import org.example.Service.AsistenciaServiceImpl;
import org.example.Vista.AsistenciaView;

public class Main {

    public static void main(String[] args) {


        AsistenciaService service = new AsistenciaServiceImpl();
        AsistenciaView view = new AsistenciaView();

        AsistenciaController controller = new AsistenciaController(service, view);



        // registrar estudiante

        Estudiante estudiante = controller.registrarEstudiante("Juan", "123");

        Asistencia asistencia = controller.registrarAsistencia(estudiante, "17/02/2026", EstadoAsistencia.ASISTIO);



    }

}
