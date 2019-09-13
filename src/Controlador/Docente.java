
package Controlador;


public class Docente extends Usuario{
        String grado,formacion,fecha_ingreso;

        //CONTRUCTOR TOTAL PARA CONSULTAS

    public Docente(String grado, String formacion, String fecha_ingreso, String cedula, String nombre, String apellido, String eps, String estrato, String password, String telefono, String direccion) {
        super(cedula, nombre, apellido, eps, estrato, password, telefono, direccion);
        this.grado = grado;
        this.formacion = formacion;
        this.fecha_ingreso = fecha_ingreso;
    }
    
    
    //CONSTRUCTOR PARA INSERCION 

    public Docente(String grado, String formacion, String cedula, String nombre, String apellido, String eps, String estrato, String password, String telefono, String direccion) {
        super(cedula, nombre, apellido, eps, estrato, password, telefono, direccion);
        this.grado = grado;
        this.formacion = formacion;
    }
        
    
            
    
         public Docente() {
            }
    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
  
   
    //CRUD NOTAS
   
        public void Administrar_notas(){
            System.out.println("Acá va la interfaz de alexandra");
        }
    // RENDIMINETO ESTUDIANTE
    
    public void ConsultarRendimientoEstudiante(){
        
    }
   
}
