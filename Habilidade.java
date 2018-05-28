package Simulation;

// Classe q representa as habilidades de um SerVivo.
// Quando um ser vivo aprende uma habilidade, a prioridade é definida 
// como 1 para ataque com sabre, 2 para ataque com força e 3 para esquivar

public class Habilidade {
	private int dano;
	private int gasto;
	private String nome;
	private int prioridade;
	
	Habilidade(String n, int d, int g, int p) {
		nome = n;
		dano = d;
		gasto = g;
		prioridade = p;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	public int getDanoBasico() {
		return dano;
	}
	
	public int getDano(int dominio) {   // O dano causado por uma habilidade depende tb do domínio correspondente.
		return dano + dominio/15;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public int getGasto() {
		return gasto;
	}

	public void setGasto(int gasto) {
		this.gasto = gasto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
