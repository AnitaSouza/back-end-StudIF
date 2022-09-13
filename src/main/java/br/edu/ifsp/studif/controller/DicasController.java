package br.edu.ifsp.studif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.studif.model.Dicas;
import br.edu.ifsp.studif.repository.DicasRepository;


@RestController
@CrossOrigin
public class DicasController {
    @GetMapping("/dicas")
    public List<Dicas> listaTodosDicas() {
        return DicasRepository.all();
    }

    @GetMapping("/dicas/{id}")
    public Dicas recuperarDicasById(@PathVariable("id") int idDicas) {
        return DicasRepository.getById(idDicas);
    }

    @PostMapping("/dicas")
    public void addDicas(
            @RequestBody Dicas dicas) {
        DicasRepository.add(dicas);
    }
    
    @DeleteMapping("/dicas/{id}") 
    public boolean deleteDicas(@PathVariable("id") int id){
        DicasRepository.deleteById(id);
        return true;
    }
}
