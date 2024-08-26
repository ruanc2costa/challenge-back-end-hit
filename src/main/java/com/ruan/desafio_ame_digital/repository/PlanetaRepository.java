package com.ruan.desafio_ame_digital.repository;

import com.ruan.desafio_ame_digital.model.Planeta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetaRepository extends JpaRepository<Planeta, Long> {
}
