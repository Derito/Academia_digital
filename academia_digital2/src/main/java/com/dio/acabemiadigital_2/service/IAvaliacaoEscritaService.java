package com.dio.acabemiadigital_2.service;

import com.dio.acabemiadigital_2.entity.AvaliacaoEscrita;
import com.dio.acabemiadigital_2.entity.form.AvaliacaoEscritaForm;
import com.dio.acabemiadigital_2.entity.form.AvaliacaoEscritaUpdateForm;

import java.util.List;

public interface IAvaliacaoEscritaService {

    /**
     * Cria uma Avaliação Escrita e salva no banco de dados.
     *
     * @param form - formulário referente aos dados para criação da Avaliação Escrita no banco de dados.
     * @return - Avaliação Escrita recém-criada.
     */
    AvaliacaoEscrita create(AvaliacaoEscritaForm form);

    /**
     * Retorna uma Avaliação Escrita que está no banco de dados de acordo com seu ID.
     *
     * @param id - id da Avaliação Escrita que será exibida.
     * @return - Avaliação Escrita conforme o ID fornecido.
     */
    AvaliacaoEscrita get(Long id);

    /**
     * Retorna todas as Avaliações Física que estão no banco de dados.
     *
     * @return - Uma lista com todas as Avaliações Física que estão salvas no DB.
     */
    List<AvaliacaoEscrita> getAll();

    /**
     * Atualiza a avaliação física.
     *
     * @param id         - id da Avaliação Escrita que será atualizada.
     * @param formUpdate - formulário referente aos dados necessários para atualização da Avaliação
     *                   Escrita no banco de dados.
     * @return - Avaliação Física recém-atualizada.
     */
    AvaliacaoEscrita update(Long id, AvaliacaoEscritaUpdateForm formUpdate);

    /**
     * Deleta uma Avaliação Escrita específica.
     *
     * @param id - id da Avaliação Escrita que será removida.
     */
    void delete(Long id);
}
