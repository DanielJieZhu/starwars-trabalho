package Simulation;

public class Turno {

	void turn(Lutador a, Lutador b) {		
		if(a.getPrioridade() > b.getPrioridade()) {//se a prioridade do player A eh maior do que B, A faz acao primeira
			a.action(b);
			if(a.getPrioridade()==2 && b.getPrioridade() == 0) {// Se A esquiva e B usa sabre
				System.out.println( b.getNome()+ " usou sabre");
				System.out.println("mas falhou");
				b.setDominioSabre(b.getDominioSabre() - b.getGasto());
				return;
			}
			if(b.getHp()<=0) {// se B morre pelo ataque de A
				System.out.println(" a luta acabou");
				return;
			}			
			else//se nenhum dos casos, B executa acao
				b.action(a);
			return;
		}
		
		if( b.getPrioridade() > a.getPrioridade()) {//a analogo ao caso de cima 
			b.action(a);
			if(b.getPrioridade()==2 && a.getPrioridade() == 0) {
				System.out.println(" mas falhou");
				a.setDominioSabre(a.getDominioSabre() - a.getGasto());
				return;
			}
			if(a.getHp()<=0) {
				System.out.println(" a luta acabou");
				return;
			}		
			else
				a.action(b);
			return;
		}
		
		else {
			a.action(b);
			if(b.getHp()<=0) {// se B morre pelo ataque de A
				System.out.println(" a luta acabou");
				return;
			}			
			b.action(a);
			if(a.getHp()<=0) {//se A morre pelo ataque de B
				System.out.println(" a luta acabou");
		
			}		
		}
		
	}
	
	public void information(Lutador a, Lutador b) {
		this.turn(a, b);
		
		if(b.getHp()<=0 | a.getHp()<=0) { // se A ou B morrerem
			System.out.println("\na luta acabou");
			if(b.getHp()<=0)
				System.out.println(a.getNome()+ " ganhou");
			if(a.getHp()<=0)
				System.out.println(b.getNome()+ " ganhou");
		}
		
		System.out.println("\n"+a.getNome()+"\nhp:" +a.getHp()+ "\ndominio de forca " +a.getDominioForca()+ "\ndominio de sabre " +a.getDominioSabre()+ "\n");
		System.out.println(b.getNome()+"\nhp:" +b.getHp()+ "\ndominio de forca " +b.getDominioForca()+ "\ndominio de sabre " +b.getDominioSabre()+ "\n");
	}
}