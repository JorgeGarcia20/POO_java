package miembros_estaticos;

public class Estatico {


    private static String frase = "Hola, soy una variable estatica";

    public static int sumar(int x, int y){
        int suma = x + y;
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Los metodos y variables estaticas no le pertenecen a los objetos\n" +
                "le pertenecen a las clases asi que no es necesario instanciar la clase para hacer uso de estos");
        System.out.println("___________________________________________________________________________________");
        System.out.println(Estatico.frase);
        System.out.println("___________________________________________________________________________________");
        System.out.println("El resultado del metodo statico para sumar dos numeros es: " + Estatico.sumar(34, 90));

    }
}
