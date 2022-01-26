package com.dio.acabemiadigital_2.service;

import com.dio.acabemiadigital_2.entity.Matricula;
import com.dio.acabemiadigital_2.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {

    /**
     * Metodo para criar a matrícula e salvar no DB
     *
     * @param form Refere-se ao formulario de matricula
     * @return A matrícula criada
     */
    Matricula create(MatriculaForm form);

    /**
     * Retorna uma matrícula existente no (BD) por meio do ID
     *
     * @param id da matricula a ser exibido
     * @return A matricula conforme o ID solicitado
     */
    Matricula get(Long id);

    /**
     * Retorna o registo de todas as matrículas existentes no (BD).
     *
     * @return Uma lista com todas as matrículas efectuadas.
     */
    List<Matricula> getAll(String bairro);

    /**
     * Apaga uma matrícula conforme o ID indicado.
     *
     * @param id Da matricula que sera apagada.
     */
    void delete(Long id);
}
