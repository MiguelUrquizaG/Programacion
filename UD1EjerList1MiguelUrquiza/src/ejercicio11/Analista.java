package ejercicio11;

public class Analista extends Empleado{

    private double bonusProyecto;

    public Analista(double valorHora,  int anyosExperiencia, int horasSemanales,  double bonusProyecto) {
        super(valorHora,  anyosExperiencia, horasSemanales);
        this.bonusProyecto = bonusProyecto;
    }

    public double getBonusProyecto() {
        return bonusProyecto;
    }

    public void setBonusProyecto(double bonusProyecto) {
        this.bonusProyecto = bonusProyecto;
    }

    @Override
    public String toString() {
        return "Analista{" +
                "bonusProyecto=" + bonusProyecto +
                '}';
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo()*bonusProyecto;
    }
}
