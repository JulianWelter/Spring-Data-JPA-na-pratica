package br.com.desafio.dio.controllers;

import br.com.desafio.dio.repositories.ProfessorRepository;
import br.com.desafio.dio.models.Professor;
import br.com.desafio.dio.services.PessoaFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("professor")
public class ProfessorController {

    @Autowired
    private PessoaFactory pessoaFactory;

    private final ProfessorRepository professorRepository;

    @Autowired
    public ProfessorController(@RequestBody ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    @PostMapping
    public ResponseEntity<?> add(Professor professor) {
        return new ResponseEntity<>(pessoaFactory.criarProfessor(professor.getNome(), professor.getMatricula()), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(professorRepository.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        if (professorRepository.existsById(id)) {
            professorRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
