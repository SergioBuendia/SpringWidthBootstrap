package com.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.entity.Client;
import com.app.entity.Logistica;
import com.app.repo.ClientRepo;
import com.app.repo.LogisticaRepo;

@Controller
public class LogisticaController {
	
	@Autowired
	private LogisticaRepo repo;
	
	@Autowired
	private ClientRepo repoC;
	
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("productslist", repo.findAll());
		
		return "home";
	}
	
	@GetMapping("/saveLogisticaPage")
	public String saveLogisticaPage(Model model) {
		Logistica logistica = new Logistica();
		model.addAttribute("product", logistica);
		
		return "add_product";
	}
	
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product") Logistica logistica) {
		repo.save(logistica);
		return "redirect:/";
	}
	
	
	@GetMapping("/client")
	public String clientPage(Model model) {
		model.addAttribute("clientlist", repoC.findAll());
		
		return "client";
	}
	
	@GetMapping("/saveClientPage")
	public String saveClientPage(Model model) {
		Client client = new Client();
		model.addAttribute("client", client);
		
		return "add_client";
	}
	
	@PostMapping("/saveClient")
	public String saveClient(@ModelAttribute("client") Client client) {
		repoC.save(client);
		return "redirect:/";
	}
	
	@GetMapping("/updateProductPage/{id}")
	public String showUpdateProductPage(@PathVariable("id") int id, Model model) {
		Optional<Logistica> temp = repo.findById(id);
		Logistica logistica = temp.get();
		model.addAttribute("product", logistica);
		return "update_product";
	}
	
	
	
	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		// A parte de esta solución se podría hacer un modal 
		// para verificar si el usuario realmente quiere eliminar
		repo.deleteById(id);
		return "redirect:/";
	}
	
	//Primero Verificamos si cumple que tiene mas de 10 productos
	public Double getOffer()
	{
		double descuentos = 0;
		Logistica logistica = null;
		
		if((logistica.getProductquantity()) > 10 ) {
			descuentos = logistica.getDeliverprice() * 0.05;
		}
		
		return descuentos;
	}
	
	// Luego sacamos el calculo total menos el descuento
	public Double ActualDeliveryCost(double descuento)
	{
		Logistica logistica = null;
		double actual = 0;
		actual = logistica.getDeliverprice() - descuento;
		return actual;
	}

}
