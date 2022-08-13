import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


import java.awt.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso() {
            /**
             * @return
             */
            @Override
            public double calcularXp() {
                return 0;
            }
        };
        curso1.setTitulo("curso java");
        curso1.setDescrição("descrição curso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso() {
            /**
             * @return
             */
            @Override
            public double calcularXp() {
                return 0;
            }
        };
        curso2.setTitulo("curso js");
        curso2.setDescrição("descrição curso js");
        curso2.setCargahoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescrição("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescrição("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEstefane = new Dev();
        devEstefane.setNome("Estefane");
        devEstefane.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Estefane" + devEstefane.getConteudosInscritos());
        devEstefane.progredir();
        devEstefane.progredir();
        System.out.println("_");
        System.out.println("Conteudos Inscritos Estefane" + devEstefane.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Estefane" + devEstefane.getConteudosConcluidos());
        System.out.println("XP:" + devEstefane.calcularTotalXp());

        System.out.println("-------");

        Dev devMateus = new Dev();
        devMateus.setNome("Mateus");
        devMateus.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Mateus" + devMateus.getConteudosInscritos());
        devMateus.progredir();
        devMateus.progredir();
        devMateus.progredir();
        System.out.println("_");
        System.out.println("Conteudos Inscritos Mateus" + devMateus.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Mateus" + devMateus.getConteudosConcluidos());
        System.out.println("XP:" + devMateus.calcularTotalXp());
    }
}
