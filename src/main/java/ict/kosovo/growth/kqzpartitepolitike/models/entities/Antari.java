package ict.kosovo.growth.kqzpartitepolitike.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor

public class Antari {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   @Column(length = 10,unique = true)
   private String numriPersonal;
   @Column(length = 50)
   private String name;
   @Column(length = 50)
   private String surname;
   private LocalDate datelindja;
   private char gender;

   @ManyToOne
   @JoinColumn(name = "antari_id")
   public PartiaPolitike partia;
}
