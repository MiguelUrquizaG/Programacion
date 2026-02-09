import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String texto="";
        Scanner sc = new Scanner(System.in);
        String nombre;

        try{

            FileWriter flS = new FileWriter("Agenda.txt");
            BufferedWriter fS = new BufferedWriter(flS);
            do {
                System.out.println("Introduce el nombre");
                nombre = sc.nextLine();
                if (nombre.length() > 0) {
                    System.out.println("Teléfono");
                    String telefono = sc.nextLine();
                    fS.write(nombre + "," + telefono);
                    fS.newLine();
                }
                fS.close();
            } while (nombre.length() > 0);

            FileReader flE= new FileReader("Agenda.txt");
            BufferedReader fE = new BufferedReader(flE);
            while(texto!=null){
                texto=fE.readLine();
                if (texto != null) {
                    int posi = texto.indexOf(",");
                    String nombre2= texto.substring(0,posi);
                    String telefono = texto.substring(posi+1);
                    System.out.print("Nombre: "+nombre2);
                    System.out.println(" Teléfono: "+telefono);

                }
            }
            flE.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            System.out.println("Error");
        }

    }
}