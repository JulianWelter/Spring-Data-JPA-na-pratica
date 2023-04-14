package br.com.desafio.dio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="ALUNO")
public class Aluno extends Pessoa{

    @Column(name = "RA_ALUNO")
    private String ra;

    @OneToOne
    @JoinColumn(name = "CD_CURSO")
    private Curso curso;

    public Aluno() {
    }

    public Aluno(Long i, String nome, String ra) {
        super(i, nome);
        this.ra =ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
