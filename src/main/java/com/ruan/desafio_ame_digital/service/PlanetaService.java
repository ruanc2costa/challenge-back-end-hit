package com.ruan.desafio_ame_digital.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ruan.desafio_ame_digital.dto.PlanetaDTO;
import com.ruan.desafio_ame_digital.model.Planeta;
import com.ruan.desafio_ame_digital.model.swapiResponse;
import com.ruan.desafio_ame_digital.repository.PlanetaRepository;
import org.hibernate.internal.util.StringHelper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class PlanetaService {

    private PlanetaRepository planetaRepository;

    public PlanetaService(PlanetaRepository planetaRepository) {
        this.planetaRepository = planetaRepository;
    }

    public Planeta criarPlaneta(PlanetaDTO planetaDTO) throws JsonProcessingException {
        String nomePlaneta = planetaDTO.getNome();
        String uri = "https://swapi.dev/api/planets/?search=" + nomePlaneta;
        String response = new RestTemplate().getForObject(uri, String.class);
        JSONObject jsonObject = new JSONObject(response);
        JSONArray resultsArray = (JSONArray) jsonObject.get("results");
        JSONArray films = resultsArray.getJSONObject(0).getJSONArray("films");
        int count = 0;
        for(Object s : films){
            count++;
        }
        Planeta planeta = new Planeta(planetaDTO);
        planeta.setNumeroAparicoes(count);
        planetaRepository.save(planeta);
        return planeta;
    }

    public List<PlanetaDTO> listarTodosPlanetas(){
        List<Planeta> planetas = planetaRepository.findAll();
        List<PlanetaDTO> planetaDTOS = new ArrayList<>();
        for(Planeta planeta: planetas){
            planetaDTOS.add(new PlanetaDTO(planeta));
        }
        return planetaDTOS;
    }
}
