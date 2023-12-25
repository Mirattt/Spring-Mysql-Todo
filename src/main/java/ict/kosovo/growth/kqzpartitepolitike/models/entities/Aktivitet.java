package ict.kosovo.growth.kqzpartitepolitike.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Aktivitet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String emri;
    private String pershkrimin;
    private LocalDate data;
    private LocalDateTime fillonMe;
    private LocalDate mbarenMe;
    private String lokacioni;
}
