
package Universidad;

public class Persona {
    protected String nombre;
    protected String direccion;
    
    public Persona(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;           
    }
    // Getters
    public String getNombre() {
     return nombre;
    }
    public String getDireccion() {
     return direccion;       
    }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
        System.out.println("Nombre actualizado con exito. Su nombre ahora es: " + nombre);
        System.out.println();
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
        System.out.println("Direccion actualizada con exito. Su direccion ahora es: " + direccion);
        System.out.println();
    }
}