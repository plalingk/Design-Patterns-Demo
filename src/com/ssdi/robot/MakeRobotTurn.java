package com.ssdi.robot;

public class MakeRobotTurn implements ICommand {
	int angle;
	IRobot r;
	
	public MakeRobotTurn(IRobot robot, int angle){	
		if(angle > 0 && angle <180){
			this.angle = angle;
		}
		else{
			System.out.println("Enter correct angle!");
		}
		this.r = robot;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("the robot is turned by and angle of: "+this.angle+" degrees");
		r.turn(this.angle);
	}
}