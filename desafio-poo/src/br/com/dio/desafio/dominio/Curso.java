package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public void setTitulo(String novoTitulo) {
        this.titulo = novoTitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDescricao(String novaDesc) {
        this.descricao = novaDesc;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCarga(int novaCarga) {
        this.cargaHoraria = novaCarga;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Curso: " + titulo + ", Carga: " + cargaHoraria + ", Descrição: " + descricao;
    }
}
