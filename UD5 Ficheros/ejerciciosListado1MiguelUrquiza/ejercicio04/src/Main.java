import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PrintWriter writer =null;
        Scanner sc = new Scanner(System.in);
        try{

            writer = new PrintWriter(new FileOutputStream(new File("fichero.txt"),true));

            String numero =null;
            System.out.println("Introduzca el número a comprobar si es capicúa.");
            numero = sc.nextLine();

            boolean isValido = true;
            for(int i=0;i<numero.length() && isValido;i++){
                int max = numero.length();
                if(numero.toCharArray()[i]!=numero.toCharArray()[max-(1+i)]){
                    isValido =false;
                }
            }

            if(isValido){
                writer.println(numero+"\n");
            }

        }catch (FileNotFoundException e){
            System.out.println("No se ha encontrado el fichero.");
        }finally {
            writer.close();
        }



    }
}