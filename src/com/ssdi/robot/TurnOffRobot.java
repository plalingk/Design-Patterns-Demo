package com.ssdi.robot;

public class TurnOffRobot implements ICommand {
	IRobot r;
	public TurnOffRobot(IRobot robot){
		this.r = robot;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("turning off the robot");
		r.turnOff();
	}
}
