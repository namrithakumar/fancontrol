package org.example.fancontrol.states.direction;

import org.example.fancontrol.states.FanState;
import org.example.fancontrol.states.values.DirectionType;

public class CounterClockwise implements Direction {
    private String displayName = DirectionType.COUNTERCLOCKWISE.label;

    public void change(FanState fanState) {
        fanState.setDirection(new Clockwise());
    }

    public String getDisplayName() {
        return this.displayName;
    }
}