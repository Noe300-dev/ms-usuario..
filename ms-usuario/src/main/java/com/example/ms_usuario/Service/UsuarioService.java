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

}
