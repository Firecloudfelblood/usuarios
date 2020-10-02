package com.erivalaxl.usuarios.controller;

import com.erivalaxl.usuarios.model.Usuarios;
import com.erivalaxl.usuarios.persistence.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLDataException;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuarios>> consultarUsuarios(){
       ResponseEntity<List<Usuarios>> arrow;
        try {
            List<Usuarios> usuarios = usuariosRepository.findAll();
            arrow= new ResponseEntity<List<Usuarios>>(usuarios, HttpStatus.OK);
        }catch(Exception e){
            System.out.println("\n\n\n\n\n error: \n "+e);
            arrow = new ResponseEntity<>(null, HttpStatus.I_AM_A_TEAPOT);
        }
        return arrow;
    }

    @GetMapping("/usuarios/{id}")
    public ResponseEntity<List<Usuarios>> consultaPorId(@PathVariable int id){
        List<Usuarios> usuarios = usuariosRepository.findById(id);
        return new ResponseEntity<List<Usuarios>>(usuarios, HttpStatus.OK);
    }
    @PostMapping("/usuarios/crear")
    public ResponseEntity<Usuarios> crearUsuario(@RequestBody Usuarios usuario){
       // System.out.println(usuario.getApeido());
        Usuarios usuarioCreado = usuariosRepository.save(usuario);
        return new ResponseEntity<Usuarios>(usuarioCreado, HttpStatus.ACCEPTED);
    }

    @DeleteMapping( "/usuarios/borrar/{id}")
    public ResponseEntity<List<Usuarios>> borrarUsuario(@PathVariable Integer id){
        usuariosRepository.deleteById(id);
        return consultarUsuarios();
    }

    @PutMapping("/usuario/actualizar/{id}")
    public ResponseEntity<List<Usuarios>> actualizarUsuario(@PathVariable Integer id, @RequestBody Usuarios usuario){
        System.out.println("Actualizando el usuario id: " + id);
        usuario.setId(id);
        usuariosRepository.save(usuario);

        return consultarUsuarios();
    }
}
