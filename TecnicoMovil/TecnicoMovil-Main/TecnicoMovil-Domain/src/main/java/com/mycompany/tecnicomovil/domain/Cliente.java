/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tecnicomovil.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
@Table (name = "cliente")
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    private Long id;
    
    @Column (name = "Nombre")
    private String nombre;
    
    @Column (name = "numTelefonico")
    private String numTelefonico;
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Servicio> servicios;

    public Cliente() {
    }

    public Cliente(String nombre, String numTelefonico, List<Servicio> servicios) {
        this.nombre = nombre;
        this.numTelefonico = numTelefonico;
        this.servicios = servicios;
    }
    
    public Cliente(Long id, String nombre, String numTelefonico, List<Servicio> servicios) {
        this.id = id;
        this.nombre = nombre;
        this.numTelefonico = numTelefonico;
        this.servicios = servicios;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumTelefonico() {
        return numTelefonico;
    }

    public void setNumTelefonico(String numTelefonico) {
        this.numTelefonico = numTelefonico;
    }
    
    
}
