package Ejercicio_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int real1;
        int real2;
        int imaginario1;
        int imaginario2;
        int opcion;

        System.out.println("Elige la operacion que deseas realizar" +
                "1. Sumar dos números complejos\n" +
                "2. Multiplicar 2 números complejos\n" +
                "3. Comparar 2 números complejos (iguales o no)\n" +
                "4. Multiplicar un número complejos por un entero");
        System.out.print("-> ");

        opcion = scanner.nextInt();

        while(opcion != 0){

            if(opcion == 1){
                System.out.println("____________________SUMA COMPLEJA___________________");
                System.out.print("Número real: ");
                real1 = scanner.nextInt();
                System.out.print("Numero imaginario: ");
                imaginario1 = scanner.nextInt();
                System.out.print("Número real: ");
                real2 = scanner.nextInt();
                System.out.print("Numero imaginario: ");
                imaginario2 = scanner.nextInt();

                NumeroComplejo numeroComplejo = new NumeroComplejo(real1, imaginario1, real2, imaginario2);
                numeroComplejo.sumaCompleja();
                break;

            }else if(opcion == 2){
                System.out.println("_______________MULTIPLICACIÓN COMPLEJA______________");
                System.out.print("Número real: ");
                real1 = scanner.nextInt();
                System.out.print("Numero imaginario: ");
                imaginario1 = scanner.nextInt();
                System.out.print("Número real: ");
                real2 = scanner.nextInt();
                System.out.print("Numero imaginario: ");
                imaginario2 = scanner.nextInt();

                NumeroComplejo numeroComplejo = new NumeroComplejo(real1, imaginario1, real2, imaginario2);
                numeroComplejo.multiplicacionCompleja();
                break;

            }else if(opcion == 3){
                System.out.println("________________COMPARACIÓN COMPLEJA________________");
                System.out.print("Número real: ");
                real1 = scanner.nextInt();
                System.out.print("Numero imaginario: ");
                imaginario1 = scanner.nextInt();
                System.out.print("Número real: ");
                real2 = scanner.nextInt();
                System.out.print("Numero imaginario: ");
                imaginario2 = scanner.nextInt();

                NumeroComplejo numeroComplejo = new NumeroComplejo(real1, imaginario1, real2, imaginario2);
                numeroComplejo.compararNumerosComplejos();
                break;

            }else if(opcion == 4){
                System.out.println("________MULTIPLICACION DE ENTERO POR COMPLETO________");
                System.out.print("Número real: ");
                real1 = scanner.nextInt();
                System.out.print("Número real: ");
                real2 = scanner.nextInt();
                System.out.print("Numero imaginario: ");
                imaginario1 = scanner.nextInt();

                NumeroComplejo numeroComplejo = new NumeroComplejo(real1, real2, imaginario1);
                numeroComplejo.multiplicarEnteroComplejo();
                break;

            }else{
                System.out.println("Error intenta de nuevo");
                break;
            }

        }
    }
}
