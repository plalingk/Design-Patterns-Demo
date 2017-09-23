package com.ssdi.robot;

public class MoveTheRobot implements ICommand {
	int distance;
	IRobot r;
	
	public MoveTheRobot(IRobot robot, int distance){
		this.distance = distance;
		this.r = robot;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("the robot is moved by: "+this.distance+" feet");
		r.move(this.distance);
	}
}