package ejercicio08;

public class Gestion {

    private Plataforma plataforma;
    private double costeFutbol;
    private double costePelis;
    private double costeSeries;
    


    public double calcularPVP(int numServicio){

    }

    public void seleccionarServicio(int num){

        switch (num){
            case 1:
                costeSeries =10;
                break;

            case 2:
                costeFutbol=20;
                break;

            default:
                break;
        }


    }


}
