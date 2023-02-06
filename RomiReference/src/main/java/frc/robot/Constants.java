// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class DriveConstants{
        //Romi has the left and right motors set to 
        //PWM channels 0 and 1 respectively
        public static final int leftDriveMotor = 0;
        public static final int rightDriveMotor = 1;

        //The Romi has onboard encoders that are hardcoded
        //to use DIO pins 4/5 and 6/7 for the left and right
        public static final int leftEncoderA = 4;
        public static final int leftEncoderB = 5;
        public static final int rightEncoderA = 6;
        public static final int rightEncoderB = 7;

        public static final double kCountsPerRevolution = 1440.0;
        public static final double kWheelDiameterInch = 2.75591; // 70mm
        public static final double kWheelSpacingInch = 5.50;

        public static final double kP_drive = 0.3;
    }
}
