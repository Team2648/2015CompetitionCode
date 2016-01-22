package org.usfirst.frc.team2648.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ElevatorIntake extends CommandGroup {
    
    public  ElevatorIntake() {
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
    	addParallel(new ElevatorUpStop()); //run elevator up to limit switch
    	addSequential(new IntakeOutTime(.15, -.5,.5)); //run intake out and drive straight (time, right direction/speed, left direction/speed)
    }
}
