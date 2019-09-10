package Controlador;

public class Materia {
    int codigo;
    String nombre;
    Grado grado;

    public Materia(int codigo, String nombre, Grado grado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.grado = grado;
    }

    public Materia() {
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }
    
}
