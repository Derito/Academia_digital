package com.dio.acabemiadigital_2.controller;

import com.dio.acabemiadigital_2.entity.AvaliacaoEscrita;
import com.dio.acabemiadigital_2.entity.form.AvaliacaoEscritaForm;
import com.dio.acabemiadigital_2.service.impl.AvaliacaoEscritaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoEscritaController {

    @Autowired
    private AvaliacaoEscritaServiceImpl service;

    @PostMapping
    public AvaliacaoEscrita create(@Valid @RequestBody AvaliacaoEscritaForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<AvaliacaoEscrita> findAll() {
        return service.buscaTodas();
    }
}
