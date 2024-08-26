package com.ruan.desafio_ame_digital.dto;

import com.ruan.desafio_ame_digital.model.Planeta;

public class PlanetaDTO {

    private String nome;
    private String clima;
    private Integer numeroAparicoes;

    public PlanetaDTO(String nome, String clima){
        this.nome = nome;
        this.clima = clima;
    }

    public PlanetaDTO() {
    }

    public PlanetaDTO(Planeta planeta){
        this.nome = planeta.getNome();
        this.clima = planeta.getClima();
        this.numeroAparicoes = planeta.getNumeroAparicoes();
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
}
