package antunes.victor.rainbowsix.repository;

import antunes.victor.rainbowsix.model.PersonagemEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends
        CrudRepository<PersonagemEntity, Long> {

}


