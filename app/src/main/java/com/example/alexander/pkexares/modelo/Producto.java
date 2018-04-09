package com.example.alexander.pkexares.modelo;

public class Producto {
    public String NombreProducto;
    public Double PrecioProducto;
    public int CantidadProducto;
    public boolean box;

    public Producto(String _nombreProducto, double _precioProducto, int _cantidadProducto, boolean _box){
        this.NombreProducto = _nombreProducto;
        this.PrecioProducto = _precioProducto;
        this.CantidadProducto = _cantidadProducto;
        this.box = _box;
    }

}
