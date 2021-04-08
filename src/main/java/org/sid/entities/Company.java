package org.sid.entities;

import javax.persistence.*;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private double price;
	
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(Long id, String nom, double price) {
		super();
		this.id = id;
		this.nom = nom;
		this.price = price;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", nom=" + nom + ", price=" + price + "]";
	}

}
