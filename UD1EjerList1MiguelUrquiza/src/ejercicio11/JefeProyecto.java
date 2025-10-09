package ejercicio11;

public class JefeProyecto extends Empleado{

    private boolean objetivo;
    private double valorObjetivo;

    public JefeProyecto(double valorHora,  int anyosExperiencia, int horasSemanales,  boolean objetivo, double valorObjetivo) {
        super(valorHora,  anyosExperiencia, horasSemanales);
        this.objetivo = objetivo;
        this.valorObjetivo = valorObjetivo;
    }

    public boolean isObjetivo() {
        return objetivo;
    }

    public void setObjetivo(boolean objetivo) {
        this.objetivo = objetivo;
    }

    public double getValorObjetivo() {
        return valorObjetivo;
    }

    public void setValorObjetivo(double valorObjetivo) {
        this.valorObjetivo = valorObjetivo;
    }

    @Override
    public String toString() {
        return "JefeProyecto{" +
                "objetivo=" + objetivo +
                ", valorObjetivo=" + valorObjetivo +
                '}';
    }

    @Override
    public double calcularSueldo() {
        double sueldo = super.calcularSueldo();
        if(objetivo){
            sueldo += valorObjetivo;
        }
        return sueldo;
    }


}
