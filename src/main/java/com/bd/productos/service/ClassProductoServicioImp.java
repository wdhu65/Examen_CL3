package com.bd.productos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.productos.modelo.ClassProductos;
import com.bd.productos.repositorio.*;

@Service
public class ClassProductoServicioImp implements InterfaceProductoServicio{
	
	@Autowired
	private InterfaceProducto iproductorepository;

	@Override
	public List<ClassProductos> ListarProductos() {
		return (List<ClassProductos>) iproductorepository.findAll();
	}

	@Override
	public void RegistrarProducto(ClassProductos claprod) {
		iproductorepository.save(claprod);		
	}

	@Override
	public void EliminarProducto(Integer id) {
		iproductorepository.deleteById(id);		
	}

	@Override
	public ClassProductos BuscarPorId(Integer id) {
		return iproductorepository.findById(id).orElse(null);
	}
	
}
