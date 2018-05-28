package starwars;

public class Missao{
    private String nome;
    private String data;
    private String objetivo;
    private String envolvidos[];
    private String executor;
    Planeta planeta;
    private boolean sucesso;
    
    public String getData() {
    	return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String[] getEnvolvidos() {
		return envolvidos;
	}
	public void setEnvolvidos(String[] envolvidos) {
		this.envolvidos = envolvidos;
	}
	public String getExecutor() {
		return executor;
	}
	public void setExecutor(String executor) {
		this.executor = executor;
	}
	public boolean isSucesso() {
		return sucesso;
	}
	public void setSucesso(boolean sucesso) {
		this.sucesso = sucesso;
	}
}
