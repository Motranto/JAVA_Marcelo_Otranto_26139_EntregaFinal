package com.example.holamundo.controller; // Asegúrate de que coincida con tu "Group" y "Artifact"

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/api/saludo")
    public String decirHola() {
        return "¡Hola Mundo!";
    }
}
