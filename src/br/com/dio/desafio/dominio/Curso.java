package br.com.dio.desafio.dominio;

public abstract class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularxp() {

        return XP_PADRAO = cargaHoraria;
    }

    public Curso() {
    }

    public int getCargahoraria() {
        return cargaHoraria;
    }

    public void setCargahoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public  String  toString () {
        return  "Curso{" +
                "titulo='" + getTitulo () + '\'' +
                ", descrição='" + getDescricao () + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}' ;
    }
}
