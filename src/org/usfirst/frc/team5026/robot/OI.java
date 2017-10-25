package org.usfirst.frc.team5026.robot;

import org.usfirst.frc.team5026.robot.commands.Clockwise;
import org.usfirst.frc.team5026.robot.commands.CounterClockwise;
import org.usfirst.frc.team5026.robot.commands.IntakeCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Joystick stick;
	Button StickBtnOne; //trigger
	Button StickBtnTwo; //side button
	Button StickBtnThree; 
	
	public void mapButtons() {
		StickBtnOne.whileHeld(new IntakeCommand());
		StickBtnTwo.whileHeld(new CounterClockwise());
		StickBtnThree.whileHeld(new Clockwise());

	}
	
	public OI(){ //constructor - setting variables to buttons
		stick = new Joystick(0);
		StickBtnOne = new JoystickButton(stick,1);
		StickBtnTwo = new JoystickButton(stick,2);
		StickBtnThree = new JoystickButton(stick,3);
	}
}
