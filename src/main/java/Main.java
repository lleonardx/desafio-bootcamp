import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Curso
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição Curso Java");
        curso.setCargoHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Python");
        curso1.setCargoHoraria(8);

        //Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        //Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        //Dev
        Dev devLeonardo = new Dev();
        devLeonardo.setNome("Leonardo");
        devLeonardo.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos Leonardo: " + devLeonardo.getConteudosInscritos());
        devLeonardo.progredir();
        devLeonardo.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Leonardo: " + devLeonardo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Leonardo: " + devLeonardo.getConteudosConcluidos());
        System.out.println("XP: " +devLeonardo.calcularTotalXp());

        System.out.println("\n----\n");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " +devJoao.calcularTotalXp());

    }
}
