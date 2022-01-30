import java.time.LocalDate;

import Desafio_Dominio.Bootcamp;
import Desafio_Dominio.Curso;
import Desafio_Dominio.Dev;
import Desafio_Dominio.Mentoria;



public class Main {
public static void main(String[] args) {
  
    Curso curso1= new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);

    Curso curso2= new Curso();
    curso2.setTitulo("curso javascript");
    curso2.setDescricao("descrição curso javascript");
    curso2.setCargaHoraria(10);


    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria java");
    mentoria.setDescricao("descrição mentoria java");
    mentoria.setData(LocalDate.now());

    // System.out.println(curso1);
    // System.out.println(curso2);
    // System.out.println(mentoria);


    Bootcamp bootCamp = new Bootcamp();
    bootCamp.setNome("Boot Java Developer");
    bootCamp.setDescricao("Aprenda Java da melhor maneira!");
    bootCamp.getConteudos().add(curso1);
    bootCamp.getConteudos().add(curso2);
    bootCamp.getConteudos().add(mentoria);

    Dev devLucas = new Dev();
    devLucas.setNome("Lucas");
    devLucas.inscreverBootcamp(bootCamp);
    System.out.println("Conteúdos Inscritos Lucas"+ devLucas.getConteudoInscritos());

    devLucas.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos Lucas"+ devLucas.getConteudoInscritos());
    System.out.println("Conteúdos Concluidos Lucas"+ devLucas.getConteudosConcluidos());
    System.out.println("XP:" + devLucas.calcularTotalXp());

    System.out.println("-------");

    Dev devErick = new Dev();
    devErick.setNome("Erick");
    devLucas.inscreverBootcamp(bootCamp);
    System.out.println("Conteúdos Inscritos Erick"+ devErick.getConteudoInscritos());
    devErick.progredir();
    System.out.println("-");
    
    System.out.println("Conteúdos Inscritos Erick"+ devErick.getConteudoInscritos());
    System.out.println("Conteúdos Concluidos Erick"+ devErick.getConteudosConcluidos());
    System.out.println("XP:" + devLucas.calcularTotalXp());

}
    
}
