package com.dash.minha.aposta.repositorys;

import com.dash.minha.aposta.model.Aposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultadoPalpiteRepository extends JpaRepository<Aposta,Long> {
}
