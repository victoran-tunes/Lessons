package antunes.victor.rainbowsix.controller;

import antunes.victor.rainbowsix.model.PersonagemEntity;
import antunes.victor.rainbowsix.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personagem")
public class PersonagemController {//classe controladora
    @Autowired
    private PersonagemRepository personagemRepository;

    @GetMapping
    public ResponseEntity<List<PersonagemEntity>> findAll(){ //GET
        return new ResponseEntity<List<PersonagemEntity>>(
                (List<PersonagemEntity>)this.personagemRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);

    }


    //GET
    @GetMapping(path = "/{id}")
    public ResponseEntity<PersonagemEntity>findById(@PathVariable ("id")long id) {
        if (this.personagemRepository.findById(id).isPresent()) {
            return new ResponseEntity<PersonagemEntity>(
                    this.personagemRepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);
        }
        return new ResponseEntity<PersonagemEntity>(HttpStatus.NOT_FOUND);
    }

    //POST
    @PostMapping
    public ResponseEntity<PersonagemEntity> register (@RequestBody PersonagemEntity personagemEntity){
        return new ResponseEntity<PersonagemEntity>(
                this.personagemRepository.save(personagemEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }
    //PUT
    @PutMapping(value = "/{id}")
    public ResponseEntity<PersonagemEntity> update (@PathVariable("id")long id,
                                                       @RequestBody PersonagemEntity personagemEntity)throws Exception{
        if(id== 0 || !this.personagemRepository.existsById(id)){ //op. Lógicos
            throw new Exception("Código não encontrado ou inexistente");
        }
        return new ResponseEntity<PersonagemEntity>(
                this.personagemRepository.save(personagemEntity),
                new HttpHeaders(),
                HttpStatus.OK);

    }


    //DELETE
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<PersonagemEntity> delete (@PathVariable("id") long id ){
        this.personagemRepository.deleteById(id);
        return new ResponseEntity<PersonagemEntity>
                (new HttpHeaders(),
                        HttpStatus.OK);
    }

}

