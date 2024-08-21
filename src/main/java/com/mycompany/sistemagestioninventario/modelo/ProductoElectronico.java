package com.mycompany.sistemagestioninventario.modelo;

import com.mycompany.sistemagestioninventario.servicio.Proveedor;

public class ProductoElectronico extends Producto {
    private int garantia; // En meses

    public ProductoElectronico(String nombre, double precio, int cantidad, Proveedor proveedor, int garantia) {
        super(nombre, precio, cantidad, proveedor);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    @Override
    public String getDetalles() {
        return "Producto Electrónico: " + getNombre() + ", Precio: " + getPrecio() +
                ", Cantidad: " + getCantidad() + ", Garantía: " + garantia + " meses";
    }
}
