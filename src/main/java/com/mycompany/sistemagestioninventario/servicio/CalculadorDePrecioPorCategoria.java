package com.mycompany.sistemagestioninventario.servicio;

import java.util.List;
import com.mycompany.sistemagestioninventario.modelo.Producto;
import com.mycompany.sistemagestioninventario.modelo.Categoria;

public class CalculadorDePrecioPorCategoria implements CalculadorDePrecio {
    private Categoria categoria;

    public CalculadorDePrecioPorCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            if (categoria.getProductos().contains(producto)) {
                total += producto.getPrecio() * producto.getCantidad();
            }
        }
        return total;
    }
}
