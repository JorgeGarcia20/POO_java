package herencia;

public class Estudiante extends Persona{
    private int numeroEstudiante;
    private float notaFinal;

    public Estudiante(String nombre, String apellido, int edad, int numeroEstudiante, float notaFinal){
        super(nombre, apellido, edad);
        this.numeroEstudiante = numeroEstudiante;
        this.notaFinal = notaFinal;
    }

    public int getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Numero de estudiante: " + numeroEstudiante);
        System.out.println("Nota final: " + notaFinal);
    }
}
