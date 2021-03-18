package Ejercicio_5;

import java.util.Scanner;

public class Main {

    public static double mayorArea(Triangulo triangulo[]){
        double area = triangulo[0].getArea();
        for (int i = 0; i < triangulo.length; i++){
            if( triangulo[i].getArea() > area){
                area = triangulo[i].getArea();
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado = 0;
        double base = 0;
        int numeroTriangulos = 0;
        int indiceTriangulo;

        System.out.print("Ingrese la cantidad de triangulos a analizar: ");
        numeroTriangulos = scanner.nextInt();

        Triangulo triangulo[] = new Triangulo[numeroTriangulos];

        for(int i = 0; i <triangulo.length; i++){
            System.out.println("Ingresa los datos para el triangulo " + (i+1));

            System.out.print("Introduce la medida de los lados: ");
            lado = scanner.nextFloat();

            System.out.print("Ingresa la medida de la base: ");
            base = scanner.nextFloat();

            System.out.println("________________________________________");

            triangulo[i] = new Triangulo(lado, base);

            System.out.println("Area: " + triangulo[i].getArea());
            System.out.println("Perimetro: "+ triangulo[i].getPerimetro());
            System.out.println("________________________________________");
        }

        System.out.println("El triangulo con mayor supercie es: " + mayorArea(triangulo));

    }

}
