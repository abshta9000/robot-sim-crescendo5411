// ----------------------------------------------------------------[Package]----------------------------------------------------------------//
package org.robotalons.crescendo.subsystems.drivebase;
import edu.wpi.first.math.util.Units;

import com.ctre.phoenix.sensors.Pigeon2;

import org.robotalons.lib.drivebase.DrivebaseModule;

// ---------------------------------------------------------------[Libraries]---------------------------------------------------------------//
// ---------------------------------------------------------------[Constants]---------------------------------------------------------------//
/**
 *
 *
 * <h1>Constants</h1>
 *
 * <p>Contains all robot-wide constants, does not contain subsystem specific constants.
 *
 * @see DrivebaseSubsystem
 */
public class Constants {
    // ------------------------------------------------------------[Internal]-------------------------------------------------------------//

    public static final class Chassis {

        public static final Double ROBOT_WHEEL_DIAMETER_METERS = Units.inchesToMeters((4));
        public static final Double ROBOT_WHEEL_PERIMETER_METERS = ROBOT_WHEEL_DIAMETER_METERS * Math.PI;
        public static final Double ROBOT_WIDTH_METERS = Units.inchesToMeters((27));

    }

    public static final class Ports {
        public static final Integer GYROSCOPE_ID = (0);
        public static final Integer PATHPLANNER_SERVER = (6969);        
    }

    public static final class Devices {

        public static final Pigeon2 GYROSCOPE = new Pigeon2(Ports.GYROSCOPE_ID);
        
        public static final DrivebaseModule FRONT_LEFT_MODULE = null;        
        public static final DrivebaseModule FRONT_RIGHT_MODULE = null;        
        public static final DrivebaseModule REAR_LEFT_MODULE = null;         
        public static final DrivebaseModule REAR_RIGHT_MODULE = null;
    }
}
