import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PrintWriter writer=null;

        try{
            writer = new PrintWriter("fichero.txt");
            writer.println("1.Run");
            writer.println("2.HYYH");
            writer.println("3.Young Forever");
            writer.println("4.Save me");

        }catch (FileNotFoundException e){
            System.out.println("No se ha encontrado el fichero.");
        }finally {
            if(writer!=null){
                writer.close();
            }
        }


    }
}