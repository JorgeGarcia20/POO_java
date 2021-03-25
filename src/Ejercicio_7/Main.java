package Ejercicio_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Arreglo dimanico
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        llenarPoligono();
        mostrarDatos();
    }

    public static void llenarPoligono(){
        char respuesta;
        int opcion;

        do {

            do {
                System.out.println("Digite que poligono desea introducir");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opción -> ");
                opcion = scanner.nextInt();
            }while (opcion < 1 || opcion > 2);

            switch (opcion){
                case 1: llenarTriangulo(); // llenar un triangulo
                    break;
                case 2: llenarRectangulo(); // llenar un rectangulo
                    break;
            }

            System.out.print("Deseas introducir otro poligono(s/n): ");
            respuesta = scanner.next().charAt(0);
            System.out.println("");

        }while (respuesta =='s' || respuesta == 'S' );

    }

    public static void llenarTriangulo(){
        double lado1, lado2, lado3;

        System.out.print("Digite el lado 1 del triangulo: ");
        lado1 = scanner.nextDouble();
        System.out.print("Digite el lado 2 del triangulo: ");
        lado2 = scanner.nextDouble();
        System.out.print("Digite el lado 3 del triangulo: ");
        lado3 = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        poligono.add(triangulo);
    }

    public static void llenarRectangulo(){
        double lado1, lado2;

        System.out.print("Digite el lado 1 del rectangulo: ");
        lado1 = scanner.nextDouble();
        System.out.print("Digite el lado 2 del rectangulo: ");
        lado2 = scanner.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligono.add(rectangulo);
    }

    public static void mostrarDatos(){
        for(Poligono figuras: poligono){
            System.out.println(figuras.toString());
            System.out.println("Area: " + figuras.area());
            System.out.println("");
        }
    }
}
