package paquete2;

import paquete1.Clase1;

public class Clase3 {
    public static void main(String[] args) {
        Clase1 objeto2 = new Clase1();
        String obj2 = objeto2.atributo2 = "Soy el atributo2 y puedo ser accesado publicamente";
        System.out.println(obj2);
    }
}
