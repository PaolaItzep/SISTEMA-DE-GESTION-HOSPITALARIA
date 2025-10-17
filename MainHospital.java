import java.time.LocalDateTime;
import java.util.Scanner;

public class MainHospital {
    public static void main(String[] args) {
        HospitalManager manager = new HospitalManager();
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("\n===== 🏥 SISTEMA DE GESTIÓN HOSPITALARIA =====");
            System.out.println("1. Contratar Doctor General");
            System.out.println("2. Contratar Cirujano");
            System.out.println("3. Crear Cita");
            System.out.println("4. Listar Citas");
            System.out.println("5. Mostrar Nómina");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nombre del doctor: ");
                    String nombre = sc.nextLine();
                    System.out.print("Departamento: ");
                    String depto = sc.nextLine();
                    System.out.print("Salario base: ");
                    double base = sc.nextDouble();
                    System.out.print("Tarifa por consulta: ");
                    double tarifa = sc.nextDouble();

                    DoctorGeneral doc = new DoctorGeneral(id, nombre, depto, base, tarifa);
                    manager.contratar(doc);
                    System.out.println("✅ Doctor general contratado exitosamente.");
                }

                case 2 -> {
                    System.out.print("Ingrese ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nombre del cirujano: ");
                    String nombre = sc.nextLine();
                    System.out.print("Departamento: ");
                    String depto = sc.nextLine();
                    System.out.print("Salario base: ");
                    double base = sc.nextDouble();
                    System.out.print("Tarifa por operación: ");
                    double tarifa = sc.nextDouble();
                    System.out.print("Bono de riesgo: ");
                    double bono = sc.nextDouble();

                    Cirujano cir = new Cirujano(id, nombre, depto, base, tarifa, bono);
                    manager.contratar(cir);
                    System.out.println("✅ Cirujano contratado exitosamente.");
                }

                case 3 -> {
                    if (manager.getTrabajadores().isEmpty()) {
                        System.out.println("⚠️ No hay médicos contratados. Contrate primero.");
                        break;
                    }

                    System.out.print("Ingrese ID de la cita: ");
                    String id = sc.nextLine();
                    System.out.print("Nombre del paciente: ");
                    String paciente = sc.nextLine();

                    System.out.println("Seleccione médico disponible:");
                    for (int i = 0; i < manager.getTrabajadores().size(); i++) {
                        System.out.println((i + 1) + ". " + manager.getTrabajadores().get(i).getNombre());
                    }
                    int idx = sc.nextInt() - 1;
                    TrabajadorMedico medico = manager.getTrabajadores().get(idx);

                    System.out.print("Hora de la cita (0-23): ");
                    int hora = sc.nextInt();
                    LocalDateTime fecha = LocalDateTime.of(2025, 10, 20, hora, 0);

                    Cita cita = new Cita(id, paciente, medico, fecha);
                    manager.crearCita(cita);
                }

                case 4 -> manager.listarCitas();
                case 5 -> manager.reporteNomina();
                case 6 -> System.out.println("👋 Saliendo del sistema...");
                default -> System.out.println("❌ Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 6);

        sc.close();
    }
}
