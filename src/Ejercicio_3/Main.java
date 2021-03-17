package Ejercicio_3;

import java.util.Scanner;

public class Main {

    public static int masBarato(Vehiculo vehiculo[]){
        float precio;
        int indice = 0;

        precio = vehiculo[0].getPrecio();
        for(int i = 1; i <vehiculo.length; i++){
            if(vehiculo[i].getPrecio() < precio){
                precio = vehiculo[1].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String marca;
        String modelo;
        float precio;
        int nVehiculos;
        int indiceBarato;

        System.out.print("Ingresa el numero de vehiculos que deseas ingresar: ");
        nVehiculos = scanner.nextInt();
        Vehiculo vehiculo[] = new Vehiculo[nVehiculos];

        for(int i = 0; i < vehiculo.length; i++){
            scanner.nextLine();
            System.out.println("Ingresa los datos del auto " + (i + 1) + ":");
            System.out.print("Ingresa la marca: ");
            marca = scanner.nextLine();
            System.out.print("Ingresa el modelo ");
            modelo = scanner.nextLine();
            System.out.print("Ingresa la precio: ");
            precio = scanner.nextFloat();
            System.out.println();
            vehiculo[i] = new Vehiculo(marca, modelo, precio);
        }

        indiceBarato = masBarato(vehiculo);
        System.out.println("El auto mas barato es: ");
        System.out.println(vehiculo[indiceBarato].mostrarDatos());

    }
}
