public class DoctorGeneral extends TrabajadorMedico {
    private int consultasRealizadas;
    private double tarifaConsulta;

    public DoctorGeneral(String id, String nombre, String depto, double base, double tarifa) {
        super(id, nombre, depto, base);
        this.tarifaConsulta = tarifa;
        this.consultasRealizadas = 0;
    }

    public void registrarConsulta() { consultasRealizadas++; }

    @Override
    public double calcularSalario() {
        return salarioBase + (consultasRealizadas * tarifaConsulta);
    }

    @Override
    public String toString() {
        return "Doctor General: " + super.toString() + " - Consultas: " + consultasRealizadas;
    }
}
