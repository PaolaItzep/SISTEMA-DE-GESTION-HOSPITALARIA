public class Cirujano extends TrabajadorMedico {
    private int operacionesRealizadas;
    private double tarifaOperacion;
    private double bonoRiesgo;

    public Cirujano(String id, String nombre, String depto, double base, double tarifa, double bono) {
        super(id, nombre, depto, base);
        this.tarifaOperacion = tarifa;
        this.bonoRiesgo = bono;
        this.operacionesRealizadas = 0;
    }

    public void registrarOperacion() { operacionesRealizadas++; }

    @Override
    public double calcularSalario() {
        return salarioBase + (operacionesRealizadas * tarifaOperacion) + bonoRiesgo;
    }

    @Override
    public String toString() {
        return "Cirujano: " + super.toString() + " - Operaciones: " + operacionesRealizadas;
    }
}
