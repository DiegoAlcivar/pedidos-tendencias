package pedidos.pedidos.core.compania;

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
@RequestMapping("api/compania")
@CrossOrigin({ "*" })
public class CompaniaController {

    @Autowired
    private CompaniaService companiaService;

    // Crear
    // Decoradores (Anotaciones)
    // Metod: Delimitador de acceso, Tipo de dato, Nombre del metodo/ funcion
    @PostMapping("/")
    public Compania save(@RequestBody Compania entity) {
        return companiaService.save(entity);

    }

    @GetMapping("/{id}/")
    public Compania findById(@PathVariable long id) {
        return companiaService.findById(id);
    }

    @GetMapping("/")
    public List<Compania> findAll() {
        return companiaService.findAll();
    }

    @PutMapping("/")
    public Compania update(@RequestBody Compania entity) {
        return companiaService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id) {
        companiaService.deleteById(id);
    }

}
