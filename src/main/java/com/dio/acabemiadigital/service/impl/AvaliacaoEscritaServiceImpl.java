package com.dio.acabemiadigital.service.impl;

import com.dio.acabemiadigital.entity.Aluno;
import com.dio.acabemiadigital.entity.AvaliacaoEscrita;
import com.dio.acabemiadigital.entity.form.AvaliacaoEscritaForm;
import com.dio.acabemiadigital.entity.form.AvaliacaoEscritaUpdateForm;
import com.dio.acabemiadigital.repository.AlunoRepository;
import com.dio.acabemiadigital.repository.AvaliacaoEscritaRepository;
import com.dio.acabemiadigital.service.IAvaliacaoEscritaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoEscritaServiceImpl implements IAvaliacaoEscritaService {

    @Autowired
    private AlunoRepository alunoRepository;
    @Autowired
    private AvaliacaoEscritaRepository avaliacaoEscritaRepository;

    @Override
    public AvaliacaoEscrita create(AvaliacaoEscritaForm form) {
        AvaliacaoEscrita avaliacaoEscrita = new AvaliacaoEscrita();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoEscrita.setAluno(aluno);
        avaliacaoEscrita.setNotaAnterior(form.getNotaAnterior());
        avaliacaoEscrita.setNovaNota(form.getNovaNota());

        return avaliacaoEscritaRepository.save(avaliacaoEscrita);

    }

    @Override
    public AvaliacaoEscrita get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoEscrita> getAll() {
        return avaliacaoEscritaRepository.findAll();
    }

    @Override
    public AvaliacaoEscrita update(Long id, AvaliacaoEscritaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
