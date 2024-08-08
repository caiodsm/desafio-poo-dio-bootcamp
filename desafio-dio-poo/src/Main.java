import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("descrição do curso java");
        curso.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(8);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("mentoria java");
        mentoria.setData(LocalDate.now());

        // Conteudo conteudo =  new Curso(); 
        // Conteudo conteudo =  new Mentoria(); // conteudo é mae de mentiroa e curso
        //polimorfismo tudo que tem em conteudo tem em curso mas nem tudo que tem em curso tem em conteudo

        // System.out.println(curso);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.insecreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Caio:" + devCaio.getConteudosInscritos());
       
        devCaio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Caio:" + devCaio.getConteudosInscritos());
        System.out.println("Conteúdos Concluido Caio:" + devCaio.getConteudosConcluidos());
        System.out.println("XP: " + devCaio.calcularTotalXp());
        

        System.out.println("----------------");


        Dev devCamila = new Dev();
        devCamila.setNome("Camila" );
        devCamila.insecreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluido Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

    }

}
