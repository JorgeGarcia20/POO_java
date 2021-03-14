package parametros_argumentos;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero: "));

        Operacion op = new Operacion();
        op.sumar(x, y);
        op.restar(x, y);
        op.multiplicar(x, y);
        op.dividir(x, y);
        op.mostrar_resultados();
    }

}
