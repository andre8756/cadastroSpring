package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nesta rota";
    }

    @GetMapping("allNInjas")
    public List<NinjaModel> listarNInjas(){
        return ninjaService.listarNinjas();
    }

    @GetMapping("ninja/{id}")
    public Optional<NinjaModel> buscarPorId(@PathVariable("id") Long id){
        return ninjaService.buscarPorId(id);
    }

    @PostMapping(value = "/newNinja")
    public NinjaModel salvarNinja(@RequestBody NinjaModel ninjaModel){
        return ninjaService.salvar(ninjaModel);
    }

    @DeleteMapping("deleteNinja/{id}")
    public void deleteNinja(@PathVariable("id") Long id){
        ninjaService.buscarPorId(id)
                .map(ninjaModel -> {
                    ninjaService.removerPorId(ninjaModel.getId());
                    return Void.TYPE;
                        }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
    }

    //Falta implementar o resto do Create, delete e update
    //Testar oo banco de dados
    //Implementar as funcionalidades de Ninja e Missao (relacionamento)
    //Fazer um Front para o projeto em Angular

}
