package org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {
	Spark liftMotor;
	public Elevator(Spark motor) {
		liftMotor = motor;
	}
	public void up(double speed) {
		liftMotor.set(speed);
	}
	public void down(double speed) {
		liftMotor.set(-speed);
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

