package com.dash.minha.aposta.repositorys;

import com.dash.minha.aposta.model.Palpite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalpiteRepository extends JpaRepository<Palpite,Long> {
}
