package com.dio.acabemiadigital.repository;

import com.dio.acabemiadigital.entity.AvaliacaoEscrita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoEscritaRepository extends JpaRepository<AvaliacaoEscrita,Long> {
}
