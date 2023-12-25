package ict.kosovo.growth.kqzpartitepolitike.repositories;

import ict.kosovo.growth.kqzpartitepolitike.models.entities.Aktivitet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AktivitetiRepository extends JpaRepository<Aktivitet,Integer> {


}
