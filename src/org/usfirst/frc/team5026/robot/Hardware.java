package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Spark;

public class Hardware {

	public static Spark motor1;
	public static Spark motor2;
	public static Spark motor3;
	
	public Hardware() {//construct hardware
		motor1 = new Spark(0);	
		motor2 = new Spark(1);
		motor3 = new Spark(2);

	}
}
