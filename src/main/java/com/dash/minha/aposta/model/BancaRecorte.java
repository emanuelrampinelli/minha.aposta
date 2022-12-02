package com.dash.minha.aposta.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BANCA_RECORTE")
public class BancaRecorte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Date dataInicial;

    @Column
    private Date dataFinal;

    @Column(nullable = false)
    private Double valorInicial;

    @Column(nullable = false)
    private Double valorAtual;

    @Column(nullable = false)
    private String status;

    @OneToMany
    private Banca banca;

    @OneToMany
    private Usuario usuario;
}
