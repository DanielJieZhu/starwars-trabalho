package starwars;

// Classe q representa uma ação tomada pelo lutador em um turno. Um lutador "escolhe" uma habilidade para usar na ação.
// Dependendo das prioridades, essa ação pode causar dano e gastar domínio, dar miss e gastar domínio(pq o adversário esquivou),
// e pode esquivar.

public class Action {

	private SerVivo atuador;
	private Habilidade habilidade;
	
	public Action(SerVivo s, Habilidade h) {
		atuador = s;
		habilidade = h;
	}

	public SerVivo getAtuador() {
		return atuador;
	}

	public void setAtuador(SerVivo atuador) {
		this.atuador = atuador;
	}

	public Habilidade getH() {
		return habilidade;
	}

	public void setH(Habilidade h) {
		habilidade = h;
	}
	
	public void doItTo(SerVivo s) {
		if(habilidade.getPrioridade() == 3)
			esquivar();
		else if(habilidade.getPrioridade() == 2)
			if(atuador.getDominioForca() >= habilidade.getGasto())
			{
				causarDano(s);
				gastarDominio();
			}
			else
				miss();
		else
			if(atuador.getDominioSabre() >= habilidade.getGasto())
			{
				causarDano(s);
				gastarDominio();
			}
			else
				miss();
	}
	
	public void miss() {
		if(habilidade.getPrioridade() == 1)
		{
			System.out.println(atuador.getNome() + " não possui domínio de sabre(" + atuador.getDominioSabre() + ") o suficiente para usar a habilidade " + habilidade.getNome() + " (" + habilidade.getGasto() + ")");
		}
		else if(habilidade.getPrioridade() == 2)
		{	
		    System.out.println(atuador.getNome() + " não possui domínio de força(" + atuador.getDominioForca() + ") o suficiente para usar a habilidade " + habilidade.getNome() + " (" + habilidade.getGasto() + ")");
		}
	}
	
	public void esquivar() {
		System.out.println(atuador.getNome() + " usou habilidade " + habilidade.getNome() + " para esquivar");
	}
	
	public void causarDano(SerVivo s) {
		if(habilidade.getPrioridade() == 1)
		{
			s.perdeVida(habilidade.getDano(atuador.getDominioSabre()));
			System.out.println(atuador.getNome() + " usou habilidade com sabre " + habilidade.getNome() + " e causou um dano de " + habilidade.getDano(atuador.getDominioSabre()) + " a " + s.getNome());
		}
		else
		{
			s.perdeVida(habilidade.getDano(atuador.getDominioForca()));
			System.out.println(atuador.getNome() + " usou habilidade com força " + habilidade.getNome() + " e causou um dano de " + habilidade.getDano(atuador.getDominioForca()) + " a " + s.getNome());
		}
	}
	
	public void gastarDominio() {
		if(habilidade.getPrioridade() == 1)
		{
			atuador.perdeDominioSabre(habilidade.getGasto());
			System.out.println(atuador.getNome() + " gastou " + habilidade.getGasto() + " de domínio de sabre");
		}
		else if(habilidade.getPrioridade() == 2)
		{	
			atuador.perdeDominioForca(habilidade.getGasto());
		    System.out.println(atuador.getNome() + " gastou " + habilidade.getGasto() + " de domínio de força");
		}
	}
	
}
