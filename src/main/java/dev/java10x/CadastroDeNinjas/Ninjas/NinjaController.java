package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nesta rota";
    }

    //Falta implementar o resto do Create, delete e update
    //Testar oo banco de dados
    //Implementar as funcionalidades de Ninja e Missao (relacionamento)
    //Fazer um Front para o projeto em Angular

}
