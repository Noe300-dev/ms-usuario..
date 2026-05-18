package com.example.ms_usuario.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ms_usuario.Model.Usuario;
import java.util.List;


public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    List<Usuario> findByActivo(boolean activo);
    Usuario findByCorreo(String correo);
    List<Usuario> findByUsuario(String usuario);
    
}
