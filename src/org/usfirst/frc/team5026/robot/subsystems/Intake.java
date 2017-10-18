package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Constants;
import org.usfirst.frc.team5026.robot.Hardware;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Intake intake;

	public void intake() {
		Hardware.motor1.set(Constants.INTAKE_SPEED);
	}
	
	public void outtake() {//to be used later if needed
		Hardware.motor1.set(Constants.OUTTAKE_SPEED);
	}
	
	public void stop() {
		Hardware.motor1.set(0);
	}
   
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

