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

    public boolean delete (Long id){
        Cliente cliente = find(id);

        return clienteSet.remove(cliente);

    }

    public long contarClientesMayores18(){
        int max=18;
        return clienteSet.stream().filter(cliente -> cliente.getEdad()>max).count();
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

}
