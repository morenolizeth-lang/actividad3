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

        // Crear la lógica, la vista y el controlador
        AsistenciaService service = new AsistenciaServiceImpl();
        AsistenciaView view = new AsistenciaView();
        AsistenciaController controller = new AsistenciaController(service, view);

        // ----------- Estudiante 1 -----------
        Estudiante estudiante1 = controller.registrarEstudiante("Juan", "123");
        Asistencia asistencia1 = controller.registrarAsistencia(estudiante1, "17/02/2026", EstadoAsistencia.ASISTIO);
        Asistencia asistencia11 = controller.registrarAsistencia(estudiante1, "17/02/2026", EstadoAsistencia.ASISTIO);//asistencia doble ves


        // ----------- Estudiante 2 -----------
        Estudiante estudiante2 = controller.registrarEstudiante("Maria", "456");
        Asistencia asistencia2 = controller.registrarAsistencia(estudiante2, "17/02/2026", EstadoAsistencia.NO_ASISTIO);

        //---------consultar asistencia
         controller.consultarAsistencia("123","17/02/2026");
         //---------- Eliminar----------------
        controller.eliminarAsistencia("123","17/02/2026");
        //consulta otra vez
        controller.consultarAsistencia("123","17/02/2026");

    }

}

