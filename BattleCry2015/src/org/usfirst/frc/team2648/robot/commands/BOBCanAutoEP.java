package org.usfirst.frc.team2648.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class BOBCanAutoEP extends CommandGroup {

	public BOBCanAutoEP() {
		addSequential(new IntakeInStop(-0.3,0.3,1.0,-1.0,1));
		addSequential(new IntakeInStop(0.,0.,1.0,-1.0,1));
		addSequential(new AutoElevatorUp(2.5));
		addSequential(new TimeDrive(.5, -.5, 1));
	}
}
