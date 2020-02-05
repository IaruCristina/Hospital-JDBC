package com.model;

public class Pacient {
	
	private int id_pacient;
	private String nume_pacient;
	private int varsta_pacient;
	private String boala_pacient;
	private String tratament_pacient;
	
	public int getId_pacient() {
		return id_pacient;
	}
	public void setId_pacient(int id_pacient) {
		this.id_pacient = id_pacient;
	}
	public String getNume_pacient() {
		return nume_pacient;
	}
	public void setNume_pacient(String nume_pacient) {
		this.nume_pacient = nume_pacient;
	}
	public int getVarsta_pacient() {
		return varsta_pacient;
	}
	public void setVarsta_pacient(int varsta_pacient) {
		this.varsta_pacient = varsta_pacient;
	}
	public String getBoala_pacient() {
		return boala_pacient;
	}
	public void setBoala_pacient(String boala_pacient) {
		this.boala_pacient = boala_pacient;
	}
	public String getTratament_pacient() {
		return tratament_pacient;
	}
	public void setTratament_pacient(String tratament_pacient) {
		this.tratament_pacient = tratament_pacient;
	}
	
	public Pacient() {
		// TODO Auto-generated constructor stub
	}
	
	public Pacient(String name) {
		this.nume_pacient=name;
	}
	
	public Pacient(int id, String name,int age, String disease, String treatment) {
		this.id_pacient=id;
		this.nume_pacient=name;
		this.varsta_pacient=age;
		this.boala_pacient=disease;
		this.tratament_pacient=treatment;
	}
	
}
