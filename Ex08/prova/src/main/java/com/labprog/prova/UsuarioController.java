package com.labprog.prova;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    @PostMapping("/usuarios")
    public Map<String, String> addNewUser(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        Map<String, String> response = new HashMap<>();
        response.put("status", "Ok");
        response.put("mensagem", "Usuário " + usuario.getNome() + " cadastrado com sucesso!");
        return response;
    }
}