package org.usfirst.frc.team2648.robot.commands;

import org.usfirst.frc.team2648.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeOutTime extends Command {

	double rightDrive;
	double leftDrive;
    public IntakeOutTime(double time, double rd, double ld) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.intake);
    	requires(Robot.driveTrain);
    	setTimeout(time); //start timer
    	rightDrive = rd; //set right direction/speed
    	leftDrive = ld; //set left direction/speed
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.runDriveTrain(rightDrive, leftDrive); //start drive to right/left values
    	Robot.intake.runIntake(-1, 1); //start intake (right, left)
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut(); //when timed out stop
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.stop(); //when timed out stop drive
    	Robot.intake.runIntake(0, 0); //when timed out stop intake
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
