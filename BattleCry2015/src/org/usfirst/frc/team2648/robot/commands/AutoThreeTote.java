package org.usfirst.frc.team2648.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoThreeTote extends CommandGroup {
    
    public  AutoThreeTote() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	Timer.delay(.005);
    	//addSequential(new IntakeInStop(-.5, .5)); //run intake in and drive straight
    	Timer.delay(.005);
    	addSequential(new ElevatorIntake()); //run elevator up to limit switch
    										 //run intake out and drive straight (time, right direction/speed, left direction/speed)
    	//addSequential(new IntakeInStop(-.5, .5)); //run intake in and drive straight (right direction/speed, left direction/speed)
    	addSequential(new ElevatorDownStop()); //run elevator down to limit switch
    	addSequential(new ElevatorIntake());  //run elevator up to limit switch
    	 									  //run intake out and drive straight (time, right direction/speed, left direction/speed)
    	//addSequential(new IntakeInStop(-.5, .5)); //run intake in and drive straight (right direction/speed, left direction/speed)
    	addSequential(new ElevatorDownStop()); //run elevator down to limit switch
    	//addSequential(new ElevatorUpStop(.1)); //run elevator up to limit switch
    	addSequential(new RunDrive(-1, -1)); //turn drive train (right direction/speed, left direction/speed)
    	addSequential(new RunDrive(-1, 1)); //run drive train straight forward (right direction/speed, left direction/speed)
    	addSequential(new RunDrive(-1, -1)); //turn drive train (right direction/speed, left direction/speed)
    	addSequential(new ElevatorDownStop()); //run elevator down to limit switch
    	addSequential(new IntakeOutTime(.1, 0, 0));//run intake out and drive straight (time, right direction/speed, left direction/speed)
    	addSequential(new RunDrive(1, -1)); // run drive train straight back (right direction/speed, left direction/speed)
    }
}
