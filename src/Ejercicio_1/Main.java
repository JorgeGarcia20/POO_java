package Ejercicio_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Cuadrilatero cuadrilatero1;

        float lado1;
        float lado2;

        System.out.print("Ingresa el primer lado del cuadrilatero -> ");
        lado1 = scanner.nextFloat();

        System.out.print("Ingresa el segundo lado del cuadrilatero -> ");
        lado2 = scanner.nextFloat();

        System.out.println("______________________________________________");

        if(lado1 == lado2){
            cuadrilatero1 = new Cuadrilatero(lado1);
        } else {
            cuadrilatero1 = new Cuadrilatero(lado1, lado2);
        }

        System.out.println("El area del cuadrilatero es: " + cuadrilatero1.getArea());
        System.out.println("El perimetro del cuadrilatero es: " + cuadrilatero1.getPerimetro());
        System.out.println("______________________________________________");
    }

}
