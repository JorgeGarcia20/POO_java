package metodos;

import javax.swing.*;

public class Operacion {
    int x;
    int y;
    int suma;
    int resta;
    int multiplicacion;
    int divicion;

    // metodo para pedir los numeros al usuario
    public void pedir_numeros(){
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro número: "));
    }

    // Para crear un metodo que no retorne ningun valor se usa la palabra void
    public void sumar(){
        suma = x + y;
    }

    public void restar(){
        resta = x - y;
    }

    public void multiplicar(){
        multiplicacion = x * y;
    }

    public void dividir(){
        divicion = x / y;
    }

    public void mostrar_resultados(){
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la divicion es: " + divicion);
    }

}
