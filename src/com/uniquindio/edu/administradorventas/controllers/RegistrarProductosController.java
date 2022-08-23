/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.uniquindio.edu.administradorventas.controllers;

import com.uniquindio.edu.administradorventas.models.Cliente;
import com.uniquindio.edu.administradorventas.models.Empresa;
import com.uniquindio.edu.administradorventas.models.Producto;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class RegistrarProductosController implements Initializable {
    
    Empresa empresa;
    
    @FXML
    private TextField txtFieldCodigo;
    @FXML
    private TextField txtFieldNombre;
    @FXML
    private TextField txtFieldDescipcion;
    @FXML
    private TextField txtFieldCantidadExistencia;
    @FXML
    private TextField txtFieldValor;
    @FXML
    private TextField txtFieldFechaEnvasado;
    @FXML
    private TextField txtFieldPesoEnvase;
    @FXML
    private TextField txtFieldPais;
    @FXML
    private TextField txtFieldFechaVencimiento;
    @FXML
    private TextField txtFieldTemperatura;
    @FXML
    private TextField txtFieldCodigoAprobacion;
    @FXML
    private Button btnRegistrar;
    
    @FXML
    private void handleRegistrarProductoAction(ActionEvent event) throws IOException {
        Producto producto = new Producto(txtFieldCodigo.getText()
                , txtFieldNombre.getText(), txtFieldDescipcion.getText(), 
                Double.parseDouble(txtFieldValor.getText()), 
                Integer.parseInt(txtFieldCantidadExistencia.getText()));
        
        empresa.registrarProducto(producto);
        JOptionPane.showMessageDialog(null, "Producto registrado con exito !");
        resetFields();
    }
    
    private void resetFields(){
        txtFieldCodigo.setText("");
        txtFieldNombre.setText("");
        txtFieldDescipcion.setText("");
        txtFieldValor.setText(""); 
        txtFieldCantidadExistencia.setText("");
        txtFieldFechaEnvasado.setText("");
        txtFieldPesoEnvase.setText("");
        txtFieldPais.setText("");
        txtFieldFechaVencimiento.setText("");
        txtFieldTemperatura.setText("");
        txtFieldCodigoAprobacion.setText("");
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}