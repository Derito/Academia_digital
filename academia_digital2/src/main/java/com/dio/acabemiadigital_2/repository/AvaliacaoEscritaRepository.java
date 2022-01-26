package com.dio.acabemiadigital_2.repository;

import com.dio.acabemiadigital_2.entity.AvaliacaoEscrita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoEscritaRepository extends JpaRepository<AvaliacaoEscrita, Long> {
}
