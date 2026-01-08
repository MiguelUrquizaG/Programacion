import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empleado e =  new Empleado(1,"Miguel",200,true,3,"Programacion");
        Empleado e2 =  new Empleado(2,"Paco",5,true,1,"Recursos Humanos");
        Empleado e3 =  new Empleado(3,"MAría",200,true,5,"Recursos Humanos");

        List<Empleado> empleadoList = List.of(e,e2,e3);

        Administracion administracion = new Administracion(empleadoList);

        System.out.println(administracion.obtenerEmpleadosActivosSueldo());
        System.out.println(administracion.calcularPromedio());
     /*   System.out.println(administracion.buscarEmpleado("M"))*/;
        System.out.println(administracion.obtenerEmpleadosSueldoDepartamento());
        System.out.println(administracion.calcularSalarioTotalEmpleados(2));
        System.out.println(administracion.obtenerRankingSalarioAntiguedad());

    }
}