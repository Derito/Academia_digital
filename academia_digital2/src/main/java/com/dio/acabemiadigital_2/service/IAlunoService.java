package com.dio.acabemiadigital_2.service;

import com.dio.acabemiadigital_2.entity.Aluno;
import com.dio.acabemiadigital_2.entity.AvaliacaoEscrita;
import com.dio.acabemiadigital_2.entity.form.AlunoForm;
import com.dio.acabemiadigital_2.entity.form.AlunoUpdateForm;

import java.util.List;

;

public interface IAlunoService {

    /**
     * Metodo para criar um Aluno e salvar no DB
     *
     * @param form Refere-se ao formulario de cadastro de aluno
     * @return Um aluno criado no BD.
     */
    Aluno create(AlunoForm form);

    /**
     * Retorna um aluno existente no (BD) por meio do ID
     *
     * @param id Do Aluno a ser exibido
     * @return Um aluno conforme o ID solicitado
     */
    Aluno get(Long id);

    /**
     * Retorna o registo de todos os alunos existentes no (BD).
     *
     * @return Lista de alunos existentes no (BD).
     */
    List<Aluno> getAll(String dataNascimento);

    /**
     * Atualiza um aluno existente no (BD)
     *
     * @param id         Do aluno a ser actualizado
     * @param formUpdate Do aluno que sera actualizado.
     * @return um aluno atualizado por meio do ID indicado.
     */
    Aluno update(Long id, AlunoUpdateForm formUpdate);

    /**
     * Apaga um regitro de aluno conforme o ID indicado.
     *
     * @param id Do aluno que sera apagado.
     */
    void delete(Long id);

    /**
     * @param id id do aluno que será recuperada a lista de avaliações
     * @return uma lista com todas as avaliações do aluno conforme o Id
     */
    List<AvaliacaoEscrita> getAllAvaliacaoEscritaId(Long id);

}
