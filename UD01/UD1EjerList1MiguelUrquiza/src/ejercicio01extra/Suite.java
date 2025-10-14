package ejercicio01extra;

public class Suite extends Habitacion{

    private double metrosCuadrados;
    private double cantDineroConsumidoServicioHab;

    public Suite(double precioBase, boolean ocupada, String nombreCliente, int numDias, int numOcupantes, double metrosCuadrados, double cantDineroConsumidoServicioHab) {
        super(precioBase, ocupada, nombreCliente, numDias, numOcupantes);
        this.metrosCuadrados = metrosCuadrados;
        this.cantDineroConsumidoServicioHab = cantDineroConsumidoServicioHab;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public double getCantDineroConsumidoServicioHab() {
        return cantDineroConsumidoServicioHab;
    }

    public void setCantDineroConsumidoServicioHab(double cantDineroConsumidoServicioHab) {
        this.cantDineroConsumidoServicioHab = cantDineroConsumidoServicioHab;
    }

    @Override
    public String toString() {
        return "Suite{" +
                "metrosCuadrados=" + metrosCuadrados +
                ", cantDineroConsumidoServicioHab=" + cantDineroConsumidoServicioHab +
                "} " + super.toString();
    }

    @Override
    public double calcularPrecioHab(double porcentaje) {

         double precio = super.calcularPrecioHab(porcentaje);
        precio +=cantDineroConsumidoServicioHab;
        precio -=precio*(porcentaje/100);


        return precio;
    }

    @Override
    public void imprimirFactura(double porcentaje) {
        System.out.println("\t\t\tHotel Urquiza");
        System.out.println("***********************************************************");
        System.out.printf("Nombre Cliente: %s\t\t",getNombreCliente());
        System.out.printf("Número Ocupantes: %d\n",getNumOcupantes());
        System.out.printf("Metros cuadrados: %.2f m2\n",getMetrosCuadrados());
        System.out.println("----------------------------------------------------------");
        System.out.printf("Motivo\t\t\t Coste\t\t\t Dias\n");
        System.out.printf("PrecioBase:\t\t %.2f€\t\t\t %d\n",getPrecioBase(),getNumDias());
        System.out.printf("ServicioHab:\t %.2f€\t\t\t\n",getCantDineroConsumidoServicioHab());
        System.out.printf("Descuento:\t\t %.2f%%\t\t\t\n",porcentaje);
        System.out.println("----------------------------------------------------------");
        System.out.printf("Subtotal:\t\t\t\t\t\t %.2f€\n",calcularPrecioHab(porcentaje));
    }
}
