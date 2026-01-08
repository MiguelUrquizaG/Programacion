public class Empleado {

    private int id;
    private String nombre;
    private double salario;
    private boolean activo;
    private int anyosAntiguedad;
    private String departamento;


    public Empleado(int id, String nombre, double salario, boolean activo, int anyosAntiguedad, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.activo = activo;
        this.anyosAntiguedad = anyosAntiguedad;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getAnyosAntiguedad() {
        return anyosAntiguedad;
    }

    public void setAnyosAntiguedad(int anyosAntiguedad) {
        this.anyosAntiguedad = anyosAntiguedad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", activo=" + activo +
                ", anyosAntiguedad=" + anyosAntiguedad +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
