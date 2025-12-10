package com.example.WebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greeting() {
        return "Hello, World!";
    }

    @GetMapping("/thais")
    public String greetingThais() {
        return "Hello, Thais!";
    }
    
    @RequestMapping("/teste")
    public @ResponseBody String helloTeste() {
        return "Endpoint funcionando!";
    }

}
