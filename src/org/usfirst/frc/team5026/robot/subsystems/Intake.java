package org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
	Spark liftMotor;
	Spark intakeMotor;
	public Intake(Spark motor) {
		liftMotor = motor;
	}
	public void intake() {
		
	}
	public void outtake() {
		
	}
	public void up() {
		
	}
	public void down() {
		
	}
	public void stop() {
		liftMotor.stopMotor();
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

