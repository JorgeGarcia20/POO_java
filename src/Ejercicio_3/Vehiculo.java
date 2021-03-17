package Ejercicio_3;
/*
* Ejercicio 3:
* Construir un programa que dada una serie de vehículos caracterizados
* por su marca, modelo y precio, imprima las propiedades del vehículo más barato.
* Para ello, se deberán leer por teclado las características de cada vehículo y crear
* una clase que represente a cada uno de ellos.
* */

public class Vehiculo {
    // Atrubutos
    private String marca;
    private String modelo;
    private float precio;

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String mostrarDatos(){
        return "La marca es: " + marca + "\n" +
                "El modelo es: " + modelo + "\n"+
                "El precio es: " + precio + "\n";
    }
}
