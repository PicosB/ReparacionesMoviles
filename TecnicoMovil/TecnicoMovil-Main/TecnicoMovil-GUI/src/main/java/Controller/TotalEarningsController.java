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
import javafx.scene.control.DatePicker;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class TotalEarningsController implements Initializable {

    @FXML
    private Button btnHoy;
    @FXML
    private Button btnPeriodo;
    @FXML
    private Text txtDesde;
    @FXML
    private DatePicker txtDesdeFecha;
    @FXML
    private Text txtHasta;
    @FXML
    private DatePicker txtHastaFecha;
    @FXML
    private Button btnAceptar;
    @FXML
    private Button btnRealizarReporte;
    @FXML
    private Text txtIngresosTotales;
    @FXML
    private Text txtEgresosTotales;
    @FXML
    private Text txtGananciasNeta;
    @FXML
    private ImageView btnAtras;
    
    MainPageController mainPageController;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtDesde.setVisible(false);
        txtDesdeFecha.setVisible(false);
        txtHasta.setVisible(false);
        txtHastaFecha.setVisible(false);
        btnAceptar.setVisible(false);
    }
    
    public void setMainPage(MainPageController mainPageController) {
        this.mainPageController = mainPageController;
    }

    public Button getBtnHoy() {
        return btnHoy;
    }

    public void setBtnHoy(Button btnHoy) {
        this.btnHoy = btnHoy;
    }

    public Button getBtnPeriodo() {
        return btnPeriodo;
    }

    public void setBtnPeriodo(Button btnPeriodo) {
        this.btnPeriodo = btnPeriodo;
    }

    public Text getTxtDesde() {
        return txtDesde;
    }

    public void setTxtDesde(Text txtDesde) {
        this.txtDesde = txtDesde;
    }

    public DatePicker getTxtDesdeFecha() {
        return txtDesdeFecha;
    }

    public void setTxtDesdeFecha(DatePicker txtDesdeFecha) {
        this.txtDesdeFecha = txtDesdeFecha;
    }

    public Text getTxtHasta() {
        return txtHasta;
    }

    public void setTxtHasta(Text txtHasta) {
        this.txtHasta = txtHasta;
    }

    public DatePicker getTxtHastaFecha() {
        return txtHastaFecha;
    }

    public void setTxtHastaFecha(DatePicker txtHastaFecha) {
        this.txtHastaFecha = txtHastaFecha;
    }

    public Button getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(Button btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public Button getBtnRealizarReporte() {
        return btnRealizarReporte;
    }

    public void setBtnRealizarReporte(Button btnRealizarReporte) {
        this.btnRealizarReporte = btnRealizarReporte;
    }

    public Text getTxtIngresosTotales() {
        return txtIngresosTotales;
    }

    public void setTxtIngresosTotales(Text txtIngresosTotales) {
        this.txtIngresosTotales = txtIngresosTotales;
    }

    public Text getTxtEgresosTotales() {
        return txtEgresosTotales;
    }

    public void setTxtEgresosTotales(Text txtEgresosTotales) {
        this.txtEgresosTotales = txtEgresosTotales;
    }

    public Text getTxtGananciasNeta() {
        return txtGananciasNeta;
    }

    public void setTxtGananciasNeta(Text txtGananciasNeta) {
        this.txtGananciasNeta = txtGananciasNeta;
    }

    public ImageView getBtnAtras() {
        return btnAtras;
    }

    public void setBtnAtras(ImageView btnAtras) {
        this.btnAtras = btnAtras;
    }

    

    @FXML
    private void optionGananciasHoy(MouseEvent event) {
        setButtonSelected(btnHoy);
        setButtonUnselected(btnPeriodo);
        txtDesde.setVisible(false);
        txtDesdeFecha.setVisible(false);
        txtHasta.setVisible(false);
        txtHastaFecha.setVisible(false);
        btnAceptar.setVisible(false);
    }

    @FXML
    private void optionPeriodo(MouseEvent event) {
        setButtonSelected(btnPeriodo);
        setButtonUnselected(btnHoy);
        txtDesde.setVisible(true);
        txtDesdeFecha.setVisible(true);
        txtHasta.setVisible(true);
        txtHastaFecha.setVisible(true);
        btnAceptar.setVisible(true);
        
    }

    @FXML
    private void optionAceptar(MouseEvent event) {
    }

    @FXML
    private void optionRealizarReporte(MouseEvent event) {
    }

    @FXML
    private void optionRegresar(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainPage.fxml"));
            Parent root = loader.load();
            
            Stage currentStage = (Stage) btnAceptar.getScene().getWindow();
            currentStage.setScene(new Scene(root));
            currentStage.show();
        } catch (IOException ex) {
             Logger.getLogger(MainPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setButtonSelected(Button button) {
        button.setStyle("-fx-background-color: #414141; -fx-text-fill: white; -fx-background-radius: 15;");
    }

    private void setButtonUnselected(Button button) {
        button.setStyle("-fx-background-color: #D9D9D9; -fx-text-fill: black; -fx-background-radius: 15;");
    }
    
}
