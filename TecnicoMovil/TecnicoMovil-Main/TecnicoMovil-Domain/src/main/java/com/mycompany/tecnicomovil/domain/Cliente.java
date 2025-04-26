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
@Table (name = "Cliente")
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    private Long id;
    
    @Column (name = "Nombre")
    private String nombre;
    
    @Column (name = "numTelefonico")
    private String numTelefonico;

    public Cliente() {
    }
    
    public Cliente(String nombre, String numTelefonico) {
        this.nombre = nombre;
        this.numTelefonico = numTelefonico;
    }

    public Cliente(Long id, String nombre, String numTelefonico) {
        this.id = id;
        this.nombre = nombre;
        this.numTelefonico = numTelefonico;
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
