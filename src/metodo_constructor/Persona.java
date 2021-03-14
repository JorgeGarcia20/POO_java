package metodo_constructor;

public class Persona {
    String nombre;
    String apellido;
    int edad;
    String profecion;


    // Creacion del metodo constructor
    public Persona(String nombre, String apellido, int edad, String profecion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.profecion = profecion;
    }

    public void mostrar_datos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Profeción: " + profecion);
    }
}
