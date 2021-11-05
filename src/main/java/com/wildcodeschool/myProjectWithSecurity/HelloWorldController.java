package com.wildcodeschool.myProjectWithSecurity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String hello(){
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String avenger(){
        return "Avengers... Assemble";
    }
    @GetMapping("/secret-bases")
    public String director(){
        return "Biaritz, Bordeaux, La Loupe, Lille, Lyon, Marseille, Nantes, Orléans, Paris, Reims," +
                "Strasbourg, Toulouse, Tours";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin!!!";
    }

}
