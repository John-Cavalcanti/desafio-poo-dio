package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    /*
     * Methods to add :
     * - addContent(Content content) done
     * - removeContent(Content content) done
     * - getAllContents() done
     * - getDescription() done
     * - getDuration() done
     * - getParticipantProgress() talvez fazer na classe Dev
     */

    // Meus metodos

    public void addContent(Conteudo conteudo){
        this.conteudos.add(conteudo);
    }

    public void removerConteudo(Conteudo conteudo) {
        this.conteudos.remove(conteudo);
    }

    public long getDuracao() {
        long duracao = 0;

        duracao = ChronoUnit.DAYS.between(this.dataInicial, this.dataFinal);
        
        return duracao;
    }
    
    /**************** Metodos base ****************/

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    public LocalDate getDataInicial() {
        return dataInicial;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) obj;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
