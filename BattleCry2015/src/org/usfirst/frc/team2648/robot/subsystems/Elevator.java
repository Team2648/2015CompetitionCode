package org.usfirst.frc.team2648.robot.subsystems;

import org.usfirst.frc.team2648.robot.Robot;
import org.usfirst.frc.team2648.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {
	SpeedController elevator1 = RobotMap.elevator1;
	SpeedController elevator2 = RobotMap.elevator2;
	//DigitalInput elevatorStop = RobotMap.elevatorStop;
	DigitalInput elevatorBottom = RobotMap.elevatorBottom;
	//DigitalInput elevatorTop = RobotMap.elevatorTop;
	DigitalInput elevatorIntake = RobotMap.elevatorIntake;
	DigitalInput lightStep = RobotMap.lightStep;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void elevateDown(double pow){
    	if(elevatorBottom.get()){
    		elevator1.set(-pow); //if not touching top or bottom limit switch, set value of elevator
    		elevator2.set(-pow);
    	}
    	else{
    		elevator1.set(0); //if hitting limit switch stop elevator
    		elevator2.set(0);
    	}
    }
    public void elevateDown(){
    	if(elevatorBottom.get()){
    		elevator1.set(-1); //if not touching top or bottom limit switch, set value of elevator
    		elevator2.set(-1);
    	}
    	else{
    		elevator1.set(0); //if hitting limit switch stop elevator
    		elevator2.set(0);
    	}
    	
    	//if(elevatorIntake.get()){
    	//	Robot.pneu.openIntake();
    	//}
    }
    
    public void elevateUp(){
    	elevator1.set(1);
    	elevator2.set(1);
    }
    
    public void stop(){
    	elevator1.set(0);
    	elevator2.set(0);
    }
 
}