package com.model;

public class Produs {
	
	private int id_produs;
	private String nume_produs;
	private int id_furnizor;
	private float pret_produs;
	private int cantitate_produs;
	
	public int getId_produs() {
		return id_produs;
	}
	public void setId_produs(int id_produs) {
		this.id_produs = id_produs;
	}
	public String getNume_produs() {
		return nume_produs;
	}
	public void setNume_produs(String nume_produs) {
		this.nume_produs = nume_produs;
	}
	public int getId_furnizor() {
		return id_furnizor;
	}
	public void setId_furnizor(int id_furnizor) {
		this.id_furnizor = id_furnizor;
	}
	public float getPret_produs() {
		return pret_produs;
	}
	public void setPret_produs(float pret_produs) {
		this.pret_produs = pret_produs;
	}
	public int getCantitate_produs() {
		return cantitate_produs;
	}
	public void setCantitate_produs(int cantitate_produs) {
		this.cantitate_produs = cantitate_produs;
	}
	
	public Produs() {
		// TODO Auto-generated constructor stub
	}
	
	public Produs(String name) {
		this.nume_produs=name;
	}
	
	public Produs(int id, String name, int id_provider, float p_product, int c_product) {
		this.id_produs=id;
		this.nume_produs=name;
		this.id_furnizor=id_provider;
		this.pret_produs=p_product;
		this.cantitate_produs=c_product;
	}
	
}
