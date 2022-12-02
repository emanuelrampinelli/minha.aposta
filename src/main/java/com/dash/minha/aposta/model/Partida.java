package com.dash.minha.aposta.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RESULTADO_PALPILTE")
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Equipe equipeA;

    @ManyToOne
    private Equipe equipeB;

    @Column(nullable = false)
    private Date data;
}
