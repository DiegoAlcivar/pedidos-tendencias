package pedidos.pedidos.core.cliente;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

    List<Cliente> findAll();

}