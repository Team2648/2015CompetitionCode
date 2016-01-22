package org.usfirst.frc.team2648.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class BOBCanAutoZone extends CommandGroup {

	public BOBCanAutoZone() {
		addSequential(new IntakeInStop(-0.3,0.3,1.0,-1.0,1));
		addSequential(new AutoElevatorUp(2.5));
		addSequential(new TimeDrive(.7, -.4, 2.5));
	}
}