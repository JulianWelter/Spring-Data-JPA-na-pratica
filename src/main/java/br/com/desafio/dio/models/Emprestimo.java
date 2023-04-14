package br.com.desafio.dio.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "EMPRESTIMO")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name ="ID_EQUIPAMENTO")
    private Equipamento equipamento;

    @OneToOne
    @JoinColumn(name ="ID_PESSOA")
    private Pessoa pessoa;

    @Column(name = "tipo")
    private String tipo;

    @Column(name ="DATA_EMPRESTIMO")
    private Date DtEmprestimo = new Date();

    public Emprestimo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Date getDtEmprestimo() {
        return DtEmprestimo;
    }

    public void setDtEmprestimo(Date dtEmprestimo) {
        DtEmprestimo = dtEmprestimo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean verificaDevolucao(){
        return Objects.equals(this.tipo, "devolução");
    }
}
