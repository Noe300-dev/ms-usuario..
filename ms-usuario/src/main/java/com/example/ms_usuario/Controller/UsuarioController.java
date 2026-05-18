package com.example.ms_usuario.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_usuario.Model.Usuario;
import com.example.ms_usuario.Service.UsuarioService;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService serv;

    @GetMapping
    public List <Usuario> listar(){
        return serv.listarUsuarios();
    }
    @PostMapping
    public Usuario guardar(@RequestBody Usuario usu){
        return serv.registrarUsuario(usu);
    }
    @PutMapping
    public Usuario actualizar(@PathVariable Long id, @RequestBody Usuario usu){
        return serv.actualizarUsuario(usu);
    }

}
