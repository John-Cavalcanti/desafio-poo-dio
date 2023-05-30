package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    
    LocalDate data;

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Mentoria: " + getTitulo() + ", Data: " + data + ", Descrição: " + getDescricao();
    }

}
