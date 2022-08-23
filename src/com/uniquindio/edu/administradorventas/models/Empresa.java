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
public class Empresa {
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;
    private ArrayList<Venta> ventas;

    public Empresa() {
        clientes = new ArrayList<>();
        productos = new ArrayList<>();
        ventas = new ArrayList<>();
    }
    
    public void registrarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void registrarProducto(Producto producto){
        productos.add(producto);
    }
    
    public void registrarVenta(Venta venta){
        ventas.add(venta);
    }
    
    public boolean validarProducto(String codigoProducto, int cantidadProductos){
        boolean resultado = false;
        
        for (int i = 0; i < productos.size() && !resultado; i++) {
            if( productos.get(i).getCodigo().equals(codigoProducto) ){
                resultado = true;
            }
        }
        
        if(productos.size() < cantidadProductos){
            resultado = false;
        }
        
        return resultado;
    }
    
    public Producto buscarProducto (String idProducto){
        for (Producto producto : productos) {
            if(producto.getCodigo().equals(idProducto)){
                return producto;
            }
        }
        
        return null;
    }
    
    public Cliente buscarCliente (String codigoCliente){
        for (Cliente cliente : clientes) {
            if(cliente.getIdentificacion().equals(codigoCliente)){
                return cliente;
            }
        }
        
        return null;
    }
    
    
    public double calcularTotal(ArrayList<DetalleVenta> detallesVenta) {
        double total = 0;
        double  IVA = 0.19;
        
        for (int i = 0; i < detallesVenta.size(); i++) {
            DetalleVenta detalleVenta = detallesVenta.get(i);
            Producto producto = detalleVenta.getProducto();
            double precio = producto.getValor();
            
            total+= precio + precio*IVA;
        }
        
        return total;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
}
