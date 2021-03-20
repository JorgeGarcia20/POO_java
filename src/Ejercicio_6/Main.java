package Ejercicio_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        System.out.println("1. Sumar dos números complejos\n" +
                "2. Multiplicar 2 números complejos\n" +
                "3. Comparar 2 números complejos (iguales o no)\n" +
                "4. Multiplicar un número complejos por un entero");

        opcion = scanner.nextInt();

        while(opcion != 0){
            if(opcion == 1){

            }else if(opcion == 2){

            }else if(opcion == 3){

            }else if(opcion == 5){

            }else{
                System.out.println("Error intenta de nuevo");
            }

        }








        NumeroComplejo numeroComplejo = new NumeroComplejo(3, 3, 5, 5);
        NumeroComplejo numeroComplejo2 = new NumeroComplejo(5, 8,7);

        System.out.println("____________________SUMA COMPLEJA___________________");
        numeroComplejo.sumaCompleja();

        System.out.println("_______________MULTIPLICACIÓN COMPLEJA______________");
        numeroComplejo.multiplicacionCompleja();

        System.out.println("________________COMPARACIÓN COMPLEJA________________");
        if(numeroComplejo.compararNumerosComplejos() == true ){
            System.out.println("Los números complejos son iguales");
        }
        else {
            System.out.println("Los números complejos no son iguales");
        }

        System.out.println("________MULTIPLICACION DE ENTERO POR COMPLETO________");
        numeroComplejo2.multiplicarEnteroComplejo();

    }
}
