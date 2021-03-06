package starwars;

abstract class Jedi{
    static final String academia = "Academia Jedi Coruscant";
    static final String conselho = "Conselho do Templo de Coruscant";
    private double pazInterna;
    private boolean telepatia;
    private boolean telecinese;
    private boolean persuasão;
    
    public double getPazInterna() {
		return pazInterna;
	}
	public void setPazInterna(double pazInterna) {
		this.pazInterna = pazInterna;
	}
	public boolean isTelepatia() {
		return telepatia;
	}
	public void setTelepatia(boolean telepatia) {
		this.telepatia = telepatia;
	}
	public boolean isTelecinese() {
		return telecinese;
	}
	public void setTelecinese(boolean telecinese) {
		this.telecinese = telecinese;
	}
	public boolean isPersuasão() {
		return persuasão;
	}
	public void setPersuasão(boolean persuasão) {
		this.persuasão = persuasão;
	}
}

