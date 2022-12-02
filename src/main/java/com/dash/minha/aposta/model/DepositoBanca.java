package com.dash.minha.aposta.model;

import lombok.Data;
import org.joda.time.DateTime;
import javax.persistence.*;

@Entity
@Table(name = "DEPOSITO_BANCA")
public class DepositoBanca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private DateTime data;

    @OneToMany
    private Banca banca;
}
