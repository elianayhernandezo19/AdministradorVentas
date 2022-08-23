/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniquindio.edu.administradorventas.models;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Venta {
    
    private String codigo;
    private String fecha;
    private ArrayList<DetalleVenta> detallesVenta;
    private Cliente cliente;
    private double total;
    private final double IVA_PERECEDEROS_REFRIGERADOS = 0.05;
    private final double IVA_ENVASADOS = 0.1;

    public Venta(String codigo, String fecha, ArrayList<DetalleVenta> detallesVenta, Cliente cliente, double total) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.detallesVenta = detallesVenta;
        this.cliente = cliente;
        this.total = total;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(ArrayList<DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
