// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team6665.robot.commands;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6665.robot.Robot;

/**
 *
 */
public class AutonomousCommand extends Command {
	
	private Timer timer;
	//private double time;
	 private String gameData;
	 private int side;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public AutonomousCommand() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
        System.err.println("autoInit ran");
        timer = new Timer();
        timer.start();
      side= 1; // 1 is Left, 2 is right
    gameData= DriverStation.getInstance().getGameSpecificMessage();
        // time = 0;
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	
    	if(timer.get()<= 3) {
    	   System.err.println("autoEx ran");
        
           Robot.driveTrain.differentialDrive1.arcadeDrive(-0.6,0);//drive "forward"
        						// (speed/output from motor,rotation angle)
        }
	   else if(timer.get()<= 5) {Robot.driveTrain.differentialDrive1.arcadeDrive(0,0.6);//turn right?
				     
        }
	   else if(timer.get()<= 7) {Robot.driveTrain.differentialDrive1.arcadeDrive(-0.6,0);//drive "forward"
        						// (speed/output from motor,rotation angle)
	}
	   else if(timer.get()<= 9) {Robot.driveTrain.differentialDrive1.arcadeDrive(0,0.6);//turn right?
        						// (speed/output from motor,rotation angle)
        }
	   else if(timer.get()<= 12) {Robot.driveTrain.differentialDrive1.arcadeDrive(-0.6,0);//drive "forward"
        						// (speed/output from motor,rotation angle)
        }
	   else if(timer.get()<= 14) {Robot.driveTrain.differentialDrive1.arcadeDrive(0,0.6);//turn right?
        						// (speed/output from motor,rotation angle)
        }
	   else if(timer.get()<= 16) {Robot.driveTrain.differentialDrive1.arcadeDrive(-0.6,0);//drive "forward"
        						// (speed/output from motor,rotation angle)
        }
	   else if(timer.get()<= 18) {Robot.driveTrain.differentialDrive1.arcadeDrive(0,0.6);//turn right?
        						// (speed/output from motor,rotation angle)
        }
	    else {Robot.driveTrain.differentialDrive1.arcadeDrive(0,0);//stop
		 }
		
    }  //end v. execute
     

    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}
