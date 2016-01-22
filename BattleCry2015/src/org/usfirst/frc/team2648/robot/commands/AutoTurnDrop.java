package org.usfirst.frc.team2648.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

class AutoTurnDrop extends CommandGroup {

	public AutoTurnDrop(){
		addParallel(new TimeDrive(.5, 1, 1));
		addSequential(new ElevatorDown());
	}
}
