package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Spark;

public class Hardware {

	public Spark motor1;
	public Spark motor2;
	
	public Hardware() {//construct hardware
		motor1 = new Spark(0);	
		motor2 = new Spark(1);

	}
}
