package ejercicio08;

public class Gestion {

    private Plataforma plataforma;
    private double costeFutbol;
    private double costePelis;
    private double costeSeries;
    private double descuentoPersonas;
    private double costePremium;
    private boolean futbol;
    private boolean pelis;
    private boolean series;
    private double descuentoPaquetes;

    public Gestion(Plataforma plataforma, double costeFutbol, double costePelis, double costeSeries, double descuentoPersonas, double costePremium) {
        this.plataforma = plataforma;
        this.costeFutbol = costeFutbol;
        this.costePelis = costePelis;
        this.costeSeries = costeSeries;
        this.descuentoPersonas = descuentoPersonas;
        this.costePremium = costePremium;
    }


    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public double getCosteFutbol() {
        return costeFutbol;
    }

    public void setCosteFutbol(double costeFutbol) {
        this.costeFutbol = costeFutbol;
    }

    public double getCostePelis() {
        return costePelis;
    }

    public void setCostePelis(double costePelis) {
        this.costePelis = costePelis;
    }

    public double getCosteSeries() {
        return costeSeries;
    }

    public void setCosteSeries(double costeSeries) {
        this.costeSeries = costeSeries;
    }

    public double getDescuentoPersonas() {
        return descuentoPersonas;
    }

    public void setDescuentoPersonas(double descuentoPersonas) {
        this.descuentoPersonas = descuentoPersonas;
    }

    public double getCostePremium() {
        return costePremium;
    }

    public void setCostePremium(double costePremium) {
        this.costePremium = costePremium;
    }

    public boolean isFutbol() {
        return futbol;
    }

    public void setFutbol(boolean futbol) {
        this.futbol = futbol;
    }

    public boolean isPelis() {
        return pelis;
    }

    public void setPelis(boolean pelis) {
        this.pelis = pelis;
    }

    public boolean isSeries() {
        return series;
    }

    public void setSeries(boolean series) {
        this.series = series;
    }

    public double getDescuentoPaquetes() {
        return descuentoPaquetes;
    }

    public void setDescuentoPaquetes(double descuentoPaquetes) {
        this.descuentoPaquetes = descuentoPaquetes;
    }


    //Este se debe mover a la clase POJO
    public double calcularPrecio() {
        double precioFinal = plataforma.getPrecio();
        if (plataforma.isPremium() && plataforma.getCantidadPersonas() > 3) {
            precioFinal = precioFinal - descuentoPersonas + costePremium;
            precioFinal = seleccionarServicio(precioFinal);

        } else if (plataforma.isPremium() && plataforma.getCantidadPersonas() < 3) {
            precioFinal = precioFinal + costePremium;
            System.out.println(costePremium);
            System.out.println(precioFinal);
            precioFinal = seleccionarServicio(precioFinal);
            System.out.println("Precio Final" +precioFinal);
        } else if (!plataforma.isPremium() && plataforma.getCantidadPersonas() > 3) {
            precioFinal = precioFinal - descuentoPersonas;
            precioFinal = seleccionarServicio(precioFinal);
        }


        return precioFinal;
    }


    //Hacer método que se encargue de hacer descuentos.
    //Pequeños mejor que grandes
    public double seleccionarServicio(double precio) {


        if (futbol && series && pelis) {
            descuentoPaquetes = 12;
            System.out.println(precio);
            precio+=costePelis+costeFutbol+costeSeries;
            System.out.println("Paso 1 "+precio);
            precio -= precio *descuentoPaquetes / 100;
            System.out.println("Paso 2 "+precio);

        } else if (series && pelis) {
            descuentoPaquetes = 8;
            precio+=costePelis+costeSeries;
            precio -= precio* descuentoPaquetes / 100;
        } else if (futbol) {
            precio +=costeFutbol;
        } else if (series) {
            precio+=costeSeries;
        } else if (pelis) {
            precio+=costePelis;
        }

        return precio;

    }


}
