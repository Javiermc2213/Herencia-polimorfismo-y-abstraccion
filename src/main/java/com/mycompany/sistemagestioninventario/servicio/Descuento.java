package com.mycompany.sistemagestioninventario.servicio;

import com.mycompany.sistemagestioninventario.modelo.Producto;

public class Descuento {
    private double porcentaje;

    public Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double aplicarDescuento(Producto producto) {
        return producto.getPrecio() * (1 - porcentaje);
    }
}
