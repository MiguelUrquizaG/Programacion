import java.util.HashSet;
import java.util.Set;

public class GestionCliente {

    Set<Cliente> clienteSet = new HashSet<>();


    public Cliente save (Cliente cliente){
        clienteSet.add(cliente);

        return cliente;
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


}
