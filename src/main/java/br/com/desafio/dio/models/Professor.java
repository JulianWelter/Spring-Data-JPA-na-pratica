package br.com.desafio.dio.models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "CAD_PROFESSOR")
public class Professor extends Pessoa {

    @Column(name = "MATRICULA")
    private String matricula;

    public Professor(Long i, String nome) {
        super(i, nome);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
