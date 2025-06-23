package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;

    public NinjaModel salvar(NinjaModel ninjaModel){
        return ninjaRepository.save(ninjaModel);
    }

}
