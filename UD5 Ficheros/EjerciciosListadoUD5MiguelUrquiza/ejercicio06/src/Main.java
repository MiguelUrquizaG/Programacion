import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FileReader fileReader;
        BufferedReader bufferedReader;
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        int contadorEscrito=0,contadorLeido=0;

        try{
             fileReader= new FileReader("lectura.txt");
             bufferedReader = new BufferedReader(fileReader);

             fileWriter = new FileWriter("resultado.txt");
             bufferedWriter = new BufferedWriter(fileWriter);


             String texto = "";

             while(texto!=null){
                 texto = bufferedReader.readLine();
                 contadorLeido++;
                 if (texto!=null){

                     String primerPalabra = texto.substring(0,1);

                     if (primerPalabra.equalsIgnoreCase("$")){
                         bufferedWriter.write(texto);
                         bufferedWriter.newLine();
                         contadorEscrito++;
                     }


                 }
             }

             bufferedWriter.close();
            System.out.println("Número de líneas escritas: "+contadorEscrito);
            System.out.println("Número de líneas leídas: "+contadorLeido);


        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }


    }
}