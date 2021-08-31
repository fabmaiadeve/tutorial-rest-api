package fabdev.tutorial.rest.api.repository;

import org.springframework.data.repository.CrudRepository;

import fabdev.tutorial.rest.api.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

}
