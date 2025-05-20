package Universidad;

public class Profesor extends Persona{
    protected String departamento;
    protected String categoria;

    public Profesor(String nombre, String direccion, String departamento, String categoria) {
        super(nombre, direccion);
        this.departamento = departamento;
        this.categoria = categoria;
    }
    // Nuevos getters
    public String getDepartamento() {
        return departamento;
    }
    public String getCategoria() {
        return categoria;
    }
    
    //Nuevos setters
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
        System.out.println("Departamento actualizado con exito. Su departamento ahora es: " + departamento);
        System.out.println();
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
        System.out.println("Categoria actualizada con exito. Su categoria ahora es: " + categoria);
        System.out.println();
    }
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Departamento: " + departamento);
        System.out.println("Categoria: " + categoria);
        System.out.println();
    }  
}
