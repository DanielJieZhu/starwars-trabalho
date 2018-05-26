package starwars;

// Classe q representa uma ação tomada pelo lutador em um turno. Um lutador "escolhe" uma habilidade para usar na ação.
// Dependendo das prioridades, essa ação pode causar dano e gastar domínio, dar miss e gastar domínio(pq o adversário esquivou),
// e pode esquivar.

public class Action {

	private SerVivo atuador;
	private Habilidade h;
	
	public Action(SerVivo s, Habilidade h) {
		atuador = s;
		this.h = h;
	}

	public SerVivo getAtuador() {
		return atuador;
	}

	public void setAtuador(SerVivo atuador) {
		this.atuador = atuador;
	}

	public Habilidade getH() {
		return h;
	}

	public void setH(Habilidade h) {
		this.h = h;
	}
	
	public void doItTo(SerVivo s) {
		if(h.getPrioridade() == 3)
			esquivar();
		else if(h.getPrioridade() == 2)
			if(atuador.getDominioForca() >= h.getGasto())
			{
				causarDano(s);
				gastarDominio();
			}
			else
				miss();
		else
			if(atuador.getDominioSabre() >= h.getGasto())
			{
				causarDano(s);
				gastarDominio();
			}
			else
				miss();
	}
	
	public void miss() {
		if(h.getPrioridade() == 1)
		{
			System.out.println(atuador.getNome() + " não possui domínio de sabre(" + atuador.getDominioSabre() + ") o suficiente para usar a habilidade " + h.getNome() + " (" + h.getGasto() + ")");
		}
		else if(h.getPrioridade() == 2)
		{	
		    System.out.println(atuador.getNome() + " não possui domínio de força(" + atuador.getDominioForca() + ") o suficiente para usar a habilidade " + h.getNome() + " (" + h.getGasto() + ")");
		}
	}
	
	public void esquivar() {
		System.out.println(atuador.getNome() + " usou habilidade " + h.getNome() + " para esquivar");
	}
	
	public void causarDano(SerVivo s) {
		if(h.getPrioridade() == 1)
		{
			s.perdeVida(h.getDano(atuador.getDominioSabre()));
			System.out.println(atuador.getNome() + " usou habilidade com sabre " + h.getNome() + " e causou um dano de " + h.getDano(atuador.getDominioSabre()) + " a " + s.getNome());
		}
		else
		{
			s.perdeVida(h.getDano(atuador.getDominioForca()));
			System.out.println(atuador.getNome() + " usou habilidade com força " + h.getNome() + " e causou um dano de " + h.getDano(atuador.getDominioForca()) + " a " + s.getNome());
		}
	}
	
	public void gastarDominio() {
		if(h.getPrioridade() == 1)
		{
			atuador.perdeDominioSabre(h.getGasto());
			System.out.println(atuador.getNome() + " gastou " + h.getGasto() + " de domínio de sabre");
		}
		else if(h.getPrioridade() == 2)
		{	
			atuador.perdeDominioForca(h.getGasto());
		    System.out.println(atuador.getNome() + " gastou " + h.getGasto() + " de domínio de força");
		}
	}
	
}
