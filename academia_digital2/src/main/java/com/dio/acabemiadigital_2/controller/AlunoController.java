package com.dio.acabemiadigital_2.controller;

import com.dio.acabemiadigital_2.entity.Aluno;
import com.dio.acabemiadigital_2.entity.AvaliacaoEscrita;
import com.dio.acabemiadigital_2.entity.form.AlunoForm;
import com.dio.acabemiadigital_2.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form) {
        return service.create(form);
    }

    @GetMapping(value = "/avaliacoes/{id}")
    public List<AvaliacaoEscrita> getAllAvaliacaoEscritaId(@PathVariable Long id) {
        return service.getAllAvaliacaoEscritaId(id);
    }

    @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dataNascimento", required = false)
                                      String dataNascimento) {
        return service.getAll(dataNascimento);
    }
    @DeleteMapping(value ="/{id}")
    public void delete(@PathVariable Long id) {
       service.delete(id);
    }

}
