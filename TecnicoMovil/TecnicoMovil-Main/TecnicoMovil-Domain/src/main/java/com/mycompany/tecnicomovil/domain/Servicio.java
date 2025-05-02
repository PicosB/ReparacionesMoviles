/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tecnicomovil.domain;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
@Table (name = "Servicio")
public class Servicio implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idServicio")
    private Long id;
    
    @Column (name = "NombreServicio")
    private String nombreServicio;
    
    @Column (name = "EstadoServicio")
    private ESTADO_SERVICIO estadoServicio;
    
    @Column (name = "Precio")
    private float precio;
    
    @Column (name = "Invertido")
    private float cantInvertido;
    
    @Column (name = "FechaRegistro")
    private LocalDateTime fechaRegistro;
    
    @Column (name = "FechaTerminado")
    private LocalDateTime fechaTerminado;
    
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idTelefono", referencedColumnName = "idTelefono")
    private Telefono telefono;

    public Servicio() {
    }

    public Servicio(String nombreServicio, ESTADO_SERVICIO estadoServicio, float precio, float cantInvertido, LocalDateTime fechaRegistro, LocalDateTime fechaTerminado, Cliente cliente, Telefono telefono) {
        this.nombreServicio = nombreServicio;
        this.estadoServicio = estadoServicio;
        this.precio = precio;
        this.cantInvertido = cantInvertido;
        this.fechaRegistro = fechaRegistro;
        this.fechaTerminado = fechaTerminado;
        this.cliente = cliente;
        this.telefono = telefono;
    }

    public Servicio(Long id, String nombreServicio, ESTADO_SERVICIO estadoServicio, float precio, float cantInvertido, LocalDateTime fechaRegistro, LocalDateTime fechaTerminado, Cliente cliente, Telefono telefono) {
        this.id = id;
        this.nombreServicio = nombreServicio;
        this.estadoServicio = estadoServicio;
        this.precio = precio;
        this.cantInvertido = cantInvertido;
        this.fechaRegistro = fechaRegistro;
        this.fechaTerminado = fechaTerminado;
        this.cliente = cliente;
        this.telefono = telefono;
    }
        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public ESTADO_SERVICIO getEstadoServicio() {
        return estadoServicio;
    }

    public void setEstadoServicio(ESTADO_SERVICIO estadoServicio) {
        this.estadoServicio = estadoServicio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDateTime getFechaTerminado() {
        return fechaTerminado;
    }

    public void setFechaTerminado(LocalDateTime fechaTerminado) {
        this.fechaTerminado = fechaTerminado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public float getCantInvertido() {
        return cantInvertido;
    }

    public void setCantInvertido(float cantInvertido) {
        this.cantInvertido = cantInvertido;
    }        
}
