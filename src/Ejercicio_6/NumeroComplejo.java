package Ejercicio_6;
/*
* Ejercicio 5:
Ejercicio 6: Construir un programa para trabajar con 2 números complejos, implemente el siguiente menú:
1. Sumar dos números complejos
2. Multiplicar 2 números complejos
3. Comparar 2 números complejos (iguales o no)
4. Multiplicar un número complejos por un entero

* Un numero complejo es aquel que esta compuesto por un numero real y uno imaginario
*
* */
public class NumeroComplejo {
    private int real1;
    private int real2;
    private int imaginario1;
    private int imaginario2;
    private int entero;

    public NumeroComplejo(int real1, int real2, int imaginario1, int imaginario2) {
        this.real1 = real1;
        this.real2 = real2;
        this.imaginario1 = imaginario1;
        this.imaginario2 = imaginario2;
    }

    private int getSumaReal(){
        int sumaReal = real1 + real2;
        return sumaReal;
    }

    private int getSumaImaginaria(){
        int sumaImg = imaginario1 + imaginario2;
        return  sumaImg;
    }


    public void sumaCompleja(){
        System.out.println("(" + real1 + " + " + imaginario1 + "i) + (" + real2 + " + " + imaginario2 + "i)");
        System.out.println("(" + real1 + " + " + real2 + ") + (" + imaginario1 + "i + " + imaginario2 + "i)");
        System.out.println("(" + getSumaReal() + " + " + getSumaImaginaria() + "i)");
    }

    public void multiplicacionCompleja(){
        System.out.println("(" + real1 + " + " + imaginario1 + "i) * (" + real2 + " + " + imaginario2 + "i)");
        System.out.println(real1 + "(" + real2 + " + "+ imaginario2 +"i"+ ") + " + imaginario1 + "i" + "(" + real2 + " + " + imaginario2 + "i" + ")");
        System.out.println("(" + (real2*real1) +" + "+ (imaginario2*real1) + "i" + ") + (" + (real2*imaginario1) + "i" + " + " + (imaginario2*imaginario1)+"i^2"+ ")");

    }




}
