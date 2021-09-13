package org.example.fancontrol.states.direction;

import org.example.fancontrol.states.FanState;

public interface Direction {
    public abstract void change(FanState fanState);
    public abstract String getDisplayName();
}