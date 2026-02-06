import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        String nombre;

        //Esto es como enganchar el tubo a la fuente de datos.
        //SOn clases que de dedican a escribir en ficheros:
        //PRintWriter es mejor generalmete y FilWriter es más básico.
        //Es muy habitual usar comas en ficheros.

        try {
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
        } catch (IOException e) {
            System.out.println();
        }
    }
}