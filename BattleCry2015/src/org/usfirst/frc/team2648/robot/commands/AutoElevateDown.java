package org.usfirst.frc.team2648.robot.commands;

import org.usfirst.frc.team2648.robot.Robot;
import org.usfirst.frc.team2648.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoElevateDown extends Command {

    public AutoElevateDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.elevator.elevateDown(-1); //run elevator down until hit limit switch
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return RobotMap.elevatorBottom.get(); //when hit bottom limit switch
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.elevator.stop(); //when hit limit switch stop elevator
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
