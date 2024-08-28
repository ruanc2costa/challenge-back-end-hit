package com.ruan.desafio_ame_digital.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruan.desafio_ame_digital.dto.PlanetaDTO;
import com.ruan.desafio_ame_digital.model.Planeta;
import com.ruan.desafio_ame_digital.service.PlanetaService;
import jakarta.websocket.server.PathParam;
import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planetas")
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

    @GetMapping("/{id}")
    public ResponseEntity<PlanetaDTO> listarPlaneta(@PathVariable long id){
        PlanetaDTO planetaDTO = planetaService.listarPlaneta(id);
        return ResponseEntity.ok(planetaDTO);
    }

    @GetMapping("/search")
    public ResponseEntity<PlanetaDTO> listarPorNome(@RequestParam String nome){
        PlanetaDTO planetaDTO = planetaService.listarPorNome(nome);
        return ResponseEntity.ok(planetaDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarPlaneta(@PathVariable long id){
        planetaService.deletarPlaneta(id);
        return ResponseEntity.ok("Planeta deletado!");
    }
}
