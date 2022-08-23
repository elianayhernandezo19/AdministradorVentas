/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package com.uniquindio.edu.administradorventas.app;

import com.uniquindio.edu.administradorventas.controllers.MenuController;
import com.uniquindio.edu.administradorventas.models.Empresa;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class AdministradorVentas extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader (getClass().getResource("/views/Menu.fxml"));
        Parent root = loader.load();        
        Scene scene = new Scene(root);
        MenuController controller = loader.getController();
        controller.setEmpresa(new Empresa());
        stage.setTitle("Administrador de ventas");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
