import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConvertidorTemperatura convertidorTemperatura = new ConvertidorTemperatura();
        boolean valido =false;
        double valor=0;
        double grados = 0;

        while(!valido){
            System.out.println("Introduzca una temperatura");
            grados = sc.nextInt();
            try{
                valor = convertidorTemperatura.convertidor(grados);
                valido = true;
            }catch (TemperaturaInferiorException ex){
                System.out.println(ex.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Error en tiempo de ejecución.");
            }catch (Exception e){
                System.out.println("Error en el programa.");
            }


        }

        System.out.println(valor);


    }
}