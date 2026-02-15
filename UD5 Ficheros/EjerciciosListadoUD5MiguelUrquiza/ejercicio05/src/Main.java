import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;

        try{
            fileWriter= new FileWriter("ticket.txt");
            bufferedWriter = new BufferedWriter(fileWriter);

            int contador=0;
            Producto p = new Alimentacion(10,"Papas",0,2,true);
            Producto p2 = new Electronica(100,"TV",1,false);

            LineaVenta lv = new LineaVenta(p,2);
            LineaVenta lv1 = new LineaVenta(p2,1);

            LineaVenta[]lista = {lv,lv1};

            Venta v = new Venta(lista);

            List<String> listaTicket = v.imprimirTicket(21,10,5,4);


            for(String linea : listaTicket){
                bufferedWriter.write(linea);
                bufferedWriter.newLine();
            }



            v.listarProductos(3);
            bufferedWriter.close();

        }catch(FileNotFoundException ex){

        }catch (IOException e){

        }

    }
}