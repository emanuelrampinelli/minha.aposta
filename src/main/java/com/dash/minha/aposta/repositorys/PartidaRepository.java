package com.dash.minha.aposta.repositorys;

import com.dash.minha.aposta.model.Partida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidaRepository extends JpaRepository<Partida,Long> {
}
