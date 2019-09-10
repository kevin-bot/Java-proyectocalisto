
package Controlador;

public class Estudiante {

    String it,nombre,estado,año,matricula;
    Grado grado;

    public Estudiante(String it, String nombre, String estado, String año, String matricula, Grado grado) {
        this.it = it;
        this.nombre = nombre;
        this.estado = estado;
        this.año = año;
        this.matricula = matricula;
        this.grado = grado;
    }

    public Estudiante() {
    }

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }
    
}
