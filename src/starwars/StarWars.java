package starwars;

// Classe q representa uma batalha StarWars onde o Mestre Jedi e o Lord Sith entraram em confronto.

public class StarWars extends Batalha {

	public StarWars(SerVivo s1, SerVivo s2) {
		super(s1, s2);
	}
	
	public static void main(String args[]) {
		SerVivo s1 = new SerVivo("Mestre Jedi", 100, 50, 100);
		SerVivo s2 = new SerVivo("Lord Sith", 100, 80, 70);
		
		Habilidade h1 = new Habilidade("Cut", 25, 15, 1);
		Habilidade h2 = new Habilidade("Punch", 20, 10, 2);
		s1.aprendeHabilidade(h1);
		s2.aprendeHabilidade(h2);
		
		StarWars sw = new StarWars(s1, s2);
		sw.comecarAuto();
	}
}
