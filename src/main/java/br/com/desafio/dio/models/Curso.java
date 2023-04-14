package br.com.desafio.dio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "CAD_CURSO")
@Table(name = "CAD_CURSO")
public class Curso {

    @Id
    @Column(name = "ID_CURSO")
    private Long cdCurso;

    @Column(name = "NM_CURSO")
    private String nomeCurso;

    public Curso() {
    }

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Curso(Long cdCurso, String nomeCurso) {
        this.cdCurso = cdCurso;
        this.nomeCurso = nomeCurso;
    }

    public float getCdCurso() {
        return cdCurso;
    }

    public void setCdCurso(Long cdCurso) {
        this.cdCurso = cdCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

}
