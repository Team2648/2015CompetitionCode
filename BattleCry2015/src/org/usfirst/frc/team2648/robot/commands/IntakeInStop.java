package org.usfirst.frc.team2648.robot.commands;

import org.usfirst.frc.team2648.robot.Robot;
import org.usfirst.frc.team2648.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeInStop extends Command {

	double rightDrive;
	double leftDrive;
	double leftIntake;
	double rightIntake;
    public IntakeInStop(double rd, double ld,double rI,double lI ,double time) {
    	setTimeout(time);
    	// Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.intake);
    	requires(Robot.driveTrain);
    	rightDrive = rd; //set value of right direction/speed
    	leftDrive = ld; //set value of left direction/speed
    	leftIntake = lI;
    	rightIntake = rI;
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.intake.runIntake(leftIntake, rightIntake); //run intake full speed
    	Robot.driveTrain.runDriveTrain(rightDrive, leftDrive); //start drive train with right/left drive values
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //return !RobotMap.driveStop.get(); //when tote hit limit switch stop
    	return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.intake.runIntake(0, 0); //when hit limit switch stop intake
    	Robot.driveTrain.stop(); //when hit limit switch stop drive train
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
