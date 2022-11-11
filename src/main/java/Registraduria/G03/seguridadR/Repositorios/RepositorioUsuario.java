package Registraduria.G03.seguridadR.Repositorios;
import Registraduria.G03.seguridadR.Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
}
