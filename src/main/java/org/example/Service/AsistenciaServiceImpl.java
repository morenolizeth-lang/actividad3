package org.example.Service;

import org.example.Modelo.Asistencia;
import org.example.Modelo.EstadoAsistencia;
import org.example.Modelo.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class AsistenciaServiceImpl implements AsistenciaService{

    // -------- AGREGADO --------

    private List<Asistencia> listaAsistencias = new ArrayList<>();

    @Override
    public Estudiante registrarEstudiante(String nombre, String identificacion) {
        return new Estudiante(nombre, identificacion);
    }

    @Override
    public Asistencia registrarAsistencia(Estudiante estudiante, String fecha, EstadoAsistencia estado) {

        if(asistenciaExiste(estudiante.getIdentificacion(), fecha)){
            return null;
        }

        Asistencia asistencia = new Asistencia(estudiante, fecha, estado);
        listaAsistencias.add(asistencia); // AGREGADO
        return asistencia;
    }

    // -------- AGREGADO --------

    @Override
    public Asistencia consultarAsistencia(String identificacion, String fecha) {
        for (Asistencia a : listaAsistencias) {
            if (a.getEstudiante().getIdentificacion().equals(identificacion)
                    && a.getFecha().equals(fecha)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public boolean eliminarAsistencia(String identificacion, String fecha) {
        for (Asistencia a : listaAsistencias) {
            if (a.getEstudiante().getIdentificacion().equals(identificacion)
                    && a.getFecha().equals(fecha)) {
                listaAsistencias.remove(a);
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean asistenciaExiste(String identificacion, String fecha){

        for(Asistencia a : listaAsistencias){

            if(a.getEstudiante().getIdentificacion().equals(identificacion)&& a.getFecha().equals(fecha)){
                return true;

            }

        }

        return false;

    }

}
