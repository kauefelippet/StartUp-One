package com.Rodaki.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "passageiros")
public class Passageiro {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String endereco;

    private Double latitude;
    private Double longitude;

    public Passageiro() {}

    public Passageiro(User user, String endereco, Double latitude, Double longitude) {
        this.user = user;
        this.endereco = endereco;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // getters / setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public Double getLatitude() { return latitude; }
    public void setLatitude(Double latitude) { this.latitude = latitude; }

    public Double getLongitude() { return longitude; }
    public void setLongitude(Double longitude) { this.longitude = longitude; }
}
