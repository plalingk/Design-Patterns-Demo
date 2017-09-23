package com.ssdi.robot;

public class SetSpeedToRobot implements ICommand {
	int speed;
	IRobot r;
	
	public SetSpeedToRobot(IRobot robot,int speed){	
		this.r = robot;		
		if (speed <50 && speed >0){
			this.speed = speed;
		}
		else{
			System.out.println("Enter a vlaid speed!");
		}
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("the robot is zooming at: "+this.speed+" feet/sec");
		r.setSpeed(this.speed);
	}
}
