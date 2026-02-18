package org.example.Service;

//ayuda a orfdenar la logica indica que metdos deben de ralizarcen

import org.example.Modelo.Asistencia;
import org.example.Modelo.EstadoAsistencia;
import org.example.Modelo.Estudiante;

public interface AsistenciaService {

    //metodo de tipo estudiante con los atributos de estudiante

    Estudiante registrarEstudiante( String nombre, String identificacion);

    //metodo de tipo Asistencia con atributos de asistencia

    Asistencia registrarAsistencia(Estudiante estudiante, String fecha, EstadoAsistencia estado);


}
