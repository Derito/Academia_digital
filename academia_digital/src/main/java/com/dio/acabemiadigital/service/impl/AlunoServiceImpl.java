package com.dio.acabemiadigital.service.impl;

import com.dio.acabemiadigital.entity.Aluno;
import com.dio.acabemiadigital.entity.AvaliacaoEscrita;
import com.dio.acabemiadigital.entity.form.AlunoForm;
import com.dio.acabemiadigital.entity.form.AlunoUpdateForm;
import com.dio.acabemiadigital.infrastructure.util.JavaTimeUtils;
import com.dio.acabemiadigital.repository.AlunoRepository;
import com.dio.acabemiadigital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataNascimento(form.getDataNascimento());

        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll(String dataNascimento) {

        if(dataNascimento == null) {
            return alunoRepository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(dataNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return alunoRepository.findByDataDeNascimento(localDate);
        }
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoEscrita> getAllAvaliacaoEscritaId(Long id) {
        Aluno aluno = alunoRepository.findById(id).get();

        return aluno.getAvaliacoes();
    }
}
