
CREATE TABLE public.tb_alunos
(
    id bigint NOT NULL,
    nome character varying(50) NOT NULL,
    cpf character varying(15) UNIQUE NOT NULL,
    bairro character varying(50) NOT NULL,
    data_nascimento date NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.tb_alunos
    OWNER to postgres;

CREATE TABLE public.tb_avaliacoes
(
    id bigint NOT NULL,
    nome character varying(50) NOT NULL,
    aluno_id bigint NOT NULL,
    data_da_avaliacao date NOT NULL,
    nota_anterior double precision NOT NULL,
    nova_nota double precision NOT NULL,

    PRIMARY KEY (id)
);

CREATE TABLE public.tb_matriculas
(
    id bigint NOT NULL,
    aluno_id bigint NOT NULL,
    data_matricula date NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.tb_avaliacoes add constraint fk_avaliacoes_alunos
foreign key (aluno_id) references public.tb_alunos (id);

ALTER TABLE IF EXISTS public.tb_matriculas add constraint fk_matriculas_alunos
foreign key (aluno_id) references public.tb_alunos (id);

