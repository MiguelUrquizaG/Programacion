import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nombre,carrera;
        int posicion,tiempo;
        Scanner sc = new Scanner(System.in);

        try{
            FileWriter fileWriter = new FileWriter("America's cup");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            System.out.print("Posición: ");
            posicion = Integer.parseInt(sc.nextLine());
            System.out.print("Tiempo: ");
            tiempo = Integer.parseInt(sc.nextLine());
            System.out.println("Carrera: ");
            carrera = sc.nextLine();

            bufferedWriter.write(nombre+" - "+posicion+" - "+tiempo+" - "+carrera);
            bufferedWriter.close();

        }catch (IOException e){

        }
    }
}