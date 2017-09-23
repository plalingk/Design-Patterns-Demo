package com.ssdi.robot;


public interface IRobot{
	public void turnOn();
	public void turnOff();
	public void setSpeed(int speed);
	public void move(int distance);
	public void turn(int angle);
	
}