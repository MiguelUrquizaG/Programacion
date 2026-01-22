public class CEcuacion2Grado {
    public CEcuacion2Grado() {
    }

    public double calcularEcuacion(double a,double b, double c) throws EcuacionException{

        double resultado=0;
        double discriminante=0;

        discriminante = Math.abs(Math.pow(b,2)-4*a*c);

        if(a==0 && b==0){
            throw new EcuacionException("La ecuación es degenerada ya que tanto a como b son 0.");
        } else if (discriminante <0) {
            throw new EcuacionException("No se puede tener un discriminante menor que cero.");
        }


        resultado = (-b + Math.sqrt(discriminante))/2*a;

        return resultado;

    }
}
