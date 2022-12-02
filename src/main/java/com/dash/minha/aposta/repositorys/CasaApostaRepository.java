package com.dash.minha.aposta.repositorys;
import com.dash.minha.aposta.model.CasaAposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasaApostaRepository extends JpaRepository<CasaAposta,Long> {
}
