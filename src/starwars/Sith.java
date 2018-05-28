package starwars;

abstract class Sith{
    static final String academia = "Academia Sith Korriban";
    static final String conselho = "Irmandade da Escuridao";
    private double percentRaiva;
    private String novoNome;
    private boolean telepatia;
    private boolean telecinese;
    private boolean persuasao;
    
    public void setPercentRaiva(double p) {
         percentRaiva = p;
    }
    
    public double getPercentRaiva() {
         return percentRaiva;
    }
    
    public void setNovoNome(String n) {
         novoNome = n;
    }
    
    public String getNovoNome() {
         return novoNome;
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
	 return persuasao;
    }

    public void setPersuasão(boolean persuasão) {
	 this.persuasao = persuasão;
    }
}
