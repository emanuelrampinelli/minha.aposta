package com.dash.minha.aposta.repositorys;

import com.dash.minha.aposta.model.BancaRecorte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancaRecorteRepository extends JpaRepository<BancaRecorte,Long> {
}
