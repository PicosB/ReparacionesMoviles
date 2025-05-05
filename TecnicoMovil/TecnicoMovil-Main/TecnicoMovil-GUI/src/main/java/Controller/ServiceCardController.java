/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class ServiceCardController implements Initializable {

    @FXML
    private Text txtNombreCliente;
    @FXML
    private Text txtNumeroTel;
    @FXML
    private Text txtMarca;
    @FXML
    private Text txtModelo;
    @FXML
    private Circle circuloEstado;
    @FXML
    private Text txtEstado;
    @FXML
    private Text txtNombreServicio;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public Text getTxtNombreCliente() {
        return txtNombreCliente;
    }

    public void setTxtNombreCliente(Text txtNombreCliente) {
        this.txtNombreCliente = txtNombreCliente;
    }

    public Text getTxtNumeroTel() {
        return txtNumeroTel;
    }

    public void setTxtNumeroTel(Text txtNumeroTel) {
        this.txtNumeroTel = txtNumeroTel;
    }

    public Text getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(Text txtMarca) {
        this.txtMarca = txtMarca;
    }

    public Text getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(Text txtModelo) {
        this.txtModelo = txtModelo;
    }

    public Circle getCirculoEstado() {
        return circuloEstado;
    }

    public void setCirculoEstado(Circle circuloEstado) {
        this.circuloEstado = circuloEstado;
    }

    public Text getTxtEstado() {
        return txtEstado;
    }

    public void setTxtEstado(Text txtEstado) {
        this.txtEstado = txtEstado;
    }

    public Text getTxtNombreServicio() {
        return txtNombreServicio;
    }

    public void setTxtNombreServicio(Text txtNombreServicio) {
        this.txtNombreServicio = txtNombreServicio;
    }
    
    
    
}
