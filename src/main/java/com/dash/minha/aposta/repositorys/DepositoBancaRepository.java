package com.dash.minha.aposta.repositorys;

import com.dash.minha.aposta.model.DepositoBanca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositoBancaRepository extends JpaRepository<DepositoBanca,Long> {
}
