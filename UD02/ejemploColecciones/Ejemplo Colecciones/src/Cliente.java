import java.util.Objects;

public class Cliente {

    private Long id;
    private String nombre;
    private int edad;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return edad == cliente.edad && Objects.equals(id, cliente.id) && Objects.equals(nombre, cliente.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, edad);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
