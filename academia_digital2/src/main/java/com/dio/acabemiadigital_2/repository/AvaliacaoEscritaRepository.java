package com.dio.acabemiadigital_2.repository;

import com.dio.acabemiadigital_2.entity.AvaliacaoEscrita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AvaliacaoEscritaRepository extends JpaRepository<AvaliacaoEscrita, Long> {

    @Override
    <S extends AvaliacaoEscrita> S save(S entity);

    @Override
    List<AvaliacaoEscrita> findAll();
}
