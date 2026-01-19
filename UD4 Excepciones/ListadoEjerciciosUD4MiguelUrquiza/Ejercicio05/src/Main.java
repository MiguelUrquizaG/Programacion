import Errors.*;
import models.CuentaBancaria;
import models.Producto;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       /* Logica logica =  new Logica();
        int numAleatorio;
        try {
            numAleatorio = logica.lanzarAleatorio(10);
        }catch (AleatorioException e){
            System.out.println(e.getMessage());
        }catch(RuntimeException e){
            System.out.println("Error en la ejecución del programa.");
        }*/

        Producto p = new Producto(1);
        Producto p2 = new Producto(2);

        List<Producto>list =  List.of(p,p2);

        Logica logica1 = new Logica(list);

        try{
            logica1.setearId(3,p2);
        } catch (IdRepetidoException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Error en la ejecución del programa.");
        }

        try{
            logica1.comprobarNumero(2);
        }catch (OddNumberException ex){
            System.out.println(ex.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Error en la ejecución del programa.");
        }

        CuentaBancaria cuentaBancaria =  new CuentaBancaria(200);

        try{
            logica1.pedirBizum(201,cuentaBancaria);
        } catch (DineroInsuficienteException e) {
            System.out.println(e.getMessage());
        }catch (RuntimeException ex){
            System.out.println("Error en la ejecución del programa");
        }


        List<String>lista = List.of("Miguel","Coche");

        try{
            logica1.comprobarPalabra(lista,"paco");
        } catch (LetraNoValidaException e) {
            System.out.println(e.getMessage());
        }catch (RuntimeException ex){
            System.out.println("Error en la ejecución del programa");
        }


        try{
            logica1.agregarDinero(cuentaBancaria,500);
        } catch (DineroMaximoException e) {
            System.out.println(e.getMessage());
        }catch (RuntimeException ex){
            System.out.println("Error en la ejecución del programa");
        }


    }
}