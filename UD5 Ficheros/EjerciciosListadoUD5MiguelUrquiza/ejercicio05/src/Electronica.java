public class Electronica extends Producto{
    private boolean lujo;

    public Electronica(double precioUnitario, String nombre, int codigoIdentificacion, boolean lujo) {
        super(precioUnitario, nombre, codigoIdentificacion);
        this.lujo = lujo;
    }

    public boolean isLujo() {
        return lujo;
    }

    public void setLujo(boolean lujo) {
        this.lujo = lujo;
    }

    @Override
    public String toString() {
        return "Electronica [lujo=" + lujo + "]";
    }

    public double calcularPVP(double porcentajeIva, double descuento, double impuesto, int topeCaducidad) {
        double pvp = super.calcularPVP(porcentajeIva, descuento, impuesto, topeCaducidad);
        double total;
        if (lujo) {
            total = pvp + pvp * impuesto / 100;
        } else {
            total = pvp;
        }

        return total;
    }
}
