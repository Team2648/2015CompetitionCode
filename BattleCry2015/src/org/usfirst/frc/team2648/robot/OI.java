package org.usfirst.frc.team2648.robot;

import org.usfirst.frc.team2648.robot.commands.ArcadeDrive;
import org.usfirst.frc.team2648.robot.commands.ClawClose;
import org.usfirst.frc.team2648.robot.commands.ClawOpen;
import org.usfirst.frc.team2648.robot.commands.ElevatorDown;
import org.usfirst.frc.team2648.robot.commands.ElevatorUp;
import org.usfirst.frc.team2648.robot.commands.IntakeClose;
import org.usfirst.frc.team2648.robot.commands.IntakeOpen;
import org.usfirst.frc.team2648.robot.commands.IntakeOpenClose;
import org.usfirst.frc.team2648.robot.commands.IntakeRun;
import org.usfirst.frc.team2648.robot.commands.RunDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 * test of GitHub
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	public Joystick j1;
	public Joystick j2;
	
	
	public JoystickButton elevatorUp;
	public JoystickButton elevatorDown;
	public JoystickButton intakeIn;
	public JoystickButton intakeOut;
	public JoystickButton rightIntakeIn;
	public JoystickButton rightIntakeOut;
	public JoystickButton leftIntakeIn;
	public JoystickButton leftIntakeOut;
	public JoystickButton intakeOpenClose;
	//public JoystickButton intakeClose;
	public JoystickButton intakeOppositeRight;
	public JoystickButton intakeOppositeLeft;
	public JoystickButton clawOpen;
	public JoystickButton clawClose;
	
	private int count = 0;
	
	public OI(){
		
		j1 = new Joystick(0);
		j2 = new Joystick(1);
		
		elevatorUp = new JoystickButton(j2, 3);
		elevatorDown = new JoystickButton(j2, 1);
		intakeIn = new JoystickButton(j1, 3);
		intakeOut = new JoystickButton(j1, 5);
		rightIntakeIn = new JoystickButton(j1, 11);
		rightIntakeOut = new JoystickButton(j1, 12);
		leftIntakeIn = new JoystickButton(j1, 9);
		leftIntakeOut = new JoystickButton(j1, 10);
		intakeOpenClose = new JoystickButton(j1, 1);
		//intakeClose = new JoystickButton(j1, 2);
		intakeOppositeRight = new JoystickButton(j1, 6);
		intakeOppositeLeft = new JoystickButton(j1, 4);
		clawOpen = new JoystickButton(j2, 4);
		clawClose = new JoystickButton(j2, 5);
		
		elevatorUp.whileHeld(new ElevatorUp());
		elevatorDown.whileHeld(new ElevatorDown());
		intakeIn.whileHeld(new IntakeRun(-1, 1)); //(right direction/speed, left direction/speed)
		intakeOut.whileHeld(new IntakeRun(1, -1)); //(right direction/speed, left direction/speed)
		rightIntakeIn.whileHeld(new IntakeRun(1, 0)); //(right direction/speed, left direction/speed)
		rightIntakeOut.whileHeld(new IntakeRun(-1, 0)); //(right direction/speed, left direction/speed)
		leftIntakeIn.whileHeld(new IntakeRun(0, -1)); //(right direction/speed, left direction/speed)
		leftIntakeOut.whileHeld(new IntakeRun(0, 1)); //(right direction/speed, left direction/speed)
		intakeOpenClose.whenPressed(new IntakeOpenClose()); 
		//intakeClose.whenPressed(new IntakeClose()); 
		intakeOppositeRight.whileHeld(new IntakeRun(1,1));
		intakeOppositeLeft.whileHeld(new IntakeRun(-1, -1));
		clawOpen.whenPressed(new ClawOpen());
		clawClose.whenPressed(new ClawClose());
	}
	
	public Joystick getj1(){
		return j1;
	}
	
	public Joystick getj2(){
		return j2;
	}
}

