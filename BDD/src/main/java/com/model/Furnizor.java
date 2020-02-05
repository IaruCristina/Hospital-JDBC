package com.model;

public class Furnizor {
	
	private int id_furnizor;
	private int id_angajat;
	private String nume_furnizor;
	private String adresa_furnizor;
	private String nr_telefon_furnizor;
	
	public int getId_furnizor() {
		return id_furnizor;
	}
	public void setId_furnizor(int id_furnizor) {
		this.id_furnizor = id_furnizor;
	}
	public int getId_angajat() {
		return id_angajat;
	}
	public void setId_angajat(int id_angajat) {
		this.id_angajat = id_angajat;
	}
	public String getNume_furnizor() {
		return nume_furnizor;
	}
	public void setNume_furnizor(String nume_furnizor) {
		this.nume_furnizor = nume_furnizor;
	}
	public String getAdresa_furnizor() {
		return adresa_furnizor;
	}
	public void setAdresa_furnizor(String adresa_furnizor) {
		this.adresa_furnizor = adresa_furnizor;
	}
	public String getNr_telefon_furnizor() {
		return nr_telefon_furnizor;
	}
	public void setNr_telefon_furnizor(String nr_telefon_furnizor) {
		this.nr_telefon_furnizor = nr_telefon_furnizor;
	}
	
	public Furnizor() {
		// TODO Auto-generated constructor stub
	}
	
	public Furnizor(String name) {
		this.nume_furnizor=name;
	}
	
	public Furnizor(int id,int employeeId, String name,String address, String telephoneNumber) {
		this.id_furnizor=id;
		this.id_angajat=employeeId;
		this.nume_furnizor=name;
		this.adresa_furnizor=address;
		this.nr_telefon_furnizor=telephoneNumber;
	}
}
