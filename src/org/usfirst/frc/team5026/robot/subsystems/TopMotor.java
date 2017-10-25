package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Constants;
import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;


public class TopMotor extends Subsystem {

	public TopMotor Clockwise;
	
	public void Clockwise() {
		Robot.hardware.motor2.set(Constants.UP_SPEED);
	}
	
	public TopMotor CounterClockwise;
	
	public void counterclockwise () {
		Robot.hardware.motor2.set(Constants.DOWN_SPEED);
	}
	
	public void stop () {
		Robot.hardware.motor2.set(0);
	}

    public void initDefaultCommand() {
    	Robot.hardware.motor2.set(0);
    }
}
