package com.mycompany.sistemagestioninventario.servicio;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.sistemagestioninventario.modelo.Producto;

public class Proveedor {
    private String nombre;
    private List<Producto> productos;

    public Proveedor(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
}
