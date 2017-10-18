package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Spark;

public class Hardware {
	Spark firstMotor;
	Spark secondMotor;
	
	public Hardware(Spark motor) {
		firstMotor = motor;
		secondMotor = motor;
	}	
}
