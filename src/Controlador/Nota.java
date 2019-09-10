
package Controlador;


public class Nota {
    Estudiante estudiante;
    double nota;
    Materia materia;
    String actividad;

    public Nota(Estudiante estudiante, double nota, Materia materia, String actividad) {
        this.estudiante = estudiante;
        this.nota = nota;
        this.materia = materia;
        this.actividad = actividad;
    }

    public Nota() {
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
    
    
            
    
    
}
