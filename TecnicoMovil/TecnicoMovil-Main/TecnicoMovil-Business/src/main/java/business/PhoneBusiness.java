/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import com.mycompany.tecnicomovil.domain.Telefono;
import com.mycompany.tecnicomovil.persistence.TelefonoJpaController;

/**
 *
 * @author PC
 */
public class PhoneBusiness {
    TelefonoJpaController telJPA = new TelefonoJpaController();
    
    //Crear Telefono
    public Telefono crearTelefono(Telefono telefono){
        return telJPA.create(telefono);
    }
}
