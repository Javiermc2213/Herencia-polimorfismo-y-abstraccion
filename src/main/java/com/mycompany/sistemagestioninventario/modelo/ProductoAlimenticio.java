package com.mycompany.sistemagestioninventario.modelo;

import java.util.Date;
import com.mycompany.sistemagestioninventario.servicio.Proveedor;

public class ProductoAlimenticio extends Producto {
    private Date fechaDeCaducidad;

    public ProductoAlimenticio(String nombre, double precio, int cantidad, Proveedor proveedor, Date fechaDeCaducidad) {
        super(nombre, precio, cantidad, proveedor);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public Date getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    @Override
    public String getDetalles() {
        return "Producto Alimenticio: " + getNombre() + ", Precio: " + getPrecio() +
                ", Cantidad: " + getCantidad() + ", Fecha de Caducidad: " + fechaDeCaducidad;
    }
}
