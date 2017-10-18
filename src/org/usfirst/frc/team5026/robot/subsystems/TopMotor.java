package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Hardware;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class TopMotor extends Subsystem {

	@SuppressWarnings("null")
	private static final double UP_SPEED = (Double) null;
	@SuppressWarnings("null")
	private static final double DOWN_SPEED = (Double) null;
	public TopMotor Clockwise;
	
	public void Clockwise() {
		Hardware.motor2.set(UP_SPEED);
	}
	
	public TopMotor CounterClockwise;
	
	public void counterclockwise () {
		Hardware.motor2.set(DOWN_SPEED);
	}
	
	public void stop () {
		Hardware.motor2.set(0);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
