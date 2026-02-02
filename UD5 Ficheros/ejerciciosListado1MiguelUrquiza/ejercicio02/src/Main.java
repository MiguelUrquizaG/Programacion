import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            FileWriter file = new FileWriter("fichero.txt");
            file.write("Hola esto es una prueba\n");
            file.write("Linea 2: Prueba\n");
            file.write("Linea 3: HYYH\n");
            file.write("Linea 4: Run\n");
            file.close();
            FileReader fileReader = new FileReader("fichero.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while((linea = bufferedReader.readLine())!=null){
                System.out.println(linea);
            }

        }catch (IOException e){
            System.out.println("Hubo un problema");
        }



    }
}