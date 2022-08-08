package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descriçao;
    private int cargahoraria;

    public Curso() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descrição='" +  + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }

    public void setDescrição(String descriçaõ_curso_js) {
    }
}
