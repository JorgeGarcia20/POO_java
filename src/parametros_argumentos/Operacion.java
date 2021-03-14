package parametros_argumentos;

import javax.swing.*;

public class Operacion {

    int suma;
    int resta;
    int multiplicacion;
    int divicion;

    /*
    * Los parametros son los datos que se especifican al definir la clase
    * Los argumentos son los que se colocan en la instancia de la clase
    * */

    public int sumar(int x, int y){
        suma = x + y;
        return suma;
    }

    public int restar(int x, int y){
        resta = x - y;
        return resta;
    }

    public int multiplicar(int x, int y){
        multiplicacion = x * y;
        return multiplicacion;
    }

    public int dividir(int x, int y){
        divicion = x / y;
        return divicion;
    }

    public void mostrar_resultados(){
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la divicion es: " + divicion);
    }


}
