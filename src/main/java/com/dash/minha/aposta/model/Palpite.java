package com.dash.minha.aposta.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "PALPITE")
public class Palpite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String descricao;

    @OneToMany
    private TipoAposta tipoAposta;

    @OneToOne
    private ResultadoPalpite resultadoPalpite;
}
