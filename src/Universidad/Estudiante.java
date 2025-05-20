package Universidad;

public class Estudiante extends Persona {
    protected String carrera;
    protected int semestre;

    public Estudiante(String nombre, String direccion, String carrera, int semestre) {
        super(nombre, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    // Nuevos getters
    public String getCarrera() {
        return carrera;
    }
    public int getSemestre() {
        return semestre;
    }
    
    // Nuevos setters
    public void setCarrera(String carrera) {
        this.carrera = carrera;
        System.out.println("Carrera actualizada con exito. Su carrera ahora es: " + carrera);
        System.out.println();
    }
    public void setSemestre(int Semestre) {
        this.semestre = semestre;
        System.out.println("Semestre actualizado con exito. Su semestre ahora es: " + semestre);
        System.out.println();
    }
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
        System.out.println();
        
    
    }

}
