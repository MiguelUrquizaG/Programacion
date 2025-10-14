package ejercicio11;

public class Empleado {

    private double valorHora;
    private int anyosExperiencia;
    private int horasSemanales;

    public Empleado(double valorHora,  int anyosExperiencia, int horasSemanales) {
        this.valorHora = valorHora;
        this.anyosExperiencia = anyosExperiencia;
        this.horasSemanales = horasSemanales;

    }


    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "valorHora=" + valorHora +
                ", anyosExperiencia=" + anyosExperiencia +
                ", horasSemanales=" + horasSemanales +
                '}';
    }


    public double calcularSueldo(){
        double sueldo;
        double pagoExperienca3=50;
        double pagoExperienca5=125;
        int semanasMes=4;
        if(anyosExperiencia>2 && anyosExperiencia<5){
            sueldo = (valorHora*horasSemanales*semanasMes)+ pagoExperienca3;
        } else if (anyosExperiencia>5) {
            sueldo = (valorHora*horasSemanales*semanasMes)+ pagoExperienca5;
        } else{
            sueldo = valorHora*horasSemanales*semanasMes;
        }
        return sueldo;
    }
}
