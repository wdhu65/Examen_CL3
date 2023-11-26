package com.bd.productos.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.productos.modelo.ClassProductos;
import com.bd.productos.service.InterfaceProductoServicio;

@Controller
@RequestMapping("/ControlProducto")
public class ProductosController {

	@Autowired
	private InterfaceProductoServicio iprodservicio;
	
	@GetMapping("/ListadoProductos")
	public String ListadoProductos(Model modelo) {
		List<ClassProductos> listar = iprodservicio.ListarProductos();
		System.out.println(listar);
		modelo.addAttribute("listadoproducto", listar);
		return "Vistas/Producto/ListadoProductos";
	}
	
	@GetMapping("/Registrar")
	public String RegistrarProducto(Model modelo) {
		ClassProductos classprod = new ClassProductos();
		modelo.addAttribute("regprod", classprod);
		return "Vistas/Producto/FrmRegistrarProducto";
	}
	
	@PostMapping("/Guardar")
	public String GuardarAuto(@ModelAttribute ClassProductos claprod) {
		iprodservicio.RegistrarProducto(claprod);
		return "redirect:/ControlProducto/ListadoProductos";
	}

	@GetMapping("/Editar/{id}")
	public String Editar(@PathVariable("id") Integer idprod, Model modelo) {
		ClassProductos classprod = iprodservicio.BuscarPorId(idprod);
		modelo.addAttribute("regprod", classprod);
		return "Vistas/Producto/FrmRegistrarProducto";
	}
	
	@GetMapping("/Eliminar/{id}")
	public String Eliminar(@PathVariable("id") Integer idprod, Model modelo) {
		iprodservicio.EliminarProducto(idprod);
		List<ClassProductos> listado = iprodservicio.ListarProductos();
		modelo.addAttribute("listadoproducto", listado);
		return "redirect:/ControlProducto/ListadoProductos";
	}
	
}
