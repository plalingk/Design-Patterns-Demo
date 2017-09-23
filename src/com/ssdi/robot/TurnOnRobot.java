package com.ssdi.robot;

public class TurnOnRobot implements ICommand {
	IRobot r;
	public TurnOnRobot(IRobot robot){
		this.r = robot;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("turning on the robot");
		r.turnOn();
	}
}
