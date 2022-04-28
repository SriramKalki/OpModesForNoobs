//AutonHeadingExample by SriramKalki @ Team 6547 :)
package org.firstinspires.ftc.teamcode.FieldRelativeExample;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class AutonHeadingExample extends LinearOpMode {
    private BNO055IMU imu;
    //create other variables based on what hardware you have (like private DcMotor rightFront;)
    public void runOpMode(){
        imu = hardwareMap.get(BNO055IMU.class, "imu");
        //create other hardware mappings (like rightFront = hardwareMap.get(DcMotor.class, "rightFront");
        if(isStopRequested()) return;
        waitForStart();

        //All auton code goes here





        //at the end of the auton
        //send value to the static field
        StaticField.autonHeading = imu.getAngularOrientation().firstAngle;
        //depending on your control hub orientation you may need to change this. Our CHub is mounted vertically and
        //we use the firstAngle for example
    }
}
