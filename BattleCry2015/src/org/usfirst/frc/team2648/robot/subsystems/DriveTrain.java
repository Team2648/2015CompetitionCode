package org.usfirst.frc.team2648.robot.subsystems;

import org.usfirst.frc.team2648.robot.Robot;
import org.usfirst.frc.team2648.robot.RobotMap;
import org.usfirst.frc.team2648.robot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	SpeedController rightDrive = RobotMap.rightDrive;
	SpeedController leftDrive = RobotMap.leftDrive;
	RobotDrive rd = RobotMap.rd;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ArcadeDrive());
    }
    
    public void drive(){
    	rd.arcadeDrive((.85)*Robot.oi.j1.getY(), -(.85)*Robot.oi.j1.getX()); 
    }
    
    public void stop(){
    	rd.stopMotor();
    }
    
    public void runDriveTrain(double right, double left){
    	rightDrive.set(right); //set value of right side
    	leftDrive.set(left); //set value of left side
    }
}

