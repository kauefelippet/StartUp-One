package com.Rodaki.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Rodaki.entity.Passageiro;
import com.Rodaki.repository.PassageiroRepository;

@Service
public class PassageiroService {
    private final PassageiroRepository passageiroRepository;

    public PassageiroService(PassageiroRepository passageiroRepository) {
        this.passageiroRepository = passageiroRepository;
    }

    public Passageiro salvar(Passageiro passageiro) {
        return passageiroRepository.save(passageiro);
    }

    public List<Passageiro> listarTodos() {
        return passageiroRepository.findAll();
    }
}
