package com.dio.acabemiadigital.controller;

import com.dio.acabemiadigital.entity.AvaliacaoEscrita;
import com.dio.acabemiadigital.entity.form.AvaliacaoEscritaForm;
import com.dio.acabemiadigital.service.impl.AvaliacaoEscritaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoEscritaController {

    @Autowired
    private AvaliacaoEscritaServiceImpl service;

    @PostMapping
    public AvaliacaoEscrita create(@RequestBody AvaliacaoEscritaForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<AvaliacaoEscrita> getAll(){
        return service.getAll();
    }
}
