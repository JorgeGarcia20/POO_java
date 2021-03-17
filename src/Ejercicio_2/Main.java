package Ejercicio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char movimiento = '0';
        Plano plano1 = new Plano(0, 0);

        while(movimiento != 'e'){
            System.out.print("Haz un movimiento-> ");
            movimiento = scanner.next().charAt(0);

            if (movimiento == 'w'){
                plano1.mover_arriba();
            } else if (movimiento == 's'){
                plano1.mover_abajo();
            } else if (movimiento == 'd'){
                plano1.mover_derecha();
            } else if (movimiento == 'a'){
                plano1.mover_izquierda();
            } else{
                System.out.println("Movimiento no valido intenta nuevamente");
                System.out.println("Arriba -> w\n" +
                        "Abajo -> s\n" +
                        "Izquierda -> a\n" +
                        "Derecha -> d\n" +
                        "Salir -> e");
            }
        }
    }
}
