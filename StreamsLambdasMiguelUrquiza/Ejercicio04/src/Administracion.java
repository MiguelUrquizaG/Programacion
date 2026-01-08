import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Administracion {

    private List<Empleado> empleadoList;

    public Administracion(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public List<Empleado>obtenerEmpleadosActivosSueldo(){

        List<Empleado> lista= new ArrayList<Empleado>();
       lista = empleadoList.stream()
                .filter(Empleado::isActivo)
               .filter(e-> e.getSalario()>calcularPromedio())
                .toList();

        return lista;
    }

    public double calcularPromedio(){

        return empleadoList.stream().mapToDouble(Empleado::getSalario)
                .sum()/empleadoList.size();

    }

    public Empleado buscarEmpleado(String nombre){
        return empleadoList.stream()
                .filter(e->e.getNombre().equalsIgnoreCase(nombre))
                .findFirst().orElseThrow(() -> new RuntimeException("No se ha encontrado el empleado."));

    }

    public Map<String,List<Empleado>> obtenerEmpleadosSueldoDepartamento(){
        List<Empleado> lista = new ArrayList<>();

        Map<String,List<Empleado>>group = empleadoList.stream()
                .collect(Collectors.groupingBy(Empleado::getDepartamento));




       /* group.forEach((departamento,empleadoList) ->{

        });*/

        return group;

    }

    public double calcularSalarioTotalEmpleados(int anyos){
        return empleadoList.stream()
                .filter(e->e.getAnyosAntiguedad()>anyos)
                .mapToDouble(Empleado::getSalario)
                .sum();
    }

    public List<Empleado> obtenerRankingSalarioAntiguedad(){
        return empleadoList.stream()
                .sorted(Comparator.comparing(Empleado::getSalario))
                .sorted(Comparator.comparing(Empleado::getAnyosAntiguedad))
                .toList();
    }

    @Override
    public String toString() {
        return "Administracion{" +
                "empleadoList=" + empleadoList +
                '}';
    }
}
