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
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class ManagementServicesController implements Initializable {
    
    @FXML
    private ImageView btnAtras;
    @FXML
    private Button btnActivos;
    @FXML
    private Button btnHistorial;
    
    MainPageController mainPageController;
    
    @FXML
    private ScrollPane scrollPane;
    @FXML
    private VBox servicesContainer;
    @FXML
    private Button btnNuevoServicio;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setMainPage(MainPageController mainPageController) {
        this.mainPageController = mainPageController;
    }

    private void setButtonSelected(Button button) {
        button.setStyle("-fx-background-color: #414141; -fx-text-fill: white; -fx-background-radius: 15;");
    }

    private void setButtonUnselected(Button button) {
        button.setStyle("-fx-background-color: #D9D9D9; -fx-text-fill: black; -fx-background-radius: 15;");
    }

    @FXML
    private void optionServiciosActivos(MouseEvent event) {
        setButtonSelected(btnActivos);
        setButtonUnselected(btnHistorial);
    }

    @FXML
    private void optionHistorialServicios(MouseEvent event) {
        setButtonSelected(btnHistorial);
        setButtonUnselected(btnActivos);
    }

    @FXML
    private void optionRegresar(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainPage.fxml"));
            Parent root = loader.load();
            
            Stage currentStage = (Stage) btnActivos.getScene().getWindow();
            currentStage.setScene(new Scene(root));
            currentStage.show();
        } catch (IOException ex) {
            Logger.getLogger(MainPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void optionNuevoServicio(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CreateService.fxml"));
            Parent root = loader.load();
            
            Stage currentStage = (Stage) btnActivos.getScene().getWindow();
            currentStage.setScene(new Scene(root));
            currentStage.show();
        } catch (IOException ex) {
            Logger.getLogger(MainPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
