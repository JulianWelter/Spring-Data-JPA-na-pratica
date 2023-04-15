package br.com.desafio.dio.services;


import br.com.desafio.dio.models.Aluno;
import br.com.desafio.dio.models.Professor;
import br.com.desafio.dio.models.Curso;
import br.com.desafio.dio.repositories.AlunoRepository;
import br.com.desafio.dio.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class PessoaFactoryImpl implements PessoaFactory {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public Aluno criarAluno(String nome, String ra, Curso curso) {
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setRa(ra);
        aluno.setCurso(curso);
        alunoRepository.save(aluno);
        return aluno;
    }

    @Override
    public Professor criarProfessor(String nome, String matricula) {
        Professor professor = new Professor();
        professor.setNome(nome);
        professor.setMatricula(matricula);
        professorRepository.save(professor);
        return professor;
    }
}


