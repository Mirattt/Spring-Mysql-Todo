package ict.kosovo.growth.kqzpartitepolitike.services;

import ict.kosovo.growth.kqzpartitepolitike.models.entities.Aktivitet;
import ict.kosovo.growth.kqzpartitepolitike.repositories.AktivitetiRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AktivitiService extends AbstractService<Aktivitet,Integer> {

    protected AktivitiService(AktivitetiRepository repository) {
        super(repository);
    }
}
