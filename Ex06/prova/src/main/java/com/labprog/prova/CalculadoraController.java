package com.labprog.prova;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/soma")
    public String getSoma(
        @RequestParam Integer a, 
        @RequestParam Integer b

    ) {
        Integer res = a + b;
        return "Resultado: " + res;
    } 
    
}