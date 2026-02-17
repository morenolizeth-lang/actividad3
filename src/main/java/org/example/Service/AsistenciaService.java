package org.example.Service;

import org.example.Modelo.Asistencia;
import org.example.Modelo.EstadoAsistencia;
import org.example.Modelo.Estudiante;

public interface AsistenciaService {

    Estudiante registrarEstudiante( String nombre, String identificacion);

    Asistencia registrarAsistencia(Estudiante estudiante, String fecha, EstadoAsistencia estado);


}
