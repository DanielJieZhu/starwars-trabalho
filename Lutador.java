package Simulation;

public class Lutador extends Habilidade{
	private String nome;
	private int hp = 100;
	private int dominioForca=20;
	private int dominioSabre=50;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDominioForca() {
		return dominioForca;
	}
	public void setDominioForca(int dominioForca) {
		this.dominioForca = dominioForca;
	}
	public int getDominioSabre() {
		return dominioSabre;
	}
	public void setDominioSabre(int dominioSabre) {
		this.dominioSabre = dominioSabre;
	}
	
	Lutador(){
		
	}
	
	Lutador(String name){
		this.nome=name;
	}
	
	Lutador(String name ,int life, int mp, int ap){
		this.nome = name;
		this.hp = life;
		this.dominioForca = mp;
		this.dominioSabre = ap;
	}
	
	void action(Lutador enemy) {//executa a habilidade
		if(this.getPrioridade()== 0 ) {//se for habilidade de sabre
			if(this.getDominioSabre()-this.getGasto() < 0) {//se não tem dominio suficiente
				System.out.println( this.getNome()+ "nao tem ponto de sabre suficiente");
				return;
			}
			
			System.out.println( this.getNome()+ " usou sabre");
			this.setDominioSabre(this.getDominioSabre() - this.getGasto());
			enemy.setHp(enemy.getHp() - this.getDano());
			return;
		}
		if(this.getPrioridade()== 1) {//se for habilidade de forca
			if(this.getDominioForca()-this.getGasto() < 0) {//se não tem dominio suficiente
				System.out.println( this.getNome()+ "nao tem ponto de forca suficiente");
				return;
			}
			System.out.println( this.getNome()+ " usou força ");
			this.setDominioForca(this.getDominioForca() - this.getGasto());
			enemy.setHp(enemy.getHp() - this.getDano());
			return;
		}
		
		else
			System.out.println( this.getNome()+ " usou esquiva ");
			return;
		
	}
	
}