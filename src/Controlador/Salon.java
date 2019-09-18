
package Controlador;

public class Salon {
    
    int id;
    String nombre,grado;
    int tamaño;

    public Salon(int id, String nombre, String grado, int tamaño) {
        this.id = id;
        this.nombre = nombre;
        this.grado = grado;
        this.tamaño = tamaño;
    }
   

    public Salon() {
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
