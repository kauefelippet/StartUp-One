package com.Rodaki.dto;

import com.Rodaki.entity.Passageiro;

public class PassageiroDTO {
    private Long id;
    private UserDTO user;
    private String endereco;
    private Double latitude;
    private Double longitude;

    public PassageiroDTO() {}

    public PassageiroDTO(Passageiro passageiro) {
        this.id = passageiro.getId();
        this.user = new UserDTO(passageiro.getUser());
        this.endereco = passageiro.getEndereco();
        this.latitude = passageiro.getLatitude();
        this.longitude = passageiro.getLongitude();
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UserDTO getUser() { return user; }
    public void setUser(UserDTO user) { this.user = user; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public Double getLatitude() { return latitude; }
    public void setLatitude(Double latitude) { this.latitude = latitude; }

    public Double getLongitude() { return longitude; }
    public void setLongitude(Double longitude) { this.longitude = longitude; }
}
