package com.labprog.prova;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class OperacaoController {

    @GetMapping("/quadrado/{n}")
    public HashMap<String, Integer> getSquare(
        @PathVariable("n") Integer n

    ) {
        HashMap<String, Integer> response = new HashMap<>();
        response.put("Numero", n);
        response.put("Quadrado", n*n);
        return response;
    } 
    
}