package polimorfismo;

public class VehiculoFamiliar extends Vehiculo{
    private int nPuertas;

    public VehiculoFamiliar(String marca, String modelo, String matricula, int nPuertas) {
        super(marca, modelo, matricula);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    @Override
    public String mostrarDatos() {
        return "Marca: "+ marca +"\nModelo: " + modelo + "\nMatricula: " + matricula +
                "\nNúmero de puertas: " + nPuertas;
    }
}
