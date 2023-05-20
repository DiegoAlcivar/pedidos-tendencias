package pedidos.pedidos.core.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    // Atreibutos: Delimitador de acceso, Tipo de dato, Nombre del atributo
    @Autowired
    private ClienteRepository clienteRepository;

    // Crud

    // Crear
    // Metod: Delimitador de acceso, Tipo de dato, Nombre del metodo/ funcion {
    // instrucciones / sentencias}
    public Cliente save(Cliente entity) {

        return clienteRepository.save(entity);
    }

    // Read
    public Cliente findById(long id) {
        return clienteRepository.findById(id).orElse(null);

    }

    public void deleteById(long id) {
        clienteRepository.deleteById(id);
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

}