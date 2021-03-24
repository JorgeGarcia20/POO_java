package polimorfismo;

public class VehiculoTrabajo extends Vehiculo{
    private int carga;

    public VehiculoTrabajo(String marca, String modelo, String matricula, int carga) {
        super(marca, modelo, matricula);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String mostrarDatos() {
        return "Marca: "+ marca +"\nModelo: " + modelo + "\nMatricula: " + matricula +
                "\nCarga soportada: " + carga + "kg";
    }
}
