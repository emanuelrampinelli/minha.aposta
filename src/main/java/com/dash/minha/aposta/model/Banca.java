package com.dash.minha.aposta.model;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "BANCA")
public class Banca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Double valor;

    @OneToMany
    private CasaAposta casaAposta;

}
