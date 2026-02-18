package org.example.Controlador;

// Importa las clases necesarias del modelo, servicio y vista
import org.example.Modelo.Asistencia;
import org.example.Modelo.Estudiante;
import org.example.Modelo.EstadoAsistencia;
import org.example.Service.AsistenciaService;
import org.example.Vista.AsistenciaView;

// Clase controlador que coordina la lógica  y la vista
public class AsistenciaController {

    // Atributo que contiene la lógica de negocio para estudiantes y asistencias
    private AsistenciaService service;

    // Atributo que permite mostrar información al usuario
    private AsistenciaView view;

    // Constructor del controlador: recibe el servicio y la vista y los asigna a los atributos
    public AsistenciaController(AsistenciaService service, AsistenciaView view) {
        this.service = service; // asigna el servicio
        this.view = view;       // asigna la vista
    }

    // Método para registrar un estudiante
    public Estudiante registrarEstudiante(String nombre, String identificacion){
        // Llama al servicio para crear un nuevo estudiante con los datos recibidos
        Estudiante estudiante = service.registrarEstudiante(nombre, identificacion);

        // Muestra un mensaje en consola indicando que el estudiante fue registrado
        view.mostrarMensaje("Estudiante registrado");

        // Devuelve el objeto Estudiante creado
        return estudiante;
    }

    // Método para registrar la asistencia de un estudiante
    public Asistencia registrarAsistencia(
            Estudiante estudiante,    // estudiante al que pertenece la asistencia
            String fecha,             // fecha de la asistencia
            EstadoAsistencia estado){ // estado de la asistencia (ASISTIO, FALTO, etc.)

        // Llama al servicio para crear un nuevo objeto Asistencia con los datos proporcionados
        Asistencia asistencia =
                service.registrarAsistencia(estudiante, fecha, estado);

        // Muestra la asistencia creada en consola usando la vista
        view.mostrarAsistencia(asistencia);

        // Devuelve el objeto Asistencia creado
        return asistencia;
    }

}
