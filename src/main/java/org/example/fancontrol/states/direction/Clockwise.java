package org.example.fancontrol.states.direction;

import org.example.fancontrol.states.FanState;
import org.example.fancontrol.states.values.DirectionType;

public class Clockwise implements Direction {
    private String displayName = DirectionType.CLOCKWISE.label;

    public void change(FanState fanState) {
        fanState.setDirection(new CounterClockwise());
    }

    public String getDisplayName() {
        return this.displayName;
    }
}