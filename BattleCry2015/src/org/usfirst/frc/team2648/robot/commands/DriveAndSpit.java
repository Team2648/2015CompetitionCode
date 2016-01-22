package org.usfirst.frc.team2648.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class DriveAndSpit extends CommandGroup {

	public DriveAndSpit(){
		//System.out.println("I Work");
		addSequential(new IntakeInStop(-.8, .8,0,0,1.5));
		addSequential(new ElevatorDownHalfSpeed());
		addSequential(new IntakeInStop(.8, -.8,-1,-1,1.));
	}
}
