package org.example.Modelo;

public class Asistencia {

    private Estudiante estudiante;
     private String fecha;
    private EstadoAsistencia estado;

    public Asistencia() {
    }

    public Asistencia(Estudiante estudiante, String fecha, EstadoAsistencia estado) {
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.estado = estado;


    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public EstadoAsistencia getEstado() {
        return estado;
    }

    public void setEstado(EstadoAsistencia estado) {
        this.estado = estado;
    }


}
