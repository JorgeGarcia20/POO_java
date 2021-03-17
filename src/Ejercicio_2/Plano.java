package Ejercicio_2;

public class Plano {
    // Atributos
    private int ejeX;
    private int ejeY;

    //metodos
    public Plano(int ejeX, int ejeY){
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }

    public void mover_arriba(){
        ejeY++;
        System.out.println("Posision actual -> ["+ ejeX + ", " + ejeY + "]");
    }
    public void mover_abajo(){
        ejeY--;
        System.out.println("Posision actual -> ["+ ejeX + ", " + ejeY + "]");
    }
    public void mover_derecha(){
        ejeX++;
        System.out.println("Posision actual -> ["+ ejeX + ", " + ejeY + "]");
    }
    public void mover_izquierda(){
        ejeX--;
        System.out.println("Posision actual -> ["+ ejeX + ", " + ejeY + "]");
    }

}
