/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.uniquindio.edu.administradorventas.controllers;

import com.uniquindio.edu.administradorventas.models.Cliente;
import com.uniquindio.edu.administradorventas.models.Empresa;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class RegistrarClientesController implements Initializable {
    
    Empresa empresa;
    
    @FXML
    private Label lblNombre;
    @FXML
    private Label lblApellidos;
    @FXML
    private Label lblIdentificacion;
    @FXML
    private Label lblTelefono;
    @FXML
    private Label lblDireccion;
    @FXML
    private Label lblEmail;
    @FXML
    private Label lblNacimiento;
    @FXML
    private Label lblNit;
    @FXML
    private TextField txtFieldNombre;
    @FXML
    private TextField txtFieldApellidos;
    @FXML
    private TextField txtFieldIdentificacion;
    @FXML
    private TextField txtFieldTelefono;
    @FXML
    private TextField txtFieldDireccion;
    @FXML
    private TextField txtFieldEmail;
    @FXML
    private TextField txtFieldFechaNacimiento;
    @FXML
    private TextField txtFieldNit;
    @FXML
    private CheckBox checkBoxPersona;
     
    @FXML
    private Button registrar;
    
    @FXML
    private void handleRegistrarClienteAction(ActionEvent event) throws IOException {
        Cliente cliente = new Cliente(txtFieldNombre.getText(),
                txtFieldApellidos.getText(), txtFieldIdentificacion.getText(),
                txtFieldDireccion.getText(), txtFieldDireccion.getText());
        
        if(checkBoxPersona.isPressed()){
            cliente.setEmail(txtFieldEmail.getText());
            cliente.setFechaNacimiento(txtFieldFechaNacimiento.getText());
        }else{
            cliente.setNit(txtFieldNit.getText());
        }
        
        empresa.registrarCliente(cliente);
        JOptionPane.showMessageDialog(null, "Cliente registrado con exito !");
        resetFields();
    }
    
    private void resetFields(){
        txtFieldNombre.setText("");
        txtFieldApellidos.setText("");
        txtFieldIdentificacion.setText("");
        txtFieldDireccion.setText("");
        txtFieldDireccion.setText("");
        txtFieldEmail.setText("");
        txtFieldFechaNacimiento.setText("");
        txtFieldNit.setText("");
        txtFieldTelefono.setText("");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
