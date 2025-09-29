package com.Rodaki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rodaki.entity.Motorista;

public interface MotoristaRepository extends JpaRepository<Motorista, Long> {
}