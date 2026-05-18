package com.example.ms_usuario.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_usuario.Model.Usuario;
import com.example.ms_usuario.Repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repo;

    public List<Usuario> listarUsuarios(){
        return repo.findAll();
    }

    public Usuario registrarUsuario(Usuario usu){
        return repo.save(usu);
    }
    
    public Usuario actualizarUsuario(Usuario usu){
        return repo.save(usu);
    }
    public Usuario buscarUsuario(Long id){
        return repo.findById(id).get();
    }
    public Usuario actualizarUsuario(Long id, Usuario usuario){
        Usuario user = repo.findById(id).get();
        user.setUsuario(usuario.getUsuario());
        user.setCorreo(usuario.getCorreo());
        user.setActivo(usuario.isActivo());

        return repo.save(user);
    }
    public String eliminarUsuario(Long id){
        repo.deleteById(id);

        return "Usuario eliminado";
    }
    public List <Usuario>buscarActivo(boolean activo){
        return repo.findByActivo(activo);
    }
    public Usuario buscarPorCorreo(String correo) {
       return repo.findByCorreo(correo);
    }
    public List<Usuario> buscarPorUsuario(String usuario) {
        return repo.findByUsuario(usuario);
}

}
