package com.Rodaki.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rodaki.dto.PassageiroDTO;
import com.Rodaki.entity.Passageiro;
import com.Rodaki.service.PassageiroService;

@RestController
@RequestMapping("/api/passageiros")
public class PassageiroController {
    private final PassageiroService passageiroService;

    public PassageiroController(PassageiroService passageiroService) {
        this.passageiroService = passageiroService;
    }

    @PostMapping
    public ResponseEntity<PassageiroDTO> salvar(@RequestBody Passageiro passageiro) {
        Passageiro saved = passageiroService.salvar(passageiro);
        return ResponseEntity.ok(new PassageiroDTO(saved));
    }

    @GetMapping
    public ResponseEntity<List<PassageiroDTO>> listarTodos() {
        List<PassageiroDTO> dtos = passageiroService.listarTodos()
            .stream()
            .map(PassageiroDTO::new)
            .collect(Collectors.toList());
        return ResponseEntity.ok(dtos);
    }
}