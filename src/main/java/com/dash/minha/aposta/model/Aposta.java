package com.dash.minha.aposta.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "APOSTA")
public class Aposta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private Date dataCadastro;
    @Column(nullable = false)
    private Date dataPartida;
    @Column(nullable = false)
    private String status;
    @Column(nullable = false)
    private Double odd;
    @Column(nullable = false)
    private Double valorApostado;
    @Column
    private Double valorFinal;

    @ManyToMany
    private Palpite palpite;
    @OneToOne
    private Partida partida;

}
