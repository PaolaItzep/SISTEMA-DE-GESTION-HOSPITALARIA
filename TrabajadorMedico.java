public abstract class TrabajadorMedico {
    protected String id;
    protected String nombre;
    protected String departamento;
    protected double salarioBase;

    public TrabajadorMedico(String id, String nombre, String departamento, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salarioBase = salarioBase;
    }

    public String getNombre() { return nombre; }
    public String getDepartamento() { return departamento; }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return nombre + " (" + departamento + ") - Salario base: Q" + salarioBase;
    }
}
