package org.example.Modelo;

public class Asistencia {

    // Crea objeto estudiante
    private Estudiante estudiante;//Atributo que guarda un hobjeto de estudiante
    private String fecha;
    //crea objeto estado
    private EstadoAsistencia estado; // usa el enum para mostrar el estado de la asistencia

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
