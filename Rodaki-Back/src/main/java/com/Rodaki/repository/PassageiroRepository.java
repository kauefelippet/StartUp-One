package com.Rodaki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rodaki.entity.Passageiro;

public interface PassageiroRepository extends JpaRepository<Passageiro, Long> {
}
