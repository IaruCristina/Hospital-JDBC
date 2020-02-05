package com.model;

public class Angajat {

	private int id_angajat;
	private String nume_angajat;
	private String functie_angajat;
	private int varsta_angajat;
	
	public int getId_angajat() {
		return id_angajat;
	}
	public void setId_angajat(int id_angajat) {
		this.id_angajat = id_angajat;
	}
	public String getNume_angajat() {
		return nume_angajat;
	}
	public void setNume_angajat(String nume_angajat) {
		this.nume_angajat = nume_angajat;
	}
	public String getFunctie_angajat() {
		return functie_angajat;
	}
	public void setFunctie_angajat(String functie_angajat) {
		this.functie_angajat = functie_angajat;
	}
	public int getVarsta_angajat() {
		return varsta_angajat;
	}
	public void setVarsta_angajat(int varsta_angajat) {
		this.varsta_angajat = varsta_angajat;
	}
	
	public Angajat() {
	
	}
	
	public Angajat(String name) {
		this.nume_angajat=name;
	}
	
	public Angajat(int id,String name,String function, int age) {
		this.id_angajat=id;
		this.nume_angajat=name;
		this.functie_angajat=function;
		this.varsta_angajat=age;
	}
	
}
