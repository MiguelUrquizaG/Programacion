package ejercicio11;

public class Principal {
    public static void main(String[] args) {

        Empleado e1 =  new Programador(10,3,5,3,5);
        Empleado e2 = new Analista(10,0,1,500);
        Empleado e3 = new JefeProyecto(100,12,5,true,50);
        System.out.println(e1.calcularSueldo());
        System.out.println(e2.calcularSueldo());
        System.out.println(e3.calcularSueldo());
    }
}
