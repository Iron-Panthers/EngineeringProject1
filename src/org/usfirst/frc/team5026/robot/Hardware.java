package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Spark;

public class Hardware {
	Spark firstMotor;
	Spark secondMotor;
	
	public Hardware() {
		firstMotor = new Spark(0);
		secondMotor = new Spark(1);
	}	
}
