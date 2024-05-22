import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Javascript");
        curso1.setDescricao("descrição curso javascript");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso IA Developer");
        curso2.setDescricao("descrição curso IA");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Games");
        mentoria.setDescricao("descrição mentoria games");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGeovana = new Dev();
        devGeovana.setNome("Geovana");
        devGeovana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Geovana:" + devGeovana.getConteudosInscritos());
        devGeovana.progredir();
        devGeovana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Geovana:" + devGeovana.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Geovana:" + devGeovana.getConteudosConcluidos());
        System.out.println("XP:" + devGeovana.calcularTotalXp());

        System.out.println("-------");

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matheus:" + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        devMatheus.progredir();
        devMatheus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Matheus:" + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos ConcluidosMatheus:" + devMatheus.getConteudosConcluidos());
        System.out.println("XP:" + devMatheus.calcularTotalXp());

    }

}
