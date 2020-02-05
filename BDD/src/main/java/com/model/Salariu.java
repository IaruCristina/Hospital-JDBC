package com.model;

public class Salariu {

	private int id_salariu;
	private int id_angajat;
	private int id_spor;
	private int ani_vechime;
	private float venit_brut;
	private float venit_net;
	
	public int getId_salariu() {
		return id_salariu;
	}
	public void setId_salariu(int id_salariu) {
		this.id_salariu = id_salariu;
	}
	public int getId_angajat() {
		return id_angajat;
	}
	public void setId_angajat(int id_angajat) {
		this.id_angajat = id_angajat;
	}
	public int getId_spor() {
		return id_spor;
	}
	public void setId_spor(int id_spor) {
		this.id_spor = id_spor;
	}
	public int getAni_vechime() {
		return ani_vechime;
	}
	public void setAni_vechime(int ani_vechime) {
		this.ani_vechime = ani_vechime;
	}
	public float getVenit_brut() {
		return venit_brut;
	}
	public void setVenit_brut(float venit_brut) {
		this.venit_brut = venit_brut;
	}
	public float getVenit_net() {
		return venit_net;
	}
	public void setVenit_net(float venit_net) {
		this.venit_net = venit_net;
	}
	
	public Salariu() {
		// TODO Auto-generated constructor stub
	}
	
	public Salariu(int id, int employee_id, int increase_id, int vechime, float net_income, float brut_income) {
		this.id_salariu=id;
		this.id_angajat=employee_id;
		this.id_spor=increase_id;
		this.ani_vechime=vechime;
		this.venit_net=net_income;
		this.venit_brut=brut_income;
	}
	
}
