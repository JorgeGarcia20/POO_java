package polimorfismo;

public class Main {
    public static void main(String[] args) {
        /*
        * Polimorfismo
        * en este caso se creo un arreglo de objetos el cual contiene diferentes tipos de objetos
        * se cuenta con una super clase Vehiculo que herada sus atributos y funcion a las clases hijas
        * las cuales cuentan con atributos propios y sobreescriben un metodo.
        *
        * para recorrer este arreglo se hace uso de un foreach y se ejecuta el metodo mostrarDatos
        * como resultado obtener la impresion de los datos de cada clase con los atributos heredados y
        * los atributos propios
        * */

        Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("GMC", "Sierra", "GHB5t");
        misVehiculos[1] = new VehiculoFamiliar("Nissan", "Kiks", "89UTR", 4);
        misVehiculos[2] = new VehiculoDeportivo("Lamborgini", "Veneno", "HGT45E", 460);
        misVehiculos[3] = new VehiculoTrabajo("Ford", "F150", "(7TUR3", 2000);

        for(Vehiculo vehiculos: misVehiculos){ // foeeach
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
    }
}
