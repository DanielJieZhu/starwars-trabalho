package Simulation;

abstract class SerVivo{
    private String nome;
    private String Genero;
    private String especie;
    private String nascimento;
    private Planeta planeta;
    private boolean jedi;
    private boolean sith;
    private String rank;
    
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public Planeta getPlaneta() {
		return planeta;
	}
	public void setPlaneta(Planeta planeta) {
		this.planeta = planeta;
	}
	public boolean isJedi() {
		return jedi;
	}
	public void setJedi(boolean jedi) {
		this.jedi = jedi;
	}
	public boolean isSith() {
		return sith;
	}
	public void setSith(boolean sith) {
		this.sith = sith;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
}