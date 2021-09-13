package org.example.fancontrol.states.speed;

import org.example.fancontrol.states.FanState;

public interface Speed {
    public abstract void change(FanState fanState);
    public abstract String getDisplayName();
}