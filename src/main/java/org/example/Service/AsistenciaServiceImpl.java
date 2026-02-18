package org.example.Service;

import org.example.Modelo.Asistencia;
import org.example.Modelo.EstadoAsistencia;
import org.example.Modelo.Estudiante;

public class AsistenciaServiceImpl implements AsistenciaService{


    @Override //obligatorio verifica que este correcto
    public Estudiante registrarEstudiante(String nombre, String identificacion) {
        return new Estudiante(nombre, identificacion);
    }

    @Override
    public Asistencia registrarAsistencia(Estudiante estudiante, String fecha, EstadoAsistencia estado) {
        return new Asistencia(estudiante, fecha, estado);
    }

}
