package com.ruan.desafio_ame_digital.dto;

import com.ruan.desafio_ame_digital.model.Planeta;

public class PlanetaDTO {

    private Long id;
    private String nome;
    private String clima;
    private String terreno;
    private Integer numeroAparicoes;

    public PlanetaDTO(String nome, String clima, String terreno,  Integer numeroAparicoes){
        this.nome = nome;
        this.clima = clima;
        this.numeroAparicoes = numeroAparicoes;
    }

    public PlanetaDTO() {
    }

    public PlanetaDTO(Planeta planeta){
        this.id = planeta.getId();
        this.nome = planeta.getNome();
        this.clima = planeta.getClima();
        this.terreno = planeta.getTerreno();
        this.numeroAparicoes = planeta.getNumeroAparicoes();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public Integer getNumeroAparicoes() {
        return numeroAparicoes;
    }

    public void setNumeroAparicoes(Integer numeroAparicoes) {
        this.numeroAparicoes = numeroAparicoes;
    }
}
