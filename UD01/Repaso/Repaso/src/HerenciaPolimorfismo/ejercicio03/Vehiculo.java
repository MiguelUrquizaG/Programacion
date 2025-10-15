package HerenciaPolimorfismo.ejercicio03;

public class Vehiculo {
    private int tipoEmision;

    public Vehiculo(int tipoEmision) {
        this.tipoEmision = tipoEmision;
    }

    public int getTipoEmision() {
        return tipoEmision;
    }

    public void setTipoEmision(int tipoEmision) {
        this.tipoEmision = tipoEmision;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipoEmision=" + tipoEmision +
                '}';
    }

    public double calcularImpuesto(){
        double impuestoBase=0;
        if(tipoEmision ==0){
            impuestoBase =0;
        } else if (tipoEmision==1) {
            impuestoBase=50;
        } else if (tipoEmision==2) {
            impuestoBase=100;
        } else if (tipoEmision==3) {
            impuestoBase=200;
        }

        return impuestoBase;
    }
}
