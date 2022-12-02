package com.dash.minha.aposta.model;

import javax.persistence.*;


@Entity
@Table(name = "CASA_APOSTA")
public class CasaAposta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;
}
