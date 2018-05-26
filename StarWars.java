package starwars;

import java.util.Scanner;

// Classe q representa uma batalha StarWars onde o Mestre Jedi e o Lord Sith entraram em confronto.
// Depois da batalha entre os dois, vc(jogador) pode escolher um dos dois para refazer a batalha, ou 
// vc(jogador) pode criar uma personagem prória para desafiar eles!!!!!

public class StarWars extends Batalha {

	public StarWars(SerVivo s1, SerVivo s2) {
		super(s1, s2);
	}
	
	public SerVivo criarPersonagem() {
		SerVivo ser;
		String n;
		int v;
		int f;
		int s;
		int numh;
		Habilidade h;
		String nh;
		int dh;
		int gh;
		int th;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nAgora chegou a sua vez!!! Crie sua personagem para desafiar o Mestre Jedi e o Lord Sith!");
		System.out.println("Dê um nome a sua personagem: ");
		n = sc.nextLine();
		System.out.println("Agora atribua uma quantidade de vida, domínio de força e domínio de sabre a sua personagem: ");
		v = sc.nextInt();
		f = sc.nextInt();
		s = sc.nextInt();
		ser = new SerVivo(n, v, f, s);
		System.out.println("Pronto! Sua personagem " + ser.getNome() + " foi criada com sucesso! =>  Vida: " + ser.getVida() + "  Domínio de força: " + ser.getDominioForca() + "  Domínio de sabre: " + ser.getDominioSabre());
		System.out.println("Ele/ela possui 4 habilidades básicas: Slash com sabre, Thrust com sabre, Punch com força e Dodge(esquivar). Deseja aprender mais habilidades? Quantas? ");
		numh = sc.nextInt();
		while(numh > 0)
		{
			sc.nextLine();
			System.out.println("Digite o nome da habilidade: ");
			nh = sc.nextLine();
			System.out.println("Atribua dano, gasto e tipo(1 para ataque com sabre, 2 para ataque com força e 3 para esquivar) a essa habilidade: ");
			dh = sc.nextInt();
			gh = sc.nextInt();
			th = sc.nextInt();
			h = new Habilidade(nh, dh, gh, th);
			ser.aprendeHabilidade(h);
			numh--;
		}
		
		System.out.println("Ótimo! Sua personagem já aprenderam as habilidades e está pronto para batalhar!!!");
		return ser;
	}
	
	public static void main(String args[]) {
		SerVivo s1 = new SerVivo("Mestre Jedi", 100, 50, 100);
		SerVivo s2 = new SerVivo("Lord Sith", 100, 80, 70);
		
		Habilidade h1 = new Habilidade("Cut", 25, 15, 1);
		Habilidade h2 = new Habilidade("Force Push", 20, 10, 2);
		s1.aprendeHabilidade(h1);
		s2.aprendeHabilidade(h2);
		
		StarWars sw = new StarWars(s1, s2);
		sw.comecarAuto();
		
		s1.setVida(100);
		s1.setDominioForca(50);
		s1.setDominioSabre(100);
		s2.setVida(100);
		s2.setDominioForca(80);
		s2.setDominioSabre(70);
		Scanner sc = new Scanner(System.in);
		System.out.println("\nVocê gostaria de refazer a batalha(1) ou criar uma personagem(2) própria para desafiar eles?");
		int a = sc.nextInt();
		if(a == 1)
		{
			System.out.println("Quem você gostaria de ser? (1 para Mestre Jedi e 2 para Lord Sith): ");
		    a = sc.nextInt();
		    if(a == 1)
		    	sw = new StarWars(s1, s2);
		    else if(a == 2)
		    	sw = new StarWars(s2, s1);
		}
		else if(a == 2)
		{
			SerVivo personagem = sw.criarPersonagem();
		    System.out.println("Quem você desafiará? (1 para Mestre Jedi e 2 para Lord Sith): ");
		    a = sc.nextInt();
		    if(a == 1)
		    	sw = new StarWars(personagem, s1);
		    else if(a == 2)
		    	sw = new StarWars(personagem, s2);
		}
		sw.comecar();
		sc.close();
	}
}
