package com.dio.acabemiadigital_2.service.impl;

import com.dio.acabemiadigital_2.entity.Aluno;
import com.dio.acabemiadigital_2.entity.AvaliacaoEscrita;
import com.dio.acabemiadigital_2.entity.form.AlunoForm;
import com.dio.acabemiadigital_2.entity.form.AlunoUpdateForm;
import com.dio.acabemiadigital_2.infrastructure.util.JavaTimeUtils;
import com.dio.acabemiadigital_2.repository.AlunoRepository;
import com.dio.acabemiadigital_2.service.IAlunoService;
import lombok.NoArgsConstructor;
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

        if (dataNascimento == null) {
            return alunoRepository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(dataNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return alunoRepository.findByDataNascimento(localDate);
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
