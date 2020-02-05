package com.model;

public class Departament {
	
	private int id_departament;
	private String nume_departament;
	private String etaj_departament;
	private int numar_aparate;
	private int capacitate_departament;
	
	public int getId_departament() {
		return id_departament;
	}
	public void setId_departament(int id_departament) {
		this.id_departament = id_departament;
	}
	public String getNume_departament() {
		return nume_departament;
	}
	public void setNume_departament(String nume_departament) {
		this.nume_departament = nume_departament;
	}
	public String getEtaj_departament() {
		return etaj_departament;
	}
	public void setEtaj_departament(String etaj_departament) {
		this.etaj_departament = etaj_departament;
	}
	public int getNumar_aparate() {
		return numar_aparate;
	}
	public void setNumar_aparate(int numar_aparate) {
		this.numar_aparate = numar_aparate;
	}
	public int getCapacitate_departament() {
		return capacitate_departament;
	}
	public void setCapacitate_departament(int capacitate_departament) {
		this.capacitate_departament = capacitate_departament;
	}
	
	public Departament() {
		
	}
	
	public Departament(String name) {
		this.nume_departament=name;
	}
	
	public Departament(int id,String name,String etaj, int numberOfEquipment,int capacity) {
		this.id_departament=id;
		this.nume_departament=name;
		this.etaj_departament=etaj;
		this.numar_aparate=numberOfEquipment;
		this.capacitate_departament=capacity;
	}
}
