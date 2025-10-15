package HerenciaPolimorfismo.ejercicio05;

public class Principal {
    public static void main(String[] args) {

        Empleado e = new Empleado("Miguel","Urquiza",1000,1);
        Empleado v = new Vendedor("Juan","Garcia",500,2,100,10);
        Empleado g = new Gerente("Mari","Ruiz",2000,5,20);

        Empleado[]array={e,v,g};

        Oficina o = new Oficina(array);



        System.out.println( o.getLista()[0].calcularSueldo());
        System.out.println( o.getLista()[1].calcularSueldo());
        System.out.println( o.getLista()[2].calcularSueldo());


        if(o.getLista()[1] instanceof  Vendedor){
            ((Vendedor)o.getLista()[1]).felicitarVendedor(20);
        }



    }
}
