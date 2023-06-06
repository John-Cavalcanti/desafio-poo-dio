package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public void setCarga(int novaCarga) {
        this.cargaHoraria = novaCarga;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " + getTitulo() + ", Carga: " + cargaHoraria + ", Descrição: " + getDescricao();
    }
}
