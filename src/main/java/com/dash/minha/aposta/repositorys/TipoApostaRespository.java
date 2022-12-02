package com.dash.minha.aposta.repositorys;

import com.dash.minha.aposta.model.TipoAposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoApostaRespository extends JpaRepository<TipoAposta,Long> {
}
