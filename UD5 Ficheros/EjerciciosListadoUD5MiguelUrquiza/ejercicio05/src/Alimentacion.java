public class Alimentacion extends Producto{
    private int diasCaducidad;
    private boolean refrigerado;
    public Alimentacion(double precioUnitario, String nombre, int codigoIdentificacion, int diasCaducidad,
                        boolean refrigerado) {
        super(precioUnitario, nombre, codigoIdentificacion);
        this.diasCaducidad = diasCaducidad;
        this.refrigerado = refrigerado;
    }
    public int getDiasCaducidad() {
        return diasCaducidad;
    }
    public void setDiasCaducidad(int diasCaducidad) {
        this.diasCaducidad = diasCaducidad;
    }
    public boolean isRefrigerado() {
        return refrigerado;
    }
    public void setRefrigerado(boolean refrigerado) {
        this.refrigerado = refrigerado;
    }
    @Override
    public String toString() {
        return "Alimentacion [diasCaducidad=" + diasCaducidad + ", refrigerado=" + refrigerado + "]";
    }

    public double calcularPVP(double porcentajeIva,double descuento,double impuesto,int topeCaducidad) {

        double total=0,pvp=super.calcularPVP(porcentajeIva, descuento, impuesto, topeCaducidad);

        if(diasCaducidad<topeCaducidad) {

            total = pvp-pvp*descuento/100;
        }else {
            total = pvp;
        }

        return total;
    }

    public void avisarCaducidad(int topeCaducidad) {
        if(diasCaducidad<topeCaducidad)
            System.out.println("**** A punto de caducar");
    }
}
