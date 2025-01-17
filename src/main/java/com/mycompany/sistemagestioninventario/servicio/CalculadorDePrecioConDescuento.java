package com.mycompany.sistemagestioninventario.servicio;

import java.util.List;
import com.mycompany.sistemagestioninventario.modelo.Producto;

public class CalculadorDePrecioConDescuento implements CalculadorDePrecio {
    private double descuento;

    public CalculadorDePrecioConDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total * (1 - descuento);
    }
}
