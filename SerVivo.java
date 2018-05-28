package Simulation;

import java.util.ArrayList;

// Classe q representa os SerVivos, eles têm uma lista de pelo menos 4 habilidades, nome, vida, domínio de força e domínio de sabre.

public class SerVivo {
	private String nome;
    private int vida;
    private int dominioForca;
    private int dominioSabre;
    private ArrayList<Habilidade> habilidade = new ArrayList<Habilidade>();
    
    public SerVivo(String n, int v, int f, int s) {
    	nome = n;
    	vida = v;
    	dominioForca = f;
    	dominioSabre = s;
    	Habilidade[] hab = { new Habilidade("Strong Slash", 15, 15, 1),    // Todos os seres vivos nascem com 4 habilidades.
    			   new Habilidade("Weak Slash", 10, 10, 1),
    			   new Habilidade("Force Push", 10, 10, 2),
		           new Habilidade("Dodge", 0, 0, 3) };
		for(int i = 0; i < hab.length; i++)
			habilidade.add(hab[i]);
    }
    
    public SerVivo(String nome) {
    	this.nome = nome;
    	Habilidade[] hab = { new Habilidade("Strong Slash", 15, 15, 1),    // Todos os seres vivos nascem com 4 habilidades.
    			   new Habilidade("Weak Slash", 10, 10, 1),
    			   new Habilidade("Force Push", 10, 10, 2),
		           new Habilidade("Dodge", 0, 0, 3) };
		for(int i = 0; i < hab.length; i++)
			habilidade.add(hab[i]);
    }
    
	public int getDominioForca() {
		return dominioForca;
	}

	public void setDominioForca(int dominioForca) {
		this.dominioForca = dominioForca;
	}
	
	public void perdeDominioForca(int gasto) {
		dominioForca = dominioForca - gasto;
	}
	
	public void perdeDominioSabre(int gasto) {
		dominioSabre = dominioSabre - gasto;
	}

	public int getDominioSabre() {
		return dominioSabre;
	}

	public void setDominioSabre(int dominioSabre) {
		this.dominioSabre = dominioSabre;
	}
	
	public ArrayList<Habilidade> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(ArrayList<Habilidade> habilidade) {
		this.habilidade = habilidade;
	}

	public void aprendeHabilidade(Habilidade h) {
		habilidade.add(h);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getVida() {
		return vida;
	}
	
	public void perdeVida(int dano) {
		vida = vida - dano;
	}
	
	public String getNome() {
		return nome;
	}

}
