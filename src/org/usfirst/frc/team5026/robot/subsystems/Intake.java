package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Hardware;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {

    private static final double INTAKE_SPEED = 0;
	private static final double OUTTAKE_SPEED = 0;
	// Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Intake intake;

	public void intake() {
		Hardware.motor1.set(INTAKE_SPEED);
	}
	
	public void outake() {
		Hardware.motor1.set(OUTTAKE_SPEED);
	}
	
	public void stop() {
		Hardware.motor1.set(0);
	}
   
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

