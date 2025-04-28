package dev.eduardosilva.cadastrodeninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Olá Mundo! Esse é o meu primeiro Projeto Spring Boot!";
    }
}
