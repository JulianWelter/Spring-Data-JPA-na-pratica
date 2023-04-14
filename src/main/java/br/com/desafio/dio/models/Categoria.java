package br.com.desafio.dio.models;

import javax.persistence.*;

@Entity(name = "CATEGORIA")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CATEGORIA")
    private Long idCategoria;

    @Column(name = "DESC_CATEGORIA")
    private String DescCategoria;

    public String getDescCategoria() {
        return DescCategoria;
    }

    public void setDescCategoria(String descCategoria) {
        DescCategoria = descCategoria;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

}
