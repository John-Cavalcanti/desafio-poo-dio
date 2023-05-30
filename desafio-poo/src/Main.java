import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("curso Java");
        curso.setCarga(8);
        curso.setDescricao("Descricao curso java");

        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("mentoria Java");
        mentoria.setTitulo("Mentoria Java");

        System.out.println(curso.toString());
        System.out.println(mentoria.toString());
    }
}
