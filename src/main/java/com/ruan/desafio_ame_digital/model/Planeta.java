package com.ruan.desafio_ame_digital.model;

import com.ruan.desafio_ame_digital.dto.PlanetaDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Planeta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String clima;

    @NotNull
    private String terreno;

    @NotNull
    private Integer numeroAparicoes;

    public Planeta(String nome, String clima, String terreno) {
        this.nome = nome;
        this.clima = clima;
    }

    public Planeta() {
    }
    public Planeta(PlanetaDTO planetaDTO){
        this.nome = planetaDTO.getNome();
        this.clima = planetaDTO.getClima();
        this.terreno = planetaDTO.getTerreno();
    }

    public Long getId() {
        return id;
    }

    public @NotNull String getNome() {
        return nome;
    }

    public void setNome(@NotNull String nome) {
        this.nome = nome;
    }

    public @NotNull String getClima() {
        return clima;
    }

    public void setClima(@NotNull String clima) {
        this.clima = clima;
    }

    public @NotNull String getTerreno() {
        return terreno;
    }

    public void setTerreno(@NotNull String terreno) {
        this.terreno = terreno;
    }

    @NotNull
    public Integer getNumeroAparicoes() {
        return numeroAparicoes;
    }

    public void setNumeroAparicoes(@NotNull Integer numeroAparicoes) {
        this.numeroAparicoes = numeroAparicoes;
    }
}
