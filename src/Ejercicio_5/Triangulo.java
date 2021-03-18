package Ejercicio_5;
/*
* Ejercicio 5:
* Diseñar un programa para trabajar con triángulos isósceles. Para ello defina
* los atributos necesarios que se requieren, proporcione métodos de consulta,
* un método constructor e implemente métodos para calcular el perímetro y el área
* de un triángulo, además implementar un método que a partir de un arreglo de
* triángulos devuelva el área del triángulo de mayor superficie.
* */
public class Triangulo {
    private double lado;
    private double base;

    public Triangulo(double lado1, double base) {
        this.lado = lado1;
        this.base = base;
    }

    public double getPerimetro(){
        double perimetro = 2*lado + base;
        return perimetro;
    }

    public double getArea(){
        double altura = Math.sqrt((lado * lado) -(base/4));
        double area = (base * altura)/2;
        return area;
    }

}
