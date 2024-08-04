package dio.web_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web_api.handler.CampoObrigatorioException;
import dio.web_api.model.Usuario;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getLogin()==null)
            throw new CampoObrigatorioException("login");
        if(usuario.getPassword()==null)
            throw new CampoObrigatorioException("password");
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebemos o usuario na camada de repositorio");
        else
            System.out.println("UPDATE - Recebemos o usuario na camada de repositorio");

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebemos o id: %d para Excluir um usuario", id));
        System.err.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("andersondlz", "password"));
        usuarios.add(new Usuario("vanessakdlz", "password"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebemos o id: %d para localizar um usuario ", id));
        return new Usuario("andersondlz","password");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebemos o username:  %s para localizar um usuario  ", username));
        return new Usuario("andersondlz","password");
    }
}
