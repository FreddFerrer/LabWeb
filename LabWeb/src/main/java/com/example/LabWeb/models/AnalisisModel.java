package com.example.LabWeb.models;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "lista")
public class AnalisisModel {

    public AnalisisModel() {
    }

    public AnalisisModel(Long id, String analisis, double precio) {
        this.id = id;
        this.analisis = analisis;
        this.precio = precio;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "analisis")
    private String analisis;

    @Column(name = "precio")
    private double precio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnalisis() {
        return analisis;
    }

    public void setAnalisis(String analisis) {
        this.analisis = analisis;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
