package starwars;

import java.util.Random;

// Classe q representa uma batalha entre dois lutadores(de classe SerVivo). Ela pode apresentar estados atuais dos lutadores.
// A batalha consiste numa simulação automática usando a classe Random.

public class Batalha {
	private SerVivo s1;
	private SerVivo s2;
	
	Batalha(SerVivo s1, SerVivo s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void infoBatalha() {
		System.out.println(s1.getNome() + " => Vida: " + s1.getVida() + "  Domínio de Força: " + s1.getDominioForca() + "  Domínio de Sabre: " + s1.getDominioSabre());
		System.out.println(s2.getNome() + " => Vida: " + s2.getVida() + "  Domínio de Força: " + s2.getDominioForca() + "  Domínio de Sabre: " + s2.getDominioSabre());
	}
	
	public void comecarAuto() {
	    Turno t;
	    Action a1;
	    Action a2;
	    Random random = new Random();
	    int num;
	    infoBatalha();
	    
	    // Esse trecho do código serve para resetar o número do turno antes de uma batalha começar,
	    // já que o número do turno é um atributo static da classe Turno.
	    a1 = new Action(s1, s1.getHabilidade().get(0));
	    a2 = new Action(s2, s2.getHabilidade().get(0));
	    t = new Turno(a1, a2);
	    t.resetN();
	    
	    while(s1.getVida() > 0 && s2.getVida() > 0)
		{
			num = random.nextInt(s1.getHabilidade().size());
			a1 = new Action(s1, s1.getHabilidade().get(num));
			num = random.nextInt(s2.getHabilidade().size());
			a2 = new Action(s2, s2.getHabilidade().get(num));
			t = new Turno(a1, a2);
			t.turno();
			infoBatalha();
		}

	    if(s1.getVida() <= 0 && s2.getVida() <= 0)
	    	System.out.println("\nA batalha deu empate!!!");
	    else if (s1.getVida() > 0)
	    	System.out.println("\nO vencedor da batalha foi " + s1.getNome() + "!!!");
	    else
	    	System.out.println("\nO vencedor da batalha foi " + s2.getNome() + "!!!");
	}

}
