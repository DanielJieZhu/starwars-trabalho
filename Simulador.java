package Simulation;

public class Simulador {
    public static void main(String[] args) {
    	Lutador luke= new Lutador("Luke");
    	Lutador Vader= new Lutador("Darth Vader");
    	Turno luta=new Turno();
    	
    	
    	luke.saberSkillStrong();
    	Vader.forceSkill();
    	luta.information(luke, Vader);
    	
    	luke.doge();
    	Vader.forceSkill();
    	luta.information(luke, Vader);
    	
    	luke.doge();
    	Vader.saberSkillWeak();
    	luta.information(luke, Vader);
    	
    	luke.doge();
    	Vader.doge();
    	luta.information(luke, Vader);
    	
    	luke.forceSkill();
    	Vader.saberSkillStrong();
    	luta.information(luke, Vader);
    	
    	luke.saberSkillStrong();
    	Vader.saberSkillStrong();
    	luta.information(luke, Vader);
    	
    	luke.saberSkillWeak();
    	Vader.forceSkill();
    	luta.information(luke, Vader);
    	
    	luke.forceSkill();
    	Vader.doge();
    	luta.information(luke, Vader);
    	
    	luke.doge();
    	Vader.saberSkillStrong();
    	luta.information(luke, Vader);
    	

    	luke.saberSkillWeak();
    	Vader.saberSkillWeak();
    	luta.information(luke, Vader);
    	

    	luke.saberSkillStrong();
    	Vader.saberSkillStrong();
    	luta.information(luke, Vader);
    	
    	luke.saberSkillWeak();
    	Vader.doge();
    	luta.information(luke, Vader);
    	
    	luke.saberSkillStrong();
    	Vader.saberSkillStrong();
    	luta.information(luke, Vader);
    	
    	luke.forceSkill();
    	Vader.forceSkill();
    	luta.information(luke, Vader);
    	
    	luke.forceSkill();
    	Vader.doge();
    	luta.information(luke, Vader);
    	}
  }