package HerenciaPolimorfismo.ejercicio06;

public class CuentaCorriente extends Cuenta{
    private double mantenimientoFijo;
    private int puntos;

    public CuentaCorriente(double saldo, double mantenimientoFijo, int puntos) {
        super(saldo);
        this.mantenimientoFijo = mantenimientoFijo;
        this.puntos = puntos;
    }

    public double getMantenimientoFijo() {
        return mantenimientoFijo;
    }

    public void setMantenimientoFijo(double mantenimientoFijo) {
        this.mantenimientoFijo = mantenimientoFijo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "mantenimientoFijo=" + mantenimientoFijo +
                ", puntos=" + puntos +
                "} " + super.toString();
    }

    @Override
    public boolean retirarDinero(double cantidad) {
        boolean isDone=false;

        if (cantidad<=getSaldo()){
            setSaldo(getSaldo()-cantidad);
            isDone=true;
            puntos++;
        }


        return isDone;
    }

    @Override
    public boolean agregarDinero(double cantidad) {
        boolean isDone=false;

        if(cantidad>0){
            setSaldo(getSaldo()+cantidad);
            isDone=true;
            puntos++;
        }

        return isDone;
    }
}
