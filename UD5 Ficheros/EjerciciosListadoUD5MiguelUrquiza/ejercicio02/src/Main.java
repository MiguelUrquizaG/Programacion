import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("fichero.txt");
            writer.println("Hola esto es una prueba");
            writer.println("Esta es la segunda línea.");

            writer.close();

            BufferedReader br = new BufferedReader(new FileReader("fichero.txt"));

            String linea=null;

            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }

        }catch (FileNotFoundException e){
            System.out.println("No se ha encontrado el fichero.");
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}