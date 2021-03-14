package paquete1;

public class Clase2 {

    public static void main(String[] args){
        Clase1 objeto = new Clase1();
        String objeto1 = objeto.atributo1 = "Soy un atributo que solo puedo ser accesado en el paquete actual";
        String objeto2 = objeto.atributo2 = "Soy un atributo publico, puedo ser accesado por cualquier clase";
        System.out.println(objeto1);
        System.out.println(objeto2);
        objeto.mensanje();
    }
}
