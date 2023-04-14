package br.com.desafio.dio.controllers;

import br.com.desafio.dio.repositories.AlunoRepository;
import br.com.desafio.dio.models.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("aluno")
public class AlunoController {

    private final AlunoRepository alunoRepository;

    @Autowired
    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody Aluno aluno) {
        return new ResponseEntity<>(alunoRepository.save(aluno), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(alunoRepository.findAll(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Aluno aluno) {
        return new ResponseEntity<>(alunoRepository.save(aluno), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        if (alunoRepository.existsById(id)) {
            alunoRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
