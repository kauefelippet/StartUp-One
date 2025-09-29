package com.Rodaki.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<Passageiro> salvar(@RequestBody Passageiro passageiro) {
        return ResponseEntity.ok(passageiroService.salvar(passageiro));
    }

    @GetMapping
    public ResponseEntity<List<Passageiro>> listarTodos() {
        return ResponseEntity.ok(passageiroService.listarTodos());
    }
}