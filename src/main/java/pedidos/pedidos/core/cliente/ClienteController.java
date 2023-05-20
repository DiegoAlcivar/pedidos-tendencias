
package pedidos.pedidos.core.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cliente")
@CrossOrigin({ "*" })
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // Crear
    // Decoradores (Anotaciones)
    // Metod: Delimitador de acceso, Tipo de dato, Nombre del metodo/ funcion
    @PostMapping("/")
    public Cliente save(@RequestBody Cliente entity) {
        return clienteService.save(entity);

    }

    @GetMapping("/{id}/")
    public Cliente findById(@PathVariable long id) {
        return clienteService.findById(id);
    }

    @GetMapping("/")
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @PutMapping("/")
    public Cliente update(@RequestBody Cliente entity) {
        return clienteService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id) {
        clienteService.deleteById(id);
    }

}
