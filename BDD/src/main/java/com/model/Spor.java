package com.model;

public class Spor {
	
	private int id_spor;
	private float s_vechime;
	private float s_calculator;
	private float s_garda;
	private float s_toxicitate;
	
	public int getId_spor() {
		return id_spor;
	}
	public void setId_spor(int id_spor) {
		this.id_spor = id_spor;
	}
	public float getS_vechime() {
		return s_vechime;
	}
	public void setS_vechime(float s_vechime) {
		this.s_vechime = s_vechime;
	}
	public float getS_calculator() {
		return s_calculator;
	}
	public void setS_calculator(float s_calculator) {
		this.s_calculator = s_calculator;
	}
	public float getS_garda() {
		return s_garda;
	}
	public void setS_garda(float s_garda) {
		this.s_garda = s_garda;
	}
	public float getS_toxicitate() {
		return s_toxicitate;
	}
	public void setS_toxicitate(float s_toxicitate) {
		this.s_toxicitate = s_toxicitate;
	}
	
	public Spor() {
		// TODO Auto-generated constructor stub
	}
	
	public Spor(int id, float vechime, float s_pc, float s_guard, float s_toxicity) {
		this.id_spor=id;
		this.s_vechime=vechime;
		this.s_calculator=s_pc;
		this.s_garda=s_guard;
		this.s_toxicitate=s_toxicity;
	}
	
}
