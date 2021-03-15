package encapsulamiento_metodos_accesores;

public class Clase1 {
    //Encapsulamos las variables para poder tener control del acceso
    private String nombre;
    private int edad;

    /*
    * Los metodos setter permiten establecer un valor
    * Los metodos getter permiter mostrar el valor
    * */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}
