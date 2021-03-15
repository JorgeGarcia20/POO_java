package constantes;

public class Persona {
    /*
    * Una constante un dato que nunca cambiare su valor
    * Las constantes solo tienen un metodo y es el metodo get, debido a que no podemos asignar algun otro valor.
    * */
    private final String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrar_datos(){
        System.out.println("Mi nombre es: " + nombre + " y es una constante");
        System.out.println("Mi edad es: " + edad+ " y es una variable");
    }
}
