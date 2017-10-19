package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Constants;
import org.usfirst.frc.team5026.robot.Hardware;

import edu.wpi.first.wpilibj.command.Subsystem;


public class TopMotor extends Subsystem {

	public TopMotor Clockwise;
	
	public void Clockwise() {
		Hardware.motor2.set(Constants.UP_SPEED);
	}
	
	public TopMotor CounterClockwise;
	
	public void counterclockwise () {
		Hardware.motor2.set(Constants.DOWN_SPEED);
	}
	
	public void stop () {
		Hardware.motor2.set(0);
	}

    public void initDefaultCommand() {
    	Hardware.motor2.set(0);
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
