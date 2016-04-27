package csc495.accelerometerdemo;

import android.hardware.SensorEvent;
import android.location.Location;

/**
 * Created by Hiroshi on 4/24/2016.
 */
public class SensorProcessor {
    protected SensorEvent acceleration;
    protected SensorEvent gravity;
    protected SensorEvent gyroscope;
    protected SensorEvent rotationVector;
    protected Location currentLocation;

    public SensorProcessor(Location mLocation) {
        this.currentLocation = mLocation;
    }

    public void updateReading(
            SensorEvent acceleration,
            SensorEvent gravity,
            SensorEvent gyroscope,
            SensorEvent rotationVector
    ){
        this.acceleration = acceleration;
    }

}
