package Registraduria.G03.seguridadR.Repositorios;
import Registraduria.G03.seguridadR.Modelos.Permiso;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioPermiso extends MongoRepository<Permiso,String> {
}
