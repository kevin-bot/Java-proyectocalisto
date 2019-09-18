
package Controlador;

public class Salon {
    
    int id;
    String nombre;
    int tamaño,grado;

    public Salon(int id, String nombre, int tamaño, int grado) {
        this.id = id;
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.grado = grado;
    }

   

    public Salon() {
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
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
