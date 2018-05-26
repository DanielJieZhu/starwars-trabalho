package starwars;

// Classe q representa cada turno da batalha. Para cada turno, terão uma ação de um lutador e outra ação do outro lutador.
// Quando as ações são efetuadas, elas respeitam a regra das prioridades(esquivar > ataque com força > ataque com sabre).

public class Turno {

	private static int n = 1;
    private Action a1;
    private Action a2;
	
	public Turno(Action a1, Action a2) {
		this.a1 = a1;
		this.a2 = a2;
	}
	
	public void resetN() {
		n = 1;
	}
	
	public void turno() {
		System.out.println("\n\tTurno "+n);
		
		if(a1.getH().getPrioridade() == a2.getH().getPrioridade())
     	{
			a1.doItTo(a2.getAtuador());
		    a2.doItTo(a1.getAtuador());
		}
		
		else if(a1.getH().getPrioridade() == 3)
			if(a2.getH().getPrioridade() == 2)
			{
				a1.doItTo(a2.getAtuador());
				System.out.println("Mas não teve efeito!!!");
			    a2.doItTo(a1.getAtuador());
		    }
		    else 
		    {
		    	a1.doItTo(a2.getAtuador());
		    	System.out.println("Deu certo!!!");
		    	System.out.println(a2.getAtuador().getNome() + " tentou atacar com sabre");
		    	a2.gastarDominio();
	        }
		
		else if(a2.getH().getPrioridade() == 3) 
			if(a1.getH().getPrioridade() == 2)
			{
				a2.doItTo(a1.getAtuador());
				System.out.println("Mas não teve efeito!!!");
			    a1.doItTo(a2.getAtuador());
		    }
		    else 
		    {
		    	a2.doItTo(a1.getAtuador());
		    	System.out.println("Deu certo!!!");
		    	System.out.println(a1.getAtuador().getNome() + " tentou atacar com sabre");
		    	a1.gastarDominio();
	        }
		
		else if(a1.getH().getPrioridade() > a2.getH().getPrioridade())
		{
			a1.doItTo(a2.getAtuador());
			if(a2.getAtuador().getVida() > 0)
				a2.doItTo(a1.getAtuador());
		}
		
		else
		{
			a2.doItTo(a1.getAtuador());
			if(a1.getAtuador().getVida() > 0)
				a1.doItTo(a2.getAtuador());
		}
	
		n++;
	}
	
}
