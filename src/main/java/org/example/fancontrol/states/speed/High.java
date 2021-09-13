package org.example.fancontrol.states.speed;

import org.example.fancontrol.states.FanState;
import org.example.fancontrol.states.values.SpeedType;

public class High implements Speed {
    private String displayName = SpeedType.HIGH.label;

    public void change(FanState fanState) {
        fanState.setSpeed(new Off());
    }

    public String getDisplayName() {
        return this.displayName;
    }
}