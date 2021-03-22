package clasesYMetodosAbstractos;

public class Main {
    public static void main(String[] args) {
        Planta planta = new Planta();
        AnimalCarnivoro animalCarnivoro = new AnimalCarnivoro();
        AnimalHervivoro animalHervivoro = new AnimalHervivoro();

        planta.comer();
        animalCarnivoro.comer();
        animalHervivoro.comer();

    }
}
