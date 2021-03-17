package Ejercicio_4;

import java.util.Scanner;

public class Main {
    
    public static int masRapido(Atleta atleta[]){
        int indice = 0;
        float tiempo;
        tiempo = atleta[0].getTiempo_carrera();
        for (int i = 0; i < atleta.length; i++){
            if (tiempo > atleta[i].getTiempo_carrera()){
                tiempo = atleta[i].getTiempo_carrera();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAtleta;
        String nombreAtleta;
        float tiempoCarrera;
        int numeroAtletas;
        int indiceAtleta;

        System.out.print("Ingresa el numero de atletas participantes: ");
        numeroAtletas = scanner.nextInt();

        Atleta atleta[] = new Atleta[numeroAtletas];

        for (int i = 0; i < atleta.length; i++){
            System.out.println("Ingresa los datos del atleta "+ (i + 1));
            System.out.print("Ingresa el numero del atleta -> ");
            numeroAtleta = scanner.nextInt();

            System.out.print("Ingresa el nombre del atleta -> ");
            nombreAtleta = scanner.next();

            System.out.print("Tiempo en el que finalizo la carrera ->");
            tiempoCarrera = scanner.nextFloat();

            System.out.println();

            atleta[i] = new Atleta(numeroAtleta, nombreAtleta, tiempoCarrera);
        }

        indiceAtleta = masRapido(atleta);
        System.out.println("El atleta mas rapido es: ");
        atleta[indiceAtleta].mostrarDatos();
    }

}
