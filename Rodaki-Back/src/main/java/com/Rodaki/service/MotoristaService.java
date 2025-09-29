package com.Rodaki.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Rodaki.entity.Motorista;
import com.Rodaki.repository.MotoristaRepository;

@Service
public class MotoristaService {
    private final MotoristaRepository motoristaRepository;

    public MotoristaService(MotoristaRepository motoristaRepository) {
        this.motoristaRepository = motoristaRepository;
    }

    public Motorista salvar(Motorista motorista) {
        return motoristaRepository.save(motorista);
    }

    public List<Motorista> listarTodos() {
        return motoristaRepository.findAll();
    }
}
