package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Spark;

public class Hardware {
	Spark motorForIntaking;
	Spark motorForElevating;
	
	public Hardware() {
		motorForIntaking = new Spark(0);
		motorForElevating = new Spark(1);
	}	
}
