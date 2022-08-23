/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniquindio.edu.administradorventas.models;

/**
 *
 * @author Usuario
 */
public class DetalleVenta {
    
    private Producto producto;
    private int Cantidad;

    public DetalleVenta(Producto producto, int Cantidad) {
        this.producto = producto;
        this.Cantidad = Cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
}
