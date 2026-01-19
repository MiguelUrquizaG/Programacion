import Errors.*;
import models.CuentaBancaria;
import models.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Logica {

    private List<Integer> aleatorioAnterior;
    private List<Producto>productoList;

    public Logica(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public Logica() {
    }

    public int lanzarAleatorio(int max) throws AleatorioException {
        aleatorioAnterior.add(3);
        Random random = new Random();
        int numero;
        numero = random.nextInt(max);
        System.out.println(numero);
        for(Integer a : aleatorioAnterior){
            if(numero == a){
                throw new AleatorioException("Se ha repetido el aleatorio");
            }
        }
        aleatorioAnterior.add(numero);


        return numero;
    }

    public void setearId(int id,Producto producto)throws IdRepetidoException {

        for (Producto p : productoList){
            if(id == p.getId()){
                throw new IdRepetidoException("Ya existe un producto con ese id.");
            }
        }

        producto.setId(id);


    }

    public void comprobarNumero(int numero) throws OddNumberException {

        if(numero%2!=0){
            throw new OddNumberException("Número impar");
        }

    }

    public void pedirBizum(double cantidad, CuentaBancaria cuentaBancaria) throws DineroInsuficienteException {

        if(cuentaBancaria.getSaldo()<cantidad){
            throw new DineroInsuficienteException("No se puede enviar Bizum dinero insuficiente");
        }

    }

    public void comprobarPalabra(List<String>stringList,String palabraBuscada) throws LetraNoValidaException {

        for (String palabra : stringList){
            if(palabra.equalsIgnoreCase(palabraBuscada)){
                throw new LetraNoValidaException("Ya existe esa palabra");
            }
        }

    }

    public void agregarDinero(CuentaBancaria cuentaBancaria,double cantiDinero)throws DineroMaximoException{
        if(cantiDinero > 500){
            throw new DineroMaximoException("No se puede hacer un bizum mayor a 500€");
        }

        cuentaBancaria.setSaldo(cuentaBancaria.getSaldo()+cantiDinero);
    }

}
