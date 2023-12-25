package ict.kosovo.growth.kqzpartitepolitike.services;

import ict.kosovo.growth.kqzpartitepolitike.models.entities.Antari;
import ict.kosovo.growth.kqzpartitepolitike.repositories.AntariRepository;
import ict.kosovo.growth.kqzpartitepolitike.services.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AntariService extends AbstractService<Antari,Integer> {
    protected AntariService(AntariRepository repository) {
        super(repository);
    }
}
