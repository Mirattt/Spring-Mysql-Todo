package ict.kosovo.growth.kqzpartitepolitike.models.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
//partia_politike
@Table(name = "partia_politike")
@Data
public class PartiaPolitike {

    @Id
    @Column(length=10)
    private  String id;
    @Column(length =200, unique = true)
    private String emri;
    private String llojiPartise;
    private LocalDate dataERegjistrimi;
    private boolean aktive;
    private String kryetariPartise;
    private String logoUrl;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "antari_id",referencedColumnName = "id")
    private List<Antari> antaret;

    public PartiaPolitike() {
    }

    public PartiaPolitike(String id, String emri, String llojiPartise, LocalDate dataERegjistrimi, boolean aktive, String kryetariPartise, String logoUrl) {
        this.id = id;
        this.emri = emri;
        this.llojiPartise = llojiPartise;
        this.dataERegjistrimi = dataERegjistrimi;
        this.aktive = aktive;
        this.kryetariPartise = kryetariPartise;
        this.logoUrl = logoUrl;
    }
}

