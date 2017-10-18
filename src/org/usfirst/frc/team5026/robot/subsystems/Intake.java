package org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
	Spark intakeMotor;
	public Intake(Spark motor) {
		intakeMotor = motor;
	}
	public void intake(double speed) {
		intakeMotor.set(speed);
	}
	public void outtake(double speed) {
		intakeMotor.set(-speed);
	}
	public void stop() {
		intakeMotor.stopMotor();
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

