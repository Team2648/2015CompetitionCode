package org.usfirst.frc.team2648.robot.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;


public class BOBToteAuto extends CommandGroup {

	public BOBToteAuto(){
		addSequential(new TimeDrive(.5, .5, .75));
		addSequential(new TimeDrive(-.5, .5, 2));
	}
}
