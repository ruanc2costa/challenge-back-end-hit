package com.ruan.desafio_ame_digital.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruan.desafio_ame_digital.dto.PlanetaDTO;
import com.ruan.desafio_ame_digital.model.Planeta;
import com.ruan.desafio_ame_digital.service.PlanetaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planeta")
public class PlanetaController {

    private PlanetaService planetaService;

    public PlanetaController(PlanetaService planetaService) {
        this.planetaService = planetaService;
    }

    @PostMapping
    public ResponseEntity<PlanetaDTO> criarPlaneta(@RequestBody PlanetaDTO planetaDTO) throws JsonProcessingException {
        Planeta planeta = planetaService.criarPlaneta(planetaDTO);
        PlanetaDTO planetaDTOResponse = new PlanetaDTO(planeta);
        planetaService.criarPlaneta(planetaDTOResponse);
        return ResponseEntity.ok(planetaDTOResponse);
    }

    @GetMapping
    public ResponseEntity<List<PlanetaDTO>> listarTodosPlanetas(){
        List<PlanetaDTO> planetasDTO = planetaService.listarTodosPlanetas();
        return ResponseEntity.ok(planetasDTO);
    }
}
