package org.usfirst.frc.team2648.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RodeoFashionShow extends CommandGroup {
    
    public  RodeoFashionShow() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multipl commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	addSequential(new TimeDrive(-.5,.45,6));
    	addSequential(new TimeDrive(0,0,1));
    	addSequential(new TimeDrive(.5,.45,1.8));
    	addSequential(new TimeDrive(0,0,1));
    	addSequential(new TimeDrive(-.5,.45,6));
    	addSequential(new TimeDrive(0,0,1));
    	addSequential(new TimeDrive(.5,.45,10));
    	//addSequential(new TimeDrive(0,0,1));
    	//addSequential(new IntakeOpen());
    	//addSequential(new TimeDrive(0,0,1));
    	//addSequential(new IntakeClose());
    	addSequential(new TimeDrive(0,0,1));
    	addSequential(new TimeDrive(-.5,-.45,5));
    }
}
