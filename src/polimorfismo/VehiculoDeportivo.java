package polimorfismo;

public class VehiculoDeportivo extends Vehiculo{
    private int caballos;

    public VehiculoDeportivo(String marca, String modelo, String matricula, int caballos) {
        super(marca, modelo, matricula);
        this.caballos = caballos;
    }

    public int getCaballos() {
        return caballos;
    }

    @Override
    public String mostrarDatos() {
        return "Marca: "+ marca +"\nModelo: " + modelo + "\nMatricula: " + matricula +
                "\nCaballos de fuerza: " + caballos;
    }
}
