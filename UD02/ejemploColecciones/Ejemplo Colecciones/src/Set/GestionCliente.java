package Set;

import java.util.HashSet;
import java.util.Set;

public class GestionCliente {

    Set<Cliente> clienteSet = new HashSet<>();

    public GestionCliente(Set<Cliente> clienteSet) {
        this.clienteSet = clienteSet;
    }

    public void save (Cliente cliente){
        clienteSet.add(cliente);

    }

    public Cliente find(Long id){

        for(Cliente c : clienteSet){
            if(c.getId() == id){
                return c;
            }
        }

        return null;

    }

    public void edit(Cliente c,Long id){
        Cliente clienteBase = find(id);

        clienteBase.setNombre(c.getNombre());
        clienteBase.setEdad(c.getEdad());
    }

    public boolean delete (Long id){
        Cliente cliente = find(id);

        return clienteSet.remove(cliente);

    }

    public int agarrarPapeleta(Cliente cliente){
        int numAleatorio=-1;
        int max =10;
        int min =0;
        if(!clienteSet.contains(cliente)){
            numAleatorio =(int)(Math.random()*11);
            save(cliente);
        }
        return numAleatorio;
    }

    public Set<Cliente> comprobarSiContieneLetra (String letra){

        Set<Cliente>resp=new HashSet<>();

        clienteSet.forEach(cliente -> {
            if(cliente.getNombre().toLowerCase().contains(letra.toLowerCase())){
                resp.add(cliente);
            }
        });

        return resp;

    }

    public boolean calcularGanador(Cliente cliente){
        int  numGanador = 1;
        boolean isGanador=false;

        int numPapeleta = agarrarPapeleta(cliente);

        if(numPapeleta == numGanador){
            isGanador=true;
        }
        System.out.println("Num Papeleta: " + numPapeleta);
        System.out.println("Num Ganador: " + numGanador);
        return isGanador;
    }

}
