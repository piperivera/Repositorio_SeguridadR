package Registraduria.G03.seguridadR.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import Registraduria.G03.seguridadR.Modelos.PermisosRoles;


public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String> {
}