// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6398.myRobot1;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Ultrasonic;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainspark0;
    public static SpeedController driveTrainspark1;
    public static SpeedController driveTrainspark2;
    public static SpeedController driveTrainspark3;
    public static RobotDrive driveTrainRobotDrive41;
    public static Ultrasonic driveTrainrangeFinder;
    public static Compressor fuelRampcompressor;
    public static DoubleSolenoid fuelRampdoubleSolenoid;
    public static SpeedController climberspark4;
    public static Encoder climberQuadratureEncoder1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainspark0 = new Spark(0);
        LiveWindow.addActuator("driveTrain", "spark0", (Spark) driveTrainspark0);
        
        driveTrainspark1 = new Spark(1);
        LiveWindow.addActuator("driveTrain", "spark1", (Spark) driveTrainspark1);
        
        driveTrainspark2 = new Spark(2);
        LiveWindow.addActuator("driveTrain", "spark2", (Spark) driveTrainspark2);
        
        driveTrainspark3 = new Spark(3);
        LiveWindow.addActuator("driveTrain", "spark3", (Spark) driveTrainspark3);
        
        driveTrainRobotDrive41 = new RobotDrive(driveTrainspark0, driveTrainspark1,
              driveTrainspark2, driveTrainspark3);
        
        driveTrainRobotDrive41.setSafetyEnabled(true);
        driveTrainRobotDrive41.setExpiration(0.1);
        driveTrainRobotDrive41.setSensitivity(0.5);
        driveTrainRobotDrive41.setMaxOutput(1.0);
        driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        driveTrainrangeFinder = new Ultrasonic(2, 3);
        LiveWindow.addSensor("driveTrain", "rangeFinder", driveTrainrangeFinder);
        
        fuelRampcompressor = new Compressor(0);
        
        
        //Warning, the two modules in robot builder are different!
fuelRampdoubleSolenoid = new DoubleSolenoid(0, 1);
        LiveWindow.addActuator("fuelRamp", "doubleSolenoid", fuelRampdoubleSolenoid);
        
        climberspark4 = new Spark(4);
        LiveWindow.addActuator("climber", "spark4", (Spark) climberspark4);
        
        climberQuadratureEncoder1 = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("climber", "Quadrature Encoder 1", climberQuadratureEncoder1);
        climberQuadratureEncoder1.setDistancePerPulse(1.0);
        climberQuadratureEncoder1.setPIDSourceType(PIDSourceType.kRate);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
