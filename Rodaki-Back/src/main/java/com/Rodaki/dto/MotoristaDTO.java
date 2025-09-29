package com.Rodaki.dto;

import com.Rodaki.entity.Motorista;

public class MotoristaDTO {
    private Long id;
    private UserDTO user;
    private String veiculo;
    private String placa;
    private Integer capacidade;
    private Double latitude;
    private Double longitude;

    public MotoristaDTO() {}

    public MotoristaDTO(Motorista motorista) {
        this.id = motorista.getId();
        this.user = new UserDTO(motorista.getUser());
        this.veiculo = motorista.getVeiculo();
        this.placa = motorista.getPlaca();
        this.capacidade = motorista.getCapacidade();
        this.latitude = motorista.getLatitude();
        this.longitude = motorista.getLongitude();
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UserDTO getUser() { return user; }
    public void setUser(UserDTO user) { this.user = user; }

    public String getVeiculo() { return veiculo; }
    public void setVeiculo(String veiculo) { this.veiculo = veiculo; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public Integer getCapacidade() { return capacidade; }
    public void setCapacidade(Integer capacidade) { this.capacidade = capacidade; }

    public Double getLatitude() { return latitude; }
    public void setLatitude(Double latitude) { this.latitude = latitude; }

    public Double getLongitude() { return longitude; }
    public void setLongitude(Double longitude) { this.longitude = longitude; }
}
