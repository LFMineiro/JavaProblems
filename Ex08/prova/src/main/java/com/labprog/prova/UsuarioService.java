package com.labprog.prova;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    private final List<Usuario> listaDeUsuarios = new ArrayList<>();

     public Usuario cadastrar(Usuario novoUsuario) {
        listaDeUsuarios.add(novoUsuario);
        System.out.println("Usuário cadastrado: " + novoUsuario.getNome());
        System.out.println("Total de usuários na lista: " + listaDeUsuarios.size());
        return novoUsuario;
    }

}
