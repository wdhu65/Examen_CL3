package com.bd.productos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_productocl3")
public class ClassProductos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproductocl3;
	private String nombrecl3;
	private double preciocl3;
	private double precioVentacl3;
	private String estadocl3;
	private String descripcl3;
	private String stockcl3;

	public int getIdproductocl3() {
		return idproductocl3;
	}

	public void setIdproductocl3(int idproductocl3) {
		this.idproductocl3 = idproductocl3;
	}

	public String getNombrecl3() {
		return nombrecl3;
	}

	public void setNombrecl3(String nombrecl3) {
		this.nombrecl3 = nombrecl3;
	}

	public double getPreciocl3() {
		return preciocl3;
	}

	public void setPreciocl3(double preciocl3) {
		this.preciocl3 = preciocl3;
	}

	public double getPrecioVentacl3() {
		return precioVentacl3;
	}

	public void setPrecioVentacl3(double precioVentacl3) {
		this.precioVentacl3 = precioVentacl3;
	}

	public String getEstadocl3() {
		return estadocl3;
	}

	public void setEstadocl3(String estadocl3) {
		this.estadocl3 = estadocl3;
	}

	public String getDescripcl3() {
		return descripcl3;
	}

	public void setDescripcl3(String descripcl3) {
		this.descripcl3 = descripcl3;
	}

	public String getStockcl3() {
		return stockcl3;
	}

	public void setStockcl3(String stockcl3) {
		this.stockcl3 = stockcl3;
	}
	
	
}