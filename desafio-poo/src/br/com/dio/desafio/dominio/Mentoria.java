package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    String titulo;
    String descricao;
    LocalDate data;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public LocalDate getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Mentoria: " + titulo + ", Data: " + data + ", Descrição: " + descricao;
    }

}
