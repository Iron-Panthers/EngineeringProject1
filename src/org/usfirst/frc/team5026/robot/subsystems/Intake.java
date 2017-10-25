package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Constants;
import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;


public class Intake extends Subsystem {
	
	public Intake intake;

	public void intake() {
		Robot.hardware.motor1.set(Constants.INTAKE_SPEED);
	}
	
	public void outtake() { //to be used later if needed
		Robot.hardware.motor1.set(Constants.OUTTAKE_SPEED);
	}
	
	public void stop() {
		Robot.hardware.motor1.set(0);
	}
   
	public void initDefaultCommand() {
		Robot.hardware.motor1.set(0); //I think?  I'm not so sure.
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}

