package frc.robot.subsystems;

import edu.wpi.first.math.Vector;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;


public class DrivetrainSubsystem extends SubsystemBase {
  private CANSparkMax frontLeft = new CANSparkMax(0, MotorType.kBrushless);
  private CANSparkMax frontLeftRotation = new CANSparkMax(1, MotorType.kBrushless);


  public DrivetrainSubsystem() {

  }

  public void oneWheelDrive(double x, double y, double r){
    Translation2d vector = new Translation2d(x + r, y + r);

    frontLeft.set(vector.getNorm()/2);
    frontLeftRotation.set(Math.atan2(x + r , y + r) / Math.PI);
  }

  public void wheelTest(double speed, double rotationSpeed){
    frontLeft.set(speed);
    frontLeftRotation.set(rotationSpeed);
  }

  @Override
  public void periodic() {
  }
}
