import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try{
            FileReader flE = new FileReader("Origen.txt");
            BufferedReader fE = new BufferedReader(flE);
            FileWriter flS = new FileWriter("Destino.txt");
            BufferedWriter fS = new BufferedWriter(flS);

            String texto ="";

            while(texto!=null){
                texto=fE.readLine();
                if(texto!=null){
                    fS.write(texto);
                    fS.newLine();
                }
            }

            System.out.println("Copiado Origen en destino");
            fS.close(); //AQUI NO SE PONEN LOS CIERRES

        }catch (IOException e){

        }

    }
}