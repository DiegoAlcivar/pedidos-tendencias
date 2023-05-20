package pedidos.pedidos.core.compania;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Compania {

    // atributos: Delimitador de acceso, Tipo de dato; Nombre del atributo
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String ruc;
    private String nombre;
    private String direccion;

}
