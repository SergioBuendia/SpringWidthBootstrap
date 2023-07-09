package com.app.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="productsdb")
@AllArgsConstructor
@Data
public class Logistica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productid;
	
	private String producttype;
	private Double productquantity;
	// Como en este mismo día se harán las pruebas
	// Se ingresará la fecha como String, 
	// Pero se puede mejorar con un Timestamp 
	// Para las fechas que se ingresen en el momento 
	//private Timestamp fechaderegistro;
	private String registerdate;
	private String deliverdate;
	private String warehouse;
	private Double deliverprice;
	private String vehicleplate;
	private String guidenumber;
	
	//Constructor con parametros
	public Logistica(String producttype, Double productquantity, String registerdate, String deliverdate,
			String warehouse, Double deliverprice, String vehicleplate, String guidenumber) {
		super();
		this.producttype = producttype;
		this.productquantity = productquantity;
		this.registerdate = registerdate;
		this.deliverdate = deliverdate;
		this.warehouse = warehouse;
		this.deliverprice = deliverprice;
		this.vehicleplate = vehicleplate;
		this.guidenumber = guidenumber;
	}
	
	//Constructor vacio
	public Logistica() {
		super();
	}
	
	//Getters y Setters
	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProducttype() {
		return producttype;
	}

	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}

	public Double getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(Double productquantity) {
		this.productquantity = productquantity;
	}

	public String getRegisterdate() {
		return registerdate;
	}

	public void setRegisterdate(String registerdate) {
		this.registerdate = registerdate;
	}

	public String getDeliverdate() {
		return deliverdate;
	}

	public void setDeliverdate(String deliverdate) {
		this.deliverdate = deliverdate;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public Double getDeliverprice() {
		return deliverprice;
	}

	public void setDeliverprice(Double deliverprice) {
		this.deliverprice = deliverprice;
	}

	public String getVehicleplate() {
		return vehicleplate;
	}

	public void setVehicleplate(String vehicleplate) {
		this.vehicleplate = vehicleplate;
	}

	public String getGuidenumber() {
		return guidenumber;
	}

	public void setGuidenumber(String guidenumber) {
		this.guidenumber = guidenumber;
	}
}
