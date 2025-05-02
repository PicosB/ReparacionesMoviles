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
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class MainPageController implements Initializable {

    @FXML
    private Rectangle btnGestionServicios;
    @FXML
    private Rectangle btnGananciasTotales;
    @FXML
    private Rectangle btnClientes;
    @FXML
    private Text txtNPendientes;
    @FXML
    private Text txtNRealizados;
    @FXML
    private Text txtNPagados;
    @FXML
    private Text txtEntradasTotales;
    @FXML
    private Text txtSalidasTotales;
    @FXML
    private Text txtGananciaNeta;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void optionGestionServicios(MouseEvent event) {
        loadPage("ManagementServices");
    }

    @FXML
    private void optionGananciasTotales(MouseEvent event) {
        loadPage("TotalEarnings");
    }

    @FXML
    private void optionVerClientes(MouseEvent event) {
        loadPage("Customers");
    }
    
    @FXML
    public void loadPage(String namePage){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/" + namePage + ".fxml"));
            Parent root = loader.load();           
            if(namePage.equals("ManagementServices")){
                ManagementServicesController controller = loader.getController();
                controller.setMainPage(this);
                
                Stage currentStage = (Stage) btnGestionServicios.getScene().getWindow();
                currentStage.setScene(new Scene(root));
                currentStage.show();
            }else if(namePage.equals("TotalEarnings")){
                TotalEarningsController controller = loader.getController();
                controller.setMainPage(this);
                
                Stage currentStage = (Stage) btnGananciasTotales.getScene().getWindow();
                currentStage.setScene(new Scene(root));
                currentStage.show();
            }  
            
        } catch (IOException ex) {
            Logger.getLogger(MainPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
