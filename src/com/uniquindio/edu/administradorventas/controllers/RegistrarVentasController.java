/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.uniquindio.edu.administradorventas.controllers;

import com.uniquindio.edu.administradorventas.models.Cliente;
import com.uniquindio.edu.administradorventas.models.DetalleVenta;
import com.uniquindio.edu.administradorventas.models.Empresa;
import com.uniquindio.edu.administradorventas.models.Producto;
import com.uniquindio.edu.administradorventas.models.Venta;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class RegistrarVentasController implements Initializable {

    Empresa empresa;
    
    ArrayList<DetalleVenta> detallesVenta = new ArrayList<>();
    
    @FXML
    private TextField txtFieldCodigo;
    @FXML
    private TextField txtFieldFecha;
    @FXML
    private TextField txtFieldCodigoCliente;
    @FXML
    private TextField txtFieldIdProducto;
    @FXML
    private TextField txtFieldCantidadProductos;
    @FXML
    private Label lblTotal;
    
    @FXML
    private void handleRegistrarVentaAction(ActionEvent event) throws IOException {
        
        Cliente cliente = empresa.buscarCliente(txtFieldCodigoCliente.getText());
        double total = empresa.calcularTotal(detallesVenta);
        
        Venta venta = new Venta(txtFieldCodigo.getText(),
                txtFieldFecha.getText(), detallesVenta, cliente, total);
        
        lblTotal.setText(""+total);
        JOptionPane.showMessageDialog(null, "La venta se registro exitosamente !");
        detallesVenta = new ArrayList<>();
        resetFields();
    }
    
    @FXML
    private void handleAgregarProductoAction(ActionEvent event) throws IOException {
        String codigoProducto = txtFieldIdProducto.getText();
        int cantidadProductos = Integer.parseInt(txtFieldCantidadProductos.getText());
        Producto producto = empresa.buscarProducto(codigoProducto);
        
        boolean validacion = empresa.validarProducto(codigoProducto, cantidadProductos);
        
        if(validacion){
            DetalleVenta detalleVenta = new DetalleVenta(producto, cantidadProductos);
            detallesVenta.add(detalleVenta);
            resetFieldsProducto();
        }else{
            JOptionPane.showMessageDialog(null, "Por favor valide la cantidad o el código del producto !");
        }
    }
    
    private void resetFields(){
        txtFieldCodigo.setText("");
        txtFieldFecha.setText("");
        txtFieldCodigoCliente.setText("");
        txtFieldIdProducto.setText("");
        txtFieldCantidadProductos.setText("");
    }
    
    private void resetFieldsProducto(){
        txtFieldIdProducto.setText("");
        txtFieldCantidadProductos.setText("");
    }
    
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}
