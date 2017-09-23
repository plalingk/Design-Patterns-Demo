package com.ssdi.robot;

import java.io.IOException;

public class Driver {

	public static void main(String args[]) throws SecurityException, IOException{
		LegoNxtVehicle v = new LegoNxtVehicle(); 
		Controller c = new Controller("verbose");
		
		if(c.getMode().toLowerCase().equals("verbose")==true){
			
		}
		
		ICommand c1 = new TurnOnRobot(v);
		c.setCommand(1, c1);
		ICommand c2 = new SetSpeedToRobot(v,15);
		c.setCommand(2, c2);
		ICommand c3 = new MoveTheRobot(v,6);
		c.setCommand(3, c3);
		ICommand c4 = new MakeRobotTurn(v,30);
		c.setCommand(4, c4);
		ICommand c5 = new TurnOffRobot(v);
		c.setCommand(5, c5);
		
		// If the robot encounters invalid input the output will be set to 0.
		// eg: if speed is given negative it will be set to 0.
		c.executeCommand(1);
		c.executeCommand(2);
		c.executeCommand(3);
		c.executeCommand(4);
		c.executeCommand(5);
		
	}
	
}
