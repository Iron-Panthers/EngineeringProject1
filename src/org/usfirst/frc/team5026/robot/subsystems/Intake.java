package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Constants;
import org.usfirst.frc.team5026.robot.Hardware;
import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {

	Spark motor1;
	public Intake(){	
		motor1 = Robot.hardware.motor1;
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void intake() {
		motor1.set(Constants.INTAKE_SPEED);
	}
	
	public void outtake() {//to be used later if needed
		motor1.set(Constants.OUTTAKE_SPEED);
	}
	
	public void stop() {
		motor1.set(0);
	}
   
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

