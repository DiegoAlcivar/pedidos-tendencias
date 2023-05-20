package pedidos.pedidos.core.compania;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompaniaService {

    // Atreibutos: Delimitador de acceso, Tipo de dato, Nombre del atributo
    @Autowired
    private CompaniaRepository companiaRepository;

    // Crud

    // Crear
    // Metod: Delimitador de acceso, Tipo de dato, Nombre del metodo/ funcion {
    // instrucciones / sentencias}
    public Compania save(Compania entity) {

        return companiaRepository.save(entity);
    }

    // Read
    public Compania findById(long id) {
        return companiaRepository.findById(id).orElse(null);

    }

    public void deleteById(long id) {
        companiaRepository.deleteById(id);
    }

    public List<Compania> findAll() {
        return companiaRepository.findAll();
    }

}
