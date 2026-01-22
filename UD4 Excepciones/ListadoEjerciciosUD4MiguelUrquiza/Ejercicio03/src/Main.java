//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        CEcuacion2Grado cEcuacion2Grado =  new CEcuacion2Grado();
        double resultado =0;
        try{
           resultado = cEcuacion2Grado.calcularEcuacion(4,5,12);
        }catch (EcuacionException e){
            System.err.println(e.getMessage());
        }

        System.out.println(resultado);


    }
}