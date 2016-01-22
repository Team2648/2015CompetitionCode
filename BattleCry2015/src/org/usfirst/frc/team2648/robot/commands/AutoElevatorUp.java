package org.usfirst.frc.team2648.robot.commands;

import org.usfirst.frc.team2648.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AutoElevatorUp extends Command {

	public AutoElevatorUp(double time) {
		// TODO Auto-generated constructor stub
		requires(Robot.elevator);
		setTimeout(time);
	}

	public AutoElevatorUp(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/*public AutoElevatorUp(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}*/

	public AutoElevatorUp(String name, double timeout) {
		super(name, timeout);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.elevator.elevateUp();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.elevator.stop();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		end();
	}

}
