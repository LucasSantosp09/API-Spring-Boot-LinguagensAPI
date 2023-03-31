package br.com.alura.linguagens.api;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class LinguagemController {
    
    private List<Linguagem> linguagens =
        List.of(
            new Linguagem("Java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 1),            
            new Linguagem("PHP", "https://github.com/abrahamcalf/programming-languages-logos/blob/master/src/php/php_256x256.png?raw=true", 2)
            
            );

    @GetMapping(value="/linguagem-preferida")
    public String processaLinguagemPreferida() {
        return   "Oi, Java !";
    }
    
    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens(){
        return linguagens;
    }
  
}
