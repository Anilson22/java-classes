package br.fai.models;

public abstract class Animal {
	
	int id;
	String nome;
	public Animal(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void cadastrarCavalo() {
		
	}
	
	public void cadastrarGirafa() {
		
	}
	
	public void listrarCavalos() {
		
	}
	
	public void listrarGirafa() {
		
	}
	
	public void mostrarTodosAnimais() {
		
	}
	
	

}
