/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class CreateServiceController implements Initializable {

    @FXML
    private Button btnNuevoServicio;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtNumTelefono;
    @FXML
    private TextField txtMarca;
    @FXML
    private TextField txtModelo;
    @FXML
    private TextField txtImei;
    @FXML
    private TextField txtNombreServicio;
    @FXML
    private TextField txtPrecio;
    @FXML
    private TextField txtDetalles;
    @FXML
    private Button btnCancelar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public Button getBtnNuevoServicio() {
        return btnNuevoServicio;
    }

    public void setBtnNuevoServicio(Button btnNuevoServicio) {
        this.btnNuevoServicio = btnNuevoServicio;
    }

    public TextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(TextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public TextField getTxtNumTelefono() {
        return txtNumTelefono;
    }

    public void setTxtNumTelefono(TextField txtNumTelefono) {
        this.txtNumTelefono = txtNumTelefono;
    }

    public TextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(TextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public TextField getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(TextField txtModelo) {
        this.txtModelo = txtModelo;
    }

    public TextField getTxtImei() {
        return txtImei;
    }

    public void setTxtImei(TextField txtImei) {
        this.txtImei = txtImei;
    }

    public TextField getTxtNombreServicio() {
        return txtNombreServicio;
    }

    public void setTxtNombreServicio(TextField txtNombreServicio) {
        this.txtNombreServicio = txtNombreServicio;
    }

    public TextField getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(TextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

    public TextField getTxtDetalles() {
        return txtDetalles;
    }

    public void setTxtDetalles(TextField txtDetalles) {
        this.txtDetalles = txtDetalles;
    }

    public Button getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(Button btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    @FXML
    private void optionNuevoServicio(MouseEvent event) {
    }

    @FXML
    private void optionCancelar(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ManagementServices.fxml"));
            Parent root = loader.load();
            
            Stage currentStage = (Stage) btnNuevoServicio.getScene().getWindow();
            currentStage.setScene(new Scene(root));
            currentStage.show();
        } catch (IOException ex) {
             Logger.getLogger(MainPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
