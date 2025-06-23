package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;

    public NinjaModel salvar(NinjaModel ninjaModel){
        return ninjaRepository.save(ninjaModel);
    }

    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    public Optional<NinjaModel> buscarPorId(Long id){
        return ninjaRepository.findById(id);
    }

    public void removerPorId(Long id){
        ninjaRepository.deleteById(id);
    }

}
