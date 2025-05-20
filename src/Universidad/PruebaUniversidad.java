package Universidad;

public class PruebaUniversidad {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Jesus", "Cra 80 #50", "Ingenieria en sistemas", 5);
        System.out.println("Imprimiendo datos del estudiante...");
        estudiante1.imprimir();
        System.out.println("Actualizando carrera del estudiante...");
        estudiante1.setCarrera("Musica");
        System.out.println("Actualizando direccion del estudiante...");
        estudiante1.setDireccion("Cra 43 #30");
        System.out.println("Imprimiendo datos del estudiante...");
        estudiante1.imprimir();
    }
}
