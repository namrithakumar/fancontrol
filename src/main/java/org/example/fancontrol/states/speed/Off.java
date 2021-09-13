package org.example.fancontrol.states.speed;

import org.example.fancontrol.states.FanState;
import org.example.fancontrol.states.values.SpeedType;

public class Off implements Speed {

    private String displayName = SpeedType.OFF.label;

    public void change(FanState fanState) {
        fanState.setSpeed(new Low());
    }

    public String getDisplayName() {
        return this.displayName;
    }
}