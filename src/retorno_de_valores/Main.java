package retorno_de_valores;

import javax.swing.*;

public class Main {
    public static void main(String[] args){

        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero: "));


        Operacion operacion = new Operacion();

        System.out.println("La suma es: " + operacion.sumar(x, y));
        System.out.println("La resta es: " + operacion.restar(x, y));
        System.out.println("La multiplicacion es: " + operacion.multiplicar(x, y));
        System.out.println("La divicion es: " + operacion.dividir(x, y));
    }
}
