package Registraduria.G03.seguridadR.Repositorios;
import Registraduria.G03.seguridadR.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface RepositorioRol extends MongoRepository<Rol,String> {
}
