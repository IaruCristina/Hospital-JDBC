package com.model;

public class Personal {

	private int id_personal;
	private int id_departament;
	private int id_pacient;
	private int id_angajat;
	
	public int getId_personal() {
		return id_personal;
	}
	public void setId_personal(int id_personal) {
		this.id_personal = id_personal;
	}
	public int getId_departament() {
		return id_departament;
	}
	public void setId_departament(int id_departament) {
		this.id_departament = id_departament;
	}
	public int getId_pacient() {
		return id_pacient;
	}
	public void setId_pacient(int id_pacient) {
		this.id_pacient = id_pacient;
	}
	public int getId_angajat() {
		return id_angajat;
	}
	public void setId_angajat(int id_angajat) {
		this.id_angajat = id_angajat;
	}
	
	public Personal() {
		// TODO Auto-generated constructor stub
	}
	
	public Personal(int id_personal,int id_department, int id_patient, int id_employee) {
		this.id_personal=id_personal;
		this.id_departament=id_department;
		this.id_pacient=id_patient;
		this.id_angajat=id_employee;
	}
	
}
