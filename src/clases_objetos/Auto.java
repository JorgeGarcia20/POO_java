package clases_objetos;

public class Auto {
    String marca;
    String color;
    int km;

    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.marca = "Ford";
        auto1.color = "Gris";
        auto1.km = 0;

        System.out.println("La marca del auto 1 es: " + auto1.marca);
        System.out.println("El color del auto 1 es: " + auto1.color);
        System.out.println("EL kilometraje del auto 1 es: " + auto1.km + "km");

        Auto auto2 = new Auto();
        auto2.marca = "Nissan";
        auto2.color = "Blanco";
        auto2.km = 20;

        System.out.println("\nLa marca del auto 2 es: " + auto2.marca);
        System.out.println("El color del auto 2 es: " + auto2.color);
        System.out.println("El kilometraje del auto 2 es: " + auto2.km + "km");
    }


}


