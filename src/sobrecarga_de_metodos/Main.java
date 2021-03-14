package sobrecarga_de_metodos;

public class Main {
    public static void main(String[] args){
        Producto sabritas = new Producto("sabritas", 12);

        sabritas.guardar();

        int codigo = 27382183;
        Producto cocacola = new Producto(codigo);
        cocacola.guardar(codigo);
    }
}
