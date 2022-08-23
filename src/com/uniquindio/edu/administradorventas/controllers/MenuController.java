/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package com.uniquindio.edu.administradorventas.controllers;

import com.uniquindio.edu.administradorventas.models.Empresa;
import com.uniquindio.edu.administradorventas.controllers.RegistrarClientesController;
import com.uniquindio.edu.administradorventas.controllers.RegistrarProductosController;
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
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class MenuController implements Initializable {
    
    Empresa empresa;
    
    @FXML
    private void handleRegistrarClientesAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader (getClass().getResource("/views/RegistrarClientes.fxml"));
        Parent root = loader.load();
        RegistrarClientesController registrarClientes = loader.getController();
        registrarClientes.setEmpresa(empresa);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.setTitle("Registrar Clientes");
        stage.showAndWait();
    }
    
    @FXML
    private void handleRegistrarProductosAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader (getClass().getResource("/views/RegistrarProductos.fxml"));
        Parent root = loader.load();
        RegistrarProductosController registrarProductos = loader.getController();
        registrarProductos.setEmpresa(empresa);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.setTitle("Registrar Productos");
        stage.showAndWait();
    }
    
    @FXML
    private void handleRegistrarVentasAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader (getClass().getResource("/views/RegistrarVentas.fxml"));
        Parent root = loader.load();
        RegistrarVentasController registrarVentas = loader.getController();
        registrarVentas.setEmpresa(empresa);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.setTitle("Registrar Ventas");
        stage.showAndWait();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
