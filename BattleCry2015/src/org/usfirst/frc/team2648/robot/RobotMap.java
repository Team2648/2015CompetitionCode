package org.usfirst.frc.team2648.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static Compressor comp;
	public static DigitalInput driveStop;
	
	//drive train
	public static SpeedController rightDrive;
	public static SpeedController leftDrive;
	public static RobotDrive rd;
	
	//elevator
	public static SpeedController elevator1;
	public static SpeedController elevator2;
	//public static DigitalInput elevatorStop;
	public static DigitalInput elevatorBottom;
	//public static DigitalInput elevatorTop;
	public static DigitalInput lightStep;
	
	
	//intake
	public static SpeedController rightIntake;
	public static SpeedController leftIntake;
	public static DoubleSolenoid pneuIntake;
	public static DigitalInput elevatorIntake;
	
	//bin claw
	public static DoubleSolenoid clawPneu;
	
	public static void init(){
		comp = new Compressor();
		//h
		driveStop = new DigitalInput(2);
		
		//drive train
		rightDrive = new Talon(0);
		leftDrive = new Talon(1);
		rd = new RobotDrive(rightDrive, leftDrive);
		rd.setSafetyEnabled(true);
		rd.setExpiration(0.1);
        rd.setSensitivity(0.5);
        rd.setMaxOutput(1.0);
        
		//elevator
		elevator1 = new Talon(3);
		elevator2 = new Talon(5);
		//elevatorStop = new DigitalInput(2);
		elevatorBottom = new DigitalInput(3);
		//elevatorTop = new DigitalInput(3);
		//lightStep = new DigitalInput(3);
		
		//intake
		rightIntake = new Talon(4);
		leftIntake = new Talon(2);
		pneuIntake = new DoubleSolenoid(6, 7);
		elevatorIntake = new DigitalInput(0);
		
		//bin claw
		clawPneu = new DoubleSolenoid(4,5);
	}
}
