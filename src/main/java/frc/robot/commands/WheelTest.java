// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DrivetrainSubsystem;

public class WheelTest extends Command {
  private DoubleSupplier speed;
  private DoubleSupplier rotationSpeed;
  private DrivetrainSubsystem drive;
  /** Creates a new WheelTest. */
  public WheelTest(DoubleSupplier speed, DoubleSupplier rotationSpeed, DrivetrainSubsystem drive) {
    this.speed = speed;
    this.rotationSpeed = rotationSpeed;
    this.drive = drive;
    addRequirements(drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drive.wheelTest(speed.getAsDouble(), rotationSpeed.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
