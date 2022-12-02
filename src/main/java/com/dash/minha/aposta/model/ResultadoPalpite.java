package com.dash.minha.aposta.model;
import javax.persistence.*;

@Entity
@Table(name = "RESULTADO_PALPILTE")
public class ResultadoPalpite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private int isGreen;
}
