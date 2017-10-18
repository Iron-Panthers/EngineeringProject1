package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Spark;

public class Hardware {

	Spark motor1;
	Spark motor2;
	Spark motor3;
	Spark motor4;
	
	public Hardware() {//construct hardware
		motor1 = new Spark(0);	
		motor2 = new Spark(1);
		motor3 = new Spark(2);
		motor4 = new Spark(3);

	}
}
