package Simulation;

abstract public class Habilidade {
		
	private int prioridade;
	private String skill;
	private int dano;
	private int gasto;
		
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;		
	}
		
	public String getSkill() {
		return skill;
	}
	public void setSkill(String nome) {
		this.skill = nome;
	}
	public int getDano() {
		return dano;
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
	
	void saberSkillStrong() {	
		this.prioridade = 0;
		this.gasto = 2;
		this.dano = 15;
	}
		
	void saberSkillWeak() {
		this.prioridade = 0;
		this.gasto = 1;
		this.dano = 10;
	}
		
	void forceSkill() {
		this.prioridade = 1;
		this.gasto = 1;
		this.dano = 5;	
	}
		
	void doge() {		
		this.prioridade = 2;
		this.gasto = 0;
		this.dano = 0;
	}
}
