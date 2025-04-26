/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tecnicomovil.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
@Table (name = "Telefono")
public class Telefono implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idTelefono")
    private Long id;
    
    @Column(name = "Marca")
    private String marca;
    
    @Column(name = "Modelo")
    private String modelo;
    
    @Column(name = "IMEI")
    private String imei;
    
    @Column(name = "Detalles")
    private String detalles;

    public Telefono() {
    }
    
    public Telefono(String marca, String modelo, String imei, String detalles) {
        this.marca = marca;
        this.modelo = modelo;
        this.imei = imei;
        this.detalles = detalles;
    }

    public Telefono(Long id, String marca, String modelo, String imei, String detalles) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.imei = imei;
        this.detalles = detalles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    
    
}
