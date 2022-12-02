package com.dash.minha.aposta.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "TIPO_APOSTA")
public class TipoAposta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;
}
