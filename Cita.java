import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cita {
    private String id;
    private String paciente;
    private TrabajadorMedico trabajador;
    private LocalDateTime fechaHora;
    private String estado;

    public Cita(String id, String paciente, TrabajadorMedico trabajador, LocalDateTime fechaHora) {
        this.id = id;
        this.paciente = paciente;
        this.trabajador = trabajador;
        this.fechaHora = fechaHora;
        this.estado = "PROGRAMADA";
    }

    public TrabajadorMedico getTrabajador() { return trabajador; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public String getId() { return id; }
    public String getEstado() { return estado; }

    public void reagendar(LocalDateTime nuevaFecha) {
        this.fechaHora = nuevaFecha;
        this.estado = "REAGENDADA";
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return String.format("Cita[%s] Paciente: %s - %s - %s (%s)",
                id, paciente, trabajador.getNombre(), fechaHora.format(f), estado);
    }
}
