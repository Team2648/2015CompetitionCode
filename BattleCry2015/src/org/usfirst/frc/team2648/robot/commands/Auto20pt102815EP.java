package org.usfirst.frc.team2648.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Auto20pt102815EP extends CommandGroup {

	public Auto20pt102815EP() {
		// TODO Auto-generated constructor stub  
		addSequential(new AutoElevatorUp(2.5));
		//addSequential(new IntakeInStop(0, 0, -1, -1, .1));
		addSequential(new IntakeInStop(-.4, .4,-1,-1,1.5));
		addSequential(new IntakeInStopOnTote(-.5,.5,.3));
		//addSequential(new TimeDrive(1, -1, .1));
		///addSequential(new IntakeInStopOnTote(-.3,.3));
		addSequential(new ElevatorDownStop());
		addSequential(new AutoElevatorUp(2.9));
		addSequential(new IntakeInStop(-.55, .55,-1,-1,1.5));
		/*addSequential(new IntakeOpen());
		addSequential(new IntakeInStop(-.5, .5,-1,1,.5));
		addSequential(new IntakeClose());*/
		addSequential(new IntakeInStopOnTote(-.75,.75,0.2));
		//addSequential(new IntakeInStopOnTote(-.35, .35));
		//addSequential(new ElevatorDownStop());
		//addSequential(new TimeDrive(1, -.5,2));
		addSequential(new AutoTurnDrop());
		addSequential(new DriveAndSpit());
	}

	public Auto20pt102815EP(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
