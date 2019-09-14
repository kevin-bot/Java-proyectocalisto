
package Controlador;

public class Estudiante {

    String it,nombre,apellido,eps,estado,strato,año;
    Grado grado;

    public Estudiante(String it, String nombre, String apellido, String eps, String estado, String strato, String año, Grado grado) {
        this.it = it;
        this.nombre = nombre;
        this.apellido = apellido;
        this.eps = eps;
        this.estado = estado;
        this.strato = strato;
        this.año = año;
        this.grado = grado;
    }

    public Estudiante(String it, String nombre, String apellido, String eps, String strato, Grado grado) {
        this.it = it;
        this.nombre = nombre;
        this.apellido = apellido;
        this.eps = eps;
        this.strato = strato;
        this.grado = grado;
    }

    public String getStrato() {
        return strato;
    }

    public void setStrato(String strato) {
        this.strato = strato;
    }

    

   

    public Estudiante() {
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
   

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }


    
}
