package org.usfirst.frc.team2648.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class Auto90 extends Command {

	public Auto90() {
		// TODO Auto-generated constructor stub
	}

	public Auto90(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Auto90(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	public Auto90(String name, double timeout) {
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
		new TimeDrive(1, .5, 2);
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
