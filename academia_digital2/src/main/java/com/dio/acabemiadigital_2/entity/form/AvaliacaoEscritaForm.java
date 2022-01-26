package com.dio.acabemiadigital_2.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoEscritaForm {

    //@Positive(message = "O Id do aluno precisa ser positivo.")
    private Long alunoId;

    //@NotNull(message = "Preencha o campo corretamente.")
    //@Positive(message = "${validatedValue}' precisa ser positivo.")
    private double notaAnterior;

    //@NotNull(message = "Preencha o campo corretamente.")
    //@Positive(message = "${validatedValue}' precisa ser positivo.")
    //@DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo {value}.")
    private double novaNota;
}
