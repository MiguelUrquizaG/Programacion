import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PrintWriter writer=null;
        try{
            writer = new PrintWriter("fichero.txt");
            writer.println("Hola esto es una prueba");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            if(writer!=null){
                writer.close();
            }
        }


    }
}