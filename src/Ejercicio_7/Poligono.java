package Ejercicio_7;
/*
* Ejercicio 9: Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos)
* el programa debe ser capaz de almacenar en un arreglo N triángulos y rectángulos, y al final
* mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente:
    - Una super clase llamada Polígono.
    - Una sub clase llamada Rectángulo.
    - Una sub clase llamada Triángulo.
* */

public abstract class Poligono {
    protected int nlados;

    public Poligono(int nlados){
        this.nlados = nlados;
    }

    public int getNlados() {
        return nlados;
    }

    @Override
    public String toString() {
        return "Número de lados: " + nlados;
    }

    public abstract double area();
}
