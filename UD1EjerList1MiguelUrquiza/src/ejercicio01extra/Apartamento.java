package ejercicio01extra;

public class Apartamento extends Habitacion{

    private double costeServicoLimpieza;

    public Apartamento(double precioBase, boolean ocupada, String nombreCliente, int numDias, int numOcupantes, double costeServicoLimpieza) {
        super(precioBase, ocupada, nombreCliente, numDias, numOcupantes);
        this.costeServicoLimpieza = costeServicoLimpieza;
    }

    public double getCosteServicoLimpieza() {
        return costeServicoLimpieza;
    }

    public void setCosteServicoLimpieza(double costeServicoLimpieza) {
        this.costeServicoLimpieza = costeServicoLimpieza;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "costeServicoLimpieza=" + costeServicoLimpieza +
                "} " + super.toString();
    }

    @Override
    public double calcularPrecioHab(double porcentaje) {
        return super.calcularPrecioHab(porcentaje)+costeServicoLimpieza;
    }

    @Override
    public void imprimirFactura(double porcentaje) {
        System.out.println("\t\t\tHotel Urquiza");
        System.out.println("***********************************************************");
        System.out.printf("Nombre Cliente: %s\t\t",getNombreCliente());
        System.out.printf("Número Ocupantes: %d\n",getNumOcupantes());
        System.out.println("----------------------------------------------------------");
        System.out.printf("Motivo\t\t\t Coste\t\t\t Dias\n");
        System.out.printf("PrecioBase:\t\t %.2f€\t\t\t %d\n",getPrecioBase(),getNumDias());
        System.out.printf("ServicioLimpieza %.2f€\t\t\t\n",getCosteServicoLimpieza());
        System.out.println("----------------------------------------------------------");
        System.out.printf("Subtotal:\t\t\t\t\t\t %.2f€\n",calcularPrecioHab(porcentaje));
    }
}
