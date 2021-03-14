package sobrecarga_de_metodos;

public class Producto {

    String nombre;
    double precio;
    int codigo;

    /*
    * Sobrecarga de métodos
    * En java podemos crear metodos con el mismo nombre siempre y cuando
    * sus parametros sean diferentes
    *
    * En este ejemplo se crean dos constructores con parametros diferentes
    * y dos metodos guardar con parametros diferentes.
    * */
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(int codigo){
        this.codigo = codigo;
    }

    public void guardar(){
        System.out.println("Nuevo producto almacenado: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("precio: " + precio);
    }

    public void guardar(int codigo){
        System.out.println("Nuevo producto: ");
        System.out.println("Se almaceno un producto con el codigo: " + codigo);
    }

}
