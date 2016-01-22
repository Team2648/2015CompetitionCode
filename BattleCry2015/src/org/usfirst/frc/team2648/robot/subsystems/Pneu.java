package org.usfirst.frc.team2648.robot.subsystems;

import org.usfirst.frc.team2648.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneu extends Subsystem {
	DoubleSolenoid clawPneu = RobotMap.clawPneu;
	DoubleSolenoid pneuIntake = RobotMap.pneuIntake;
	Compressor comp = RobotMap.comp;
	private int count = 0;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void startComp(){
    	comp.start(); //start compressor
    }
    
    public void openClaw(){
    	clawPneu.set(DoubleSolenoid.Value.kForward); //change direction of claw solenoid to open
    }
    
    public void closeClaw(){
    	clawPneu.set(DoubleSolenoid.Value.kReverse); //change direction of claw solenoid to close
    }
    
    public void openIntake(){
    	pneuIntake.set(DoubleSolenoid.Value.kForward); //change direction of intake solenoid to open
    }
    
    public void closeIntake(){
    	pneuIntake.set(DoubleSolenoid.Value.kReverse); //change direction of intake solenoid to close
    }
    
    public void openCloseIntake(){
    	System.out.println(count);
    	if(count%2 == 0){
    		openIntake();
    	}
    	else
    		closeIntake();
    	
    	count++;
    }
    
    
}

