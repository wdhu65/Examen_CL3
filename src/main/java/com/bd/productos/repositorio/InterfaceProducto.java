package com.bd.productos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bd.productos.modelo.ClassProductos;

@Repository

public interface InterfaceProducto extends JpaRepository<ClassProductos, Integer> {

}
