package com.mycompany.sistemagestioninventario.principal;

import com.mycompany.sistemagestioninventario.modelo.*;
import com.mycompany.sistemagestioninventario.servicio.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Crear Proveedores
        Proveedor proveedor1 = new Proveedor("Proveedor 1");
        Proveedor proveedor2 = new Proveedor("Proveedor 2");

        // Crear Categorías
        Categoria electronica = new Categoria("Electrónica");
        Categoria alimenticia = new Categoria("Alimenticia");

        // Crear Productos
        Producto prod1 = new ProductoElectronico("Laptop", 1000, 5, proveedor1, 24);
        Producto prod2 = new ProductoAlimenticio("Manzanas", 2, 50, proveedor2, new Date());

        // Asignar productos a proveedores y categorías
        proveedor1.agregarProducto(prod1);
        proveedor2.agregarProducto(prod2);

        electronica.agregarProducto(prod1);
        alimenticia.agregarProducto(prod2);

        // Crear lista de productos
        List<Producto> productos = new ArrayList<>();
        productos.add(prod1);
        productos.add(prod2);

        // Calcular precio total con descuento
        CalculadorDePrecio calculadorConDescuento = new CalculadorDePrecioConDescuento(0.1);
        double totalConDescuento = calculadorConDescuento.calcularPrecioTotal(productos);

        // Calcular precio total sin descuento
        CalculadorDePrecio calculadorSinDescuento = new CalculadorDePrecioSinDescuento();
        double totalSinDescuento = calculadorSinDescuento.calcularPrecioTotal(productos);

        // Calcular precio por categoría
        CalculadorDePrecio calculadorPorCategoria = new CalculadorDePrecioPorCategoria(electronica);
        double totalPorCategoria = calculadorPorCategoria.calcularPrecioTotal(productos);

               // Imprimir resultados
        System.out.println("Precio Total con Descuento: " + totalConDescuento);
        System.out.println("Precio Total sin Descuento: " + totalSinDescuento);
        System.out.println("Precio Total por Categoría (Electrónica): " + totalPorCategoria);
    }
}
