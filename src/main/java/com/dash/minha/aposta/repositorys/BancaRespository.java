package com.dash.minha.aposta.repositorys;

import com.dash.minha.aposta.model.Banca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancaRespository extends JpaRepository<Banca,Long> {
}
