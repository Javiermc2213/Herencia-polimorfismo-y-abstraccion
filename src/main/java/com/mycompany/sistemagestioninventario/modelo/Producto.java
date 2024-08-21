package com.mycompany.sistemagestioninventario.modelo;

import com.mycompany.sistemagestioninventario.servicio.Proveedor;

public abstract class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private Proveedor proveedor;

    public Producto(String nombre, double precio, int cantidad, Proveedor proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public abstract String getDetalles();
}
