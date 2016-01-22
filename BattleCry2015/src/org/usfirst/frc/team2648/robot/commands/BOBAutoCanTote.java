package org.usfirst.frc.team2648.robot.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;


public class BOBAutoCanTote extends CommandGroup {

	public BOBAutoCanTote(){
		addSequential(new IntakeInStop(-0.3,0.3,1.0,-1.0,1));
		addSequential(new AutoElevatorUp(2.5));
		addSequential(new IntakeInStopOnTote(-.5, .5, 0));
		addSequential(new TimeDrive(.5, .5, .75));
		addSequential(new TimeDrive(-.5, .5, 2));
	}
}
