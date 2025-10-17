import java.util.ArrayList;
import java.util.List;

public class HospitalManager {
    private List<TrabajadorMedico> trabajadores = new ArrayList<>();
    private List<Cita> citas = new ArrayList<>();

    public void contratar(TrabajadorMedico t) {
        trabajadores.add(t);
        System.out.println("✅ Contratado: " + t.getNombre());
    }

    public void crearCita(Cita c) {
        boolean conflicto = citas.stream()
                .anyMatch(x -> x.getTrabajador().equals(c.getTrabajador()) &&
                               x.getFechaHora().equals(c.getFechaHora()));
        if (conflicto) {
            System.out.println("⚠️ Conflicto detectado en " + c.getId() +
                               " con el doctor " + c.getTrabajador().getNombre());
            c.reagendar(c.getFechaHora().plusHours(1));
            System.out.println("🔄 Cita reagendada automáticamente a: " + c.getFechaHora());
        }
        citas.add(c);
        System.out.println("📅 Cita creada: " + c);
    }

    public void listarCitas() {
        System.out.println("\n📋 Citas registradas:");
        citas.forEach(System.out::println);
    }

    public void reporteNomina() {
        System.out.println("\n💰 Nómina del hospital:");
        for (TrabajadorMedico t : trabajadores) {
            System.out.printf(" - %s: Q%.2f%n", t.getNombre(), t.calcularSalario());
        }
    }
   public List<TrabajadorMedico> getTrabajadores() {
    return trabajadores;
    }
}
