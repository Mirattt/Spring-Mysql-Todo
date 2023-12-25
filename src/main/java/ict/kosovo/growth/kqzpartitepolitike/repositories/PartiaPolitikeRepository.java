package ict.kosovo.growth.kqzpartitepolitike.repositories;

import ict.kosovo.growth.kqzpartitepolitike.models.entities.PartiaPolitike;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//CRUD operations
@Repository
 public interface PartiaPolitikeRepository extends JpaRepository<PartiaPolitike,String> {



 }

