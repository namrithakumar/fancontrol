package org.example.fancontrol.states.speed;

import org.example.fancontrol.states.FanState;
import org.example.fancontrol.states.values.SpeedType;

public class Low implements Speed {

    private String displayName = SpeedType.LOW.label;

    public void change(FanState fanState) {
        fanState.setSpeed(new Medium());
    }

    public String getDisplayName() {
        return this.displayName;
    }
}