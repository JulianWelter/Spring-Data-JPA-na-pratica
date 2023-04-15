package br.com.desafio.dio.services;

import br.com.desafio.dio.models.Aluno;
import br.com.desafio.dio.models.Curso;
import br.com.desafio.dio.models.Professor;

public interface PessoaFactory {
    Aluno criarAluno(String nome, String ra, Curso curso);
    Professor criarProfessor(String nome, String matricula);
}
