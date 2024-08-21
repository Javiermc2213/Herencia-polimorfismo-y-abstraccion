package com.mycompany.sistemagestioninventario.servicio;

import java.util.List;
import com.mycompany.sistemagestioninventario.modelo.Producto;

public interface CalculadorDePrecio {
    double calcularPrecioTotal(List<Producto> productos);
}
