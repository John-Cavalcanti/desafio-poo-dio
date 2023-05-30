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
        // TODO Auto-generated method stub
        return XP_PADRAO + cargaHoraria;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Curso: " + getTitulo() + ", Carga: " + cargaHoraria + ", Descrição: " + getDescricao();
    }
}
