package ict.kosovo.growth.kqzpartitepolitike.repositories;

import ict.kosovo.growth.kqzpartitepolitike.models.entities.Antari;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AntariRepository extends JpaRepository<Antari,Integer> {



}
