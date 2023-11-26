package com.bd.productos.service;

import java.util.List;

import com.bd.productos.modelo.ClassProductos;

public interface InterfaceProductoServicio {

	public List<ClassProductos> ListarProductos();
	public void RegistrarProducto(ClassProductos claprod);
	public void EliminarProducto(Integer id);
	public ClassProductos BuscarPorId(Integer id);
	
}
