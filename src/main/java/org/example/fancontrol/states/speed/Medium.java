package org.example.fancontrol.states.speed;

import org.example.fancontrol.states.FanState;
import org.example.fancontrol.states.values.SpeedType;

public class Medium implements Speed {
    private String displayName = SpeedType.MEDIUM.label;

    public void change(FanState fanState) {
        fanState.setSpeed(new High());
    }

    public String getDisplayName() {
        return this.displayName;
    }
}