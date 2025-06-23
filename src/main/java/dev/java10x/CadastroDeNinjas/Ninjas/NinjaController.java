package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nesta rota";
    }

    @PostMapping(value = "/newNinja")
    public NinjaModel salvarNinja(@RequestBody NinjaModel ninjaModel){
        return ninjaService.salvar(ninjaModel);
    }


    //Falta implementar o resto do Create, delete e update
    //Testar oo banco de dados
    //Implementar as funcionalidades de Ninja e Missao (relacionamento)
    //Fazer um Front para o projeto em Angular

}
