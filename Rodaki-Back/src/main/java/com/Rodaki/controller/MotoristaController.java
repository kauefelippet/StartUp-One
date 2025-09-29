package com.Rodaki.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rodaki.dto.MotoristaDTO;
import com.Rodaki.entity.Motorista;
import com.Rodaki.service.MotoristaService;

@RestController
@RequestMapping("/api/motoristas")
public class MotoristaController {
    private final MotoristaService motoristaService;

    public MotoristaController(MotoristaService motoristaService) {
        this.motoristaService = motoristaService;
    }

    @PostMapping
    public ResponseEntity<MotoristaDTO> salvar(@RequestBody Motorista motorista) {
        Motorista saved = motoristaService.salvar(motorista);
        return ResponseEntity.ok(new MotoristaDTO(saved));
    }

    @GetMapping
    public ResponseEntity<List<MotoristaDTO>> listarTodos() {
        List<MotoristaDTO> dtos = motoristaService.listarTodos()
            .stream()
            .map(MotoristaDTO::new)
            .collect(Collectors.toList());
        return ResponseEntity.ok(dtos);
    }
}
