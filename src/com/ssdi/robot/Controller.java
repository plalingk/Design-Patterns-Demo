package com.ssdi.robot;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Logger;


public class Controller {
	final static Logger log = Logger.getLogger(Controller.class.getName());	
	private HashMap<Integer,ICommand> hm;
	private String mode;
	
	public Controller(String mode) throws SecurityException, IOException{
		hm = new HashMap<Integer, ICommand>();
		this.mode = mode;
		if(mode.toLowerCase().equals("verbose")){
			 System.setProperty("logback.configurationFile", "C:\\Users\\pdlalingkar\\workspace\\Robot\\Resources\\log4j.properties");
		}
	}

	public void setCommand(int button, ICommand command){
		this.hm.put(button, command);
	}
	
	public void executeCommand(int action){		
		this.hm.get(action).execute();
		if(this.mode.toLowerCase().equals("verbose")){
			log.info("Executing the command: "+ action);
		}
	}
	
	public String getMode(){
		return this.mode;
	}
	
	
}
