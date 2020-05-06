package antunes.victor.rainbowsix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping("/")
public String index () { return "Seja bem vindo ao Projeto de BD de Rainbow Six";}
}
