package br.com.desafio.dio.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Marca {

    @Id
    @Column(name = "ID_MARCA")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMarca;

    @Column(name = "NOME_MARCA")
    private String nomeMarca;
//    private List<Modelo> modelos;

    public Marca(){}

    public Long getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Long idMarca) {
        this.idMarca = idMarca;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

}
