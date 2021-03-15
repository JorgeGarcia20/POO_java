package encapsulamiento_metodos_accesores;

public class Main {
    public static void main(String[] args){
        Clase1 clase1 = new Clase1();

        clase1.setNombre("Jorge");
        clase1.setEdad(21);

        System.out.println("El nombre es: " + clase1.getNombre());
        System.out.println("La edad es: " + clase1.getEdad());
    }
}
