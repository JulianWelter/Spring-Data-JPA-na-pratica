package br.com.desafio.dio.models;

import javax.persistence.*;

@Entity
public class Modelo {

    @Id
    @Column(name = "ID_MODELO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idModelo;

    @Column(name = "DESC_MODELO")
    private String descModelo;
//    private Marca marca;

    public Modelo(){}

    public Long getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Long idModelo) {
        this.idModelo = idModelo;
    }

    public String getDescModelo() {
        return descModelo;
    }

    public void setDescModelo(String descModelo) {
        this.descModelo = descModelo;
    }

}
