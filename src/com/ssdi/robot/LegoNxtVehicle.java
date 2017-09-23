package com.ssdi.robot;

public class LegoNxtVehicle implements IRobot{

	private boolean machineStatus;
	private int speed;
	private int distance;
	private int angle;
	private String mode;
	
	public LegoNxtVehicle(){
		machineStatus = true;
		speed = 0;
		distance = 0;
		angle = 0;
		this.mode="Silent";
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		if(machineStatus == false){
			this.machineStatus = true;
			System.out.println("Lego Nxt Vehicle Turned On");
		}
		else{
			System.out.println("Lego Nxt Vehicle is already ON");
		}
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		if(this.machineStatus==true){
			this.machineStatus = false;
			System.out.println("Lego Nxt Vehicle Turned Off");
		}
		else{
			System.out.println("Lego Nxt Vehicle is already ON");
		}
	}

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		this.speed = speed;
		System.out.println("Lego Nxt Vehicle speed set to "+speed+" feet/sec");
	}

	@Override
	public void move(int distance) {
		// TODO Auto-generated method stub
		this.distance = distance;
		if(this.distance>0){
			System.out.println("Lego Nxt Vehicle moved by "+this.distance+" feet in the forward direction");			
		}
		else{
			System.out.println("Lego Nxt Vehicle moved by "+this.distance+" feet in the backward direction");
		}
	}

	@Override
	public void turn(int angle) {
		// TODO Auto-generated method stub
		this.angle = angle;
		System.out.println("Lego Nxt Vehicle vehicle turned by "+this.angle+" degrees");
	}
	
	public void setMode(String status){
		this.mode = status;
		System.out.println("Lego Nxt Vehicle mode set to "+this.mode);
	}
	
	public String getMode(){
		return this.mode;
	}
	
	public void print(){
		System.out.println("Robot details: \n");
		System.out.println("status: " + this.machineStatus);
		System.out.println("speed: " + this.speed);
		System.out.println("distance: " + this.distance);
		System.out.println("angle: " + this.angle);
		System.out.println("mode: " + this.mode);
	}

	
}
