package starwars;

import java.util.Random;
import java.util.Scanner;

// Classe q representa uma batalha entre dois lutadores(de classe SerVivo). Ela pode apresentar estados atuais dos lutadores.
// Para a batalha, existem duas opções, simular uma batalha automática(random), ou o jogador pode escolher um dos lutadores e 
// fazer a batalha por ele.

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
	    Random r = new Random();
	    int num;
	    infoBatalha();
	    
	    // Esse trecho do código serve para resetar o número do turno antes de uma batalha começar.
	    a1 = new Action(s1, s1.getHabilidade().get(0));
	    a2 = new Action(s2, s2.getHabilidade().get(0));
	    t = new Turno(a1, a2);
	    t.resetN();
	    
	    while(s1.getVida() > 0 && s2.getVida() > 0)
		{
			num = r.nextInt(s1.getHabilidade().size());
			a1 = new Action(s1, s1.getHabilidade().get(num));
			num = r.nextInt(s2.getHabilidade().size());
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
	
	public void comecar() {
		Turno t;
	    Action a1;
	    Action a2;
	    Random r = new Random();
	    int num;
	    int i;
	    
	    // Esse trecho do código serve para resetar o número do turno antes de uma batalha começar.
	    a1 = new Action(s1, s1.getHabilidade().get(0));
	    a2 = new Action(s2, s2.getHabilidade().get(0));
	    t = new Turno(a1, a2);
	    t.resetN();
	    
	    Scanner sc = new Scanner(System.in);
	    infoBatalha();
	    
	    while(s1.getVida() > 0 && s2.getVida() > 0)
	    {
	    	System.out.println("\nSuas habilidades: ");
	    	for(i = 1; i <= s1.getHabilidade().size(); i++)
	    		System.out.println("Habilidade " + i + ": " + s1.getHabilidade().get(i-1).getNome() + " => Dano: " + s1.getHabilidade().get(i-1).getDanoBasico() + "  Gasto: " + s1.getHabilidade().get(i-1).getGasto() + "  Tipo: " + s1.getHabilidade().get(i-1).getPrioridade());
	    	System.out.println("Selecione uma habilidade que deseja usar: ");
	    	num = sc.nextInt() - 1;
	    	a1 = new Action(s1, s1.getHabilidade().get(num));
			num = r.nextInt(s2.getHabilidade().size());
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
	    sc.close();
	}
}
