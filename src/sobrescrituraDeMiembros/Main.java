package sobrescrituraDeMiembros;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Persona persona = new Persona();
        Perro perro = new Perro();
        Vaca vaca = new Vaca();

        animal.comer();
        persona.comer();
        perro.comer();
        vaca.comer();
    }
}
