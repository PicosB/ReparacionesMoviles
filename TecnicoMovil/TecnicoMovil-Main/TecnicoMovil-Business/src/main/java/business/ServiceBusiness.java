/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import com.mycompany.tecnicomovil.domain.Servicio;
import com.mycompany.tecnicomovil.persistence.ServicioJpaController;

/**
 *
 * @author PC
 */
public class ServiceBusiness {
    ServicioJpaController serJPA = new ServicioJpaController();
    
    //Crear Servicio
    public Servicio crearServicio(Servicio servicio){
        return serJPA.create(servicio);
    }
}
