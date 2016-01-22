
package org.usfirst.frc.team2648.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team2648.robot.commands.Auto20pt102815EP;
import org.usfirst.frc.team2648.robot.commands.AutoDrive;
import org.usfirst.frc.team2648.robot.commands.AutoElevatorUp;
import org.usfirst.frc.team2648.robot.commands.AutoThreeTote;
import org.usfirst.frc.team2648.robot.commands.AutoUpDrive;
import org.usfirst.frc.team2648.robot.commands.BOBAutoCanTote;
import org.usfirst.frc.team2648.robot.commands.BOBCanAutoEP;
import org.usfirst.frc.team2648.robot.commands.BOBToteAuto;
import org.usfirst.frc.team2648.robot.commands.DriveAndSpit;
import org.usfirst.frc.team2648.robot.commands.IntakeInStop;
import org.usfirst.frc.team2648.robot.commands.RodeoFashionShow;
import org.usfirst.frc.team2648.robot.commands.TimeDrive;
import org.usfirst.frc.team2648.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2648.robot.subsystems.Elevator;
import org.usfirst.frc.team2648.robot.subsystems.Intake;
import org.usfirst.frc.team2648.robot.subsystems.Pneu;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;
	public static DriveTrain driveTrain;
	public static Elevator elevator;
	public static Intake intake;
	public static Pneu pneu;

    Command autonomousCommand;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	RobotMap.init();
		driveTrain = new DriveTrain();
		elevator = new Elevator();
		intake = new Intake();
		pneu = new Pneu();
		oi = new OI();
        // instantiate the command used for the autonomous period
        //autonomousCommand = new AutoThreeTote();
		//autonomousCommand = new AutoDrive();
		//autonomousCommand = new AutoUpDrive();
		//autonomousCommand = new RodeoFashionShow();
		autonomousCommand = new BOBCanAutoEP();
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
