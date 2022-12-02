package com.dash.minha.aposta.repositorys;

import com.dash.minha.aposta.model.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Long> {
}
