package com.example.ges_ecole;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "L'application GesEcole est correctement deployee via GitHub Actions !";
    }
}