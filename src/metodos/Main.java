package metodos;

public class Main {
    public static void main(String[] args) {
        Operacion op = new Operacion();

        op.pedir_numeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrar_resultados();
    }
}
