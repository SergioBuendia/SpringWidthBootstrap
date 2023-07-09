package com.app.entity;


import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="clientsdb")
@AllArgsConstructor
@Data
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int clientid;
	
	private String clientname;
	private String clientdui;
	private String clientphone;
	private String clientproducts;
	private String clientwarehouse;
	
	public Client(String clientname, String clientdui, String clientphone, String clientproducts,
			String clientwarehouse) {
		super();
		this.clientname = clientname;
		this.clientdui = clientdui;
		this.clientphone = clientphone;
		this.clientproducts = clientproducts;
		this.clientwarehouse = clientwarehouse;
	}
	
	public Client() {
		super();
	}
	
	public int getClientid() {
		return clientid;
	}
	public void setClientid(int clientid) {
		this.clientid = clientid;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getClientdui() {
		return clientdui;
	}
	public void setClientdui(String clientdui) {
		this.clientdui = clientdui;
	}
	public String getClientphone() {
		return clientphone;
	}
	public void setClientphone(String clientphone) {
		this.clientphone = clientphone;
	}
	public String getClientproducts() {
		return clientproducts;
	}
	public void setClientproducts(String clientproducts) {
		this.clientproducts = clientproducts;
	}
	public String getClientwarehouse() {
		return clientwarehouse;
	}
	public void setClientwarehouse(String clientwarehouse) {
		this.clientwarehouse = clientwarehouse;
	}
}
