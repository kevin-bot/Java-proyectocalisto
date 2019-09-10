
package Controlador;

public class Salon {
    
    int id;
    String nombre;

    public Salon(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Salon() {
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
