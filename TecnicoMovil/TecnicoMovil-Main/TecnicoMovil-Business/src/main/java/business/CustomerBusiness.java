/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import com.mycompany.tecnicomovil.domain.Cliente;
import com.mycompany.tecnicomovil.persistence.ClienteJpaController;

/**
 *
 * @author PC
 */
public class CustomerBusiness {
    ClienteJpaController cliJPA = new ClienteJpaController();
    
    //Crear Cliente
    public Cliente crearCliente(Cliente cliente){
        return cliJPA.create(cliente);
    }
}
