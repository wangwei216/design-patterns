package com.example.command_pattern.homework;

public class ConcreteCommand implements Command{
	    CompanyArmy army;	    
	    ConcreteCommand(CompanyArmy army){
	        this.army = army;
	    }

	    public void execute(){
	        army.sneakAttack();
	    }

}
